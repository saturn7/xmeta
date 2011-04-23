package xm.input;

import java.util.ArrayList;
import java.util.List;

public class InputNode {
	public InputNode() {
		children = new ArrayList<InputNode>();
	}

	InputID id;
	List<InputNode> children;

	public InputID getID() {
		return id;
	}

	public void setID(InputID id) {
		this.id = id;
	}
	
	public List<InputNode> getChildren() {
		return children;
	}
	
	//helper functions
	public String getName() {
		return id.getName();
	}
	
	public boolean hasName(String name) {
		return (id.getName().equals(name));
	}
	
	public InputNode getChild(int index) {
		return children.get(index);
	}
	
	public String toString() {
		if (children.size() == 0) {
			return id.toString();
		} else if (children.size() == 1) {
			return id.toString() + "(" + children.get(0) + ")";
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append(id.toString());
			builder.append("(");
			int i=0;
			for (InputNode child: children) {
				if (i>0) {
					builder.append(", ");
				}
				++i;
				builder.append(child.toString());
			}
			builder.append(")");
			return builder.toString();
		}
	}
}
