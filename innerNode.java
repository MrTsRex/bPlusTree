import java.util.ArrayList;
import java.util.List;


public class innerNode extends genericNode {

	// m nodes
	protected ArrayList<genericNode> childList; // m+1 childList

	public innerNode(Double key, genericNode child0, genericNode child1) {
		LeafNodeCheck = false;
		keyList = new ArrayList<Double>();
		keyList.add(key);
		childList = new ArrayList<genericNode>();
		childList.add(child0);
		childList.add(child1);
	}

	public innerNode(List<Double> newKeys, List<genericNode> newChildren) {
		LeafNodeCheck = false;

		keyList = new ArrayList<Double>(newKeys);
		childList = new ArrayList<genericNode>(newChildren);

	}

	/**
	 * insert the entry into this node at the specified index so that it still
	 * remains sorted
	 * 
	 * @param dict
	 * @param index
	 */
	public void InsertAndSort(myDict dict, int index) {
		Double key = dict.key;
		genericNode child = dict.Node;
		if (index >= keyList.size()) {
			keyList.add(key);
			childList.add(child);
		} else {
			keyList.add(index, key);
			childList.add(index+1, child);
		}
	}

}
