import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class leaf extends genericNode {
	protected ArrayList<String> valueList;
	protected leaf leafNext;
	protected leaf leafPrevious;

	public leaf(Double firstKey, String firstValue) {
		LeafNodeCheck = true;
		keyList = new ArrayList<Double>();
		valueList = new ArrayList<String>();
		keyList.add(firstKey);
		valueList.add(firstValue);

	}

	public leaf(List<Double> newKeys, List<String> newValues) {
		LeafNodeCheck = true;
		keyList = new ArrayList<Double>(newKeys);
		valueList = new ArrayList<String>(newValues);

	}

	/**
	 * This method inserts key/value pair into the leaf and keeps it sorted
	 * @param key
	 * @param value
	 *
	 */
	public void InsertAndSort(Double key, String value) {

		if (key.compareTo(keyList.get(0)) < 0) {
			keyList.add(0, key);
			valueList.add(0, value);
		} else if (key.compareTo(keyList.get(keyList.size() - 1)) > 0) {
			keyList.add(key);
			valueList.add(value);
		} else {
			ListIterator<Double> iterator = keyList.listIterator();
			while (iterator.hasNext()) {
				if (iterator.next().compareTo(key) > 0) {
					int position = iterator.previousIndex();
					keyList.add(position, key);
					valueList.add(position, value);
					break;
				}
			}

		}
	}

}
