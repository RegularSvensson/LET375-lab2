package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;

import collection.*;
import static collection.CollectionOps.*; // Use static methods without the "Collection." prefix

public class Main {
    public static void main(String[] args) {    
         ArrayList<String> names = new ArrayList<String>();

         // Test print for an empty list
         print(names); System.out.println();

         // Test print for a list containing one element
         names.add("a");
         print(names); System.out.println();

         // Test print for a list containing more than one element
         names.add("b");
         names.add("c");
         print(names); System.out.println();

         // Test the return value from reverse
         print(reverse(names));
         System.out.println();


         // Test that reverse mutates its argument
         print(names);
         System.out.println();

         // Assignment 4: Write code to test less here 
         IntegerComparator intcomp = new IntegerComparator(); 
         StringComparator stringcomp = new StringComparator();
         List<Integer> li1 = Arrays.asList(4, 2, 5, 1, 3);
         List<Integer> li2 = Arrays.asList(8, 6, 7, 9);
         List<Integer> li3 = Arrays.asList(97, 5, 123,18);
         List<String> johanneberg = Arrays.asList("HC2", "ED", "HC3");
         List<String> lindholmen = Arrays.asList("Saga", "Svea", "Jupiter");
         
         boolean answer1 = CollectionOps.less(li1,li2,intcomp);
         boolean answer2 = CollectionOps.less(li1,li3,intcomp);
         boolean answer3 = CollectionOps.less(johanneberg,lindholmen,stringcomp);
         
         System.out.println(answer1 + " //correct: true");
         System.out.println(answer2 + " //correct: false");
         System.out.println(answer3 + " //correct: true");
         
         // Assignment 5: Write code to test map here
         List<Integer> l1 = new ArrayList<Integer>();
         
         int[] numbers = {3, -42, 88, 19, -37, 0, 18};
         for (int number : numbers){
        	 l1.add(number);
         }
         System.out.println(l1);
         Collection<Integer> l2 = filter(new isEven(),l1);
         System.out.println(l2);
         print(l2);
         // Assignment 5: Write code to test filter here
         ArrayList<Person> pl = new ArrayList<>();
         pl.add(new Person("Nisse","nisse@hipnet.moc","male",23));
         pl.add(new Person("Lisa","lisa@shipnet.sea","female",67));
         pl.add(new Person("Ada","ada@jahuu.vanu","female",49));
         pl.add(new Person("Kal","karl@gotnet.vg","male",78));
         pl.add(new Person("Beda","beda@fishnet.cod","female",102));
         // Assignment 6: Write code using lambdas here
         ArrayList<String> femalesOver65Email = new ArrayList<String>();
         map(x -> {
        	 if (x.getAge() >= 65 && x.getGender() == "female"){
        		 return femalesOver65Email.add(x.getEmail());
        	 }
        	 else{
        		 return null;
        	 }
         }, pl);
         print(femalesOver65Email);
    }
}

class StringComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

class IntegerComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
}











