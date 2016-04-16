/**
 * Assignment 1
 * @author Mona Khoshoi, Elias Svensson
 * @since 14-04-16 
 * Email: khoshoimona@gmail.com, elias.svensson.1992@gmail.com
 *
 * @param <T>
 */

package collection;

public class SingleBuffer<T> {
	// declare dataPoint
	private T dataPoint = null;
	
	/**
	 * Removes and returns element from the buffer
	 * @return tempDataPoint
	 */
	public T get(){
		// Save value of dataPoint in tempDataPoint
		T tempDataPoint;
		tempDataPoint = dataPoint;
		// Empty the element
		dataPoint = null;
		// return the element
		return tempDataPoint;
	}
	/**
	 * Stores a value in the buffer if buffer is not full
	 * @param value
	 * @return true or false
	 */
	public boolean put(T value){
		// Check if buffer is not full
		if (!is_full()){
			// Store value in buffer 
			dataPoint = value;
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Return true if buffer is full, else returns false
	 * @return true or false
	 */
	public boolean is_full(){
		return !(dataPoint == null);
	}
	/**
	 * Test for SingleBuffer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleBuffer<Integer> b = new SingleBuffer<Integer>(); 
		Integer x,y;
		boolean result; 
		result = b.put(123); 
		System.out.println(result);
		result = b.put(456); 
		System.out.println(result);
		x = b.get();
		System.out.println(x);
		result = b.put(456); 
		System.out.println(result);
		x = b.get();
		System.out.println(x);
		y = b.get();
		System.out.println(y);
	}
}
