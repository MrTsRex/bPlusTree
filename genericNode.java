import java.util.ArrayList;

/**
 * A generic Node class with instances containing an arraylist of keys and a boolean to check if it's a leaf node.
 *
 */
public class genericNode {
	protected boolean LeafNodeCheck;
	protected ArrayList<Double> keyList;

	public boolean OverflowCheck() {
		return keyList.size() > bPlusTree.O;
	}
}
