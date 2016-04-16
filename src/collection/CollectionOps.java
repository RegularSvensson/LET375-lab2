/**
 * 
 * @author Mona Khoshoi, Elias Svensson
 * @since 14-04-16 
 * Email: khoshoimona@gmail.com, elias.svensson.1992@gmail.com
 *
*/
package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class CollectionOps {
	/**
	 * Prints a collection to screen
	 * @param l collection of a type with method toString
	 */
    // Put your code for print here ... 
    public static <T> void print(Collection<T> l){
    	// declare and initialize an iterator
    	Iterator<T> iterator = l.iterator();
    	// declare a string
    	String str;
    	str = "[";
    	// iterate over collection and add to string
    	while(iterator.hasNext()){
    		str += iterator.next().toString();
    		if(iterator.hasNext()){
    			str += ", ";
    		}
    	} 
    	str += "]";
    	// print string to screen
    	System.out.println(str);
    	
    }
    // Put your code for reverse here ...
    /**
     * Returns a reveres collection
     * @param l collection
     * @return reversed collection reference
     */
    public static <T> List<T> reverse(List<T> l){
    	// iterate over first half of elements in l collection
    	for(int i = 0; i < l.size()/2; i++){
    		// store index of element to swap places with
    		int j = l.size() - 1 - i;
    		// swap places in list for elements i and j
    		T tempDataPoint = l.get(i);
    		l.set(i, l.get(j));
    		l.set(j, tempDataPoint);
    	}
    	// return reference to reversed collection
    	return l;
    }
    // Put your code for less here ...
    /**
     * Returns true if every element in a collection c1 is
     * strict less than every element in a collection c2.
     * Else, returns false.
     * @param c1 collection
     * @param c2 collection
     * @param comp comparator
     * @return
     */
    public static <T> boolean less(Collection<T> c1, Collection<T> c2, Comparator<T> comp){
    	// call compare-method and max-, min-methods from Collections check elements
    	return comp.compare(Collections.max(c1, comp), Collections.min(c2, comp)) < 0;
    }
    // Example
    public static <T,R> Collection<R>
    map(Function<T,R> f,Collection<T> c) 
    {
        // Determine the dynamic type of the collection
        Class<? extends Collection> cls = c.getClass();
        try {
            // Create an object of the same dynamic type as c
            Collection<R> result = (Collection<R>)cls.newInstance();
            // type.cast(type.newInstance());
            // Copy the elements and apply op to them
            for ( T x : c )
                result.add(f.apply(x));
            return result;   
        }   
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Put your code for filter here ...
    public static <T> Collection<T> filter(Predicate<T> f, Collection<T> c){
    	// Determine which dynamic type the collection c has
    	Class<? extends Collection> collection = c.getClass();
    	try{
    		// Add output collection of same dynamic type as c
    		Collection<T> output = (Collection<T>) collection.newInstance();
    		//iterate over elements in c
    		for(T element : c){
    			// check predicate test
    			if(f.test(element)){
    				// add element to output collection
    				output.add(element);
    			}
    		}
    		// return output collection
    		return output;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
}
