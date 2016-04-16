package collection;

public class isEven implements Predicate<Integer> {
	/**
	 * Returns true if integer is even. Else returns false.
	 * @Override
	 * @return true or false
	 */
	public boolean test(Integer x) {
		return x % 2 == 0;
	}

}
