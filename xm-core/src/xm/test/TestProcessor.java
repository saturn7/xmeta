package xm.test;

import xm.input.InputNode;
import xm.proc.IProcessor;

public class TestProcessor implements IProcessor {
	public void init(String localDirectory) {
		
	}

	public void processNode(InputNode node) {
		System.out.println(node.toString());
	}

	public void complete() {
	}

}
