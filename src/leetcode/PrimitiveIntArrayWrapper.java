package leetcode;

/**
 * Helper Class for Problem26
 * 
 * @author Laurent
 *
 */
public class PrimitiveIntArrayWrapper {
	private int array[];

	public PrimitiveIntArrayWrapper(int array[]) {
		this.array = array;
	}

	public int[] getArray() {
		return this.array;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		for (int i = 0; i < array.length; i++) {
			hash += 31 * hash + array[i];
		}
		return hash;
	}

	@Override
	public boolean equals(Object a) {
		if (!(a instanceof PrimitiveIntArrayWrapper))
			return false;
		if (this.array.length != ((PrimitiveIntArrayWrapper) a).array.length)
			return false;
		for (int i = 0; i < array.length; i++)
			if (array[i] != ((PrimitiveIntArrayWrapper) a).array[i])
				return false;
		return true;
	}
}