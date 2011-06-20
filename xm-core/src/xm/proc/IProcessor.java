package xm.proc;

import xm.input.InputNode;

public interface IProcessor {
	/**
	 * 
	 * @param directory the directory to load more files from
	 */
	void init(String directory);
	void processNode(InputNode node);
	void complete();
}
