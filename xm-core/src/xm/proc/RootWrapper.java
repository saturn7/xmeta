package xm.proc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import xm.input.InputNode;
import xm.input.antlr.inputLexer;
import xm.input.antlr.inputParser;

public class RootWrapper {
	public static void ProcessRootFile(String fileName) {
		try {
			//Load root file
			File fileDescription = new File(fileName);
			String localDirectory = fileDescription.getParentFile().getPath();
			FileInputStream fileStream = new FileInputStream(fileDescription);
			inputLexer lexer = new inputLexer(new ANTLRInputStream(fileStream));
			inputParser parser = new inputParser(new CommonTokenStream(lexer));
			InputNode node = parser.root();
			fileStream.close();
			//Create RootProcessor
			RootProcessor processor = new RootProcessor();
			processor.init(localDirectory);
			for (InputNode child: node.getChildren()) {
				processor.processNode(child);
			}
			processor.complete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
