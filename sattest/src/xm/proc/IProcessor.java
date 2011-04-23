package xm.proc;

import xm.input.InputNode;

public interface IProcessor {
	void init();
	void processNode(InputNode node);
	void complete();
}
