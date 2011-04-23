package xm.proc;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import xm.input.InputNode;
import xm.input.antlr.inputLexer;
import xm.input.antlr.inputParser;

public class RootProcessor implements IProcessor {
	String directory;
	String processorClassName;
	List<String> fileNames = new ArrayList<String>();
	//list of root nodes of file
	List<InputNode> nodes = new ArrayList<InputNode>();
	
	public RootProcessor(String directory) {
		this.directory = directory;
	}
	
	public void init() {
	}
	
	public void processNode(InputNode node) {
		if (node.hasName("processor")) {
			processorClassName = node.getChild(0).getName();
		} else if (node.hasName("file")) {
			fileNames.add(node.getChild(0).getName());
		}
	}

	public void complete() {
		try {
			//load processor
			Class<?> processorClass = ClassLoader.getSystemClassLoader().loadClass(processorClassName);
			IProcessor processor = (IProcessor)processorClass.newInstance();

			//load files
			for (String fileName: fileNames) {
				FileInputStream file = new FileInputStream(directory + File.separatorChar + fileName);
				inputLexer lexer = new inputLexer(new ANTLRInputStream(file));
				inputParser parser = new inputParser(new CommonTokenStream(lexer));
				InputNode node = parser.root();
				nodes.add(node);
				file.close();
			}
			
			//init processor
			processor.init();
			
			//process child nodes of individual root nodes
			for (InputNode node: nodes) {
				for (InputNode childNode: node.getChildren())
				{
					processor.processNode(childNode);
				}
			}
			
			//complete processor
			processor.complete();
			
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

}
