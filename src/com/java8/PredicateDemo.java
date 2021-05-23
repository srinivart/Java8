package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even : "+ t));

	}

}







/*

-> the predicate functional interface, we can use it for conditional check


--> lets implement Predicate<T>

i.e : 

     class PredicateDemo implements Predicate<Integer>


--> we are taking Integer to see the even and odd integers



--> next we need implement the unimplemented methods, becz its functional interface
which has one abstract method : i.e : test(T t)



--> It will always accepts the argument and returns the boolean


---> first write main logic, then later we convert into lambda

 
	if(t%2==0) {
		   return true;
		}else {
		    return false;
	     } 
	     
	     
	
	     
	     

--> now add the main method




Case : 1
-------------------------------->
public class PredicateDemo implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		if(t%2==0) {
		   return true;
		}else {
		    return false;
	     } 
	}

	public static void main(String args[]) {
		
	}

}
--------------------------------





--> 
    now we can have the implementation of it
   
    i.e:   Predicate<Integer> predicate = new PredicateDemo();




--> now call using predicate reference

i.e: predicate.test(4);

System.out.println(predicate.test(4));




--> so it always returns the true or false

-->






Case : 2
-------------------------------->
public class PredicateDemo implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		if(t%2==0) {
		   return true;
		}else {
		    return false;
	     } 
	}

	public static void main(String args[]) {
	
		Predicate<Integer> predicate = new PredicateDemo();
		System.out.println(predicate.test(4));
	}
	

}
-------------------------------->




--> lets convert it to lambda expression



--> first remove the implementation

--> lets copy the test method into main method

--> and this is functional interface and we want make it to lambda
  so we need to write the anonymous function of it



--> lets remove the name and prefix

i.e : public boolean test


--> and remove the data type

i.e
(Integer t)   ---to----> (t)



--> now add the lambda expression  ->

i.e: 

(t) -> {



--> next assign it to interface



--> and close the brace

  i.e :      };





--> now call using preidcater reference

i:e: System.out.println(predicate.test(8));	







Case : 3
-------------------------------->

public class PredicateDemo {

	public static void main(String args[]) {

		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

          System.out.println(predicate.test(8));		
		
	}

}

-------------------------------->




--> now we can optimize, we don't need to write multiple statements




Before: 
-------

(t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};




After
------
 t -> t % 2 == 0;






Case : 4
-------------------------------->
public class PredicateDemo {

	public static void main(String args[]) {

		Predicate<Integer> predicate = t -> t % 2 == 0;

          System.out.println(predicate.test(7));		
		
	}

}
-------------------------------->



--> why we are using this predicate ?
we are using it for conditional statement or check

in Java 8 , we have filter method

it filters the stream of data, based on the predicate

in such cases we can go for predicate





Note:

when you are writing code outside main.
suggesitions won't show, make sure you are writing inside

 Window->Preferences->Java->Editor->Content Assist->Advanced - explicitly check Java Proposals - Apply





-->
list.stream().forEach(t -> System.out.println(t));


--> in the above case we are simply printing
   before we want to print, add some conditaion check and lets use, predicate
   
   
 --> if that element is even print or else ignore
 
 
 
  --> for that in streams, there is a method called filter()
   
     If you observe the filter method signature, it contains predicate
     
    
-->
i.e: 
filter(predicate)

 Stream<T> filter(Predicate<? super T> predicate);





Case : 5
-------------------------------->

public class PredicateDemo {

	public static void main(String args[]) {

		Predicate<Integer> predicate = t -> t % 2 == 0;

		System.out.println(predicate.test(7));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().forEach(t -> System.out.println(t));

		list.stream().filter(predicate).forEach(t -> System.out.println(t));

	}

}

-------------------------------->

Case 6
-------------------------------->


public class PredicateDemo {

	public static void main(String args[]) {

		Predicate<Integer> predicate = t -> t % 2 == 0;

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().filter(predicate).forEach(t -> System.out.println(t));

	}

}

-------------------------------->


Lests further optimize 





Case 7
-------------------------------->

public class PredicateDemo {

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even : "+ t));

	}

}


-------------------------------->













API Documentation
-------------------


 2) Predicate Functional Interface
--------------------------------
@FunctionalInterface
public interface Predicate<T>{

 boolean test(T t);
}
--------------------------------


*/