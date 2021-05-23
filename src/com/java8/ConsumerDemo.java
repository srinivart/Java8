package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class ConsumerDemo{

     public static void main(String[] args) {

    		List<Integer> list = Arrays.asList(1,2,3,4,5);
    		
    		list.stream().forEach(t -> System.out.println("Print : "+ t));
    		
     }
}























/*
 
 

 
--> first implement this class from Consumer interface, 
type generic we need to provide, so give as Integer

--> now we are implementing, so we need to provide the implementation method
and override the method


-> it always accepts one argument and it wont return anything
    with that argument we can perform any operation

--> Lets print this argument , that we are passing at run time

  now lets add the main method

--> in main method we can create object of our implementation and we can call it





Case 1
--------------->

public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
     System.out.println("Printing : "+ t);	
	}
	
     public static void main(String[] args) {	 
     }
}
--------------->




--> accept()  is abstract method, which present in consumer functional interface
    we can write a lamda expression for this
   
    
--> remove this implement statement

--> copy paste the method in main method

--> so we want to make it annonymous function, 
      so we don't want any method name and prefix , so remove them

      i.e public void accept
    
--> Integer is type argument,we dont want specify any data type, remove it

      i.e Integer
      
-->  we have the parameter and method body

-->  only we need to add the lambda expression

--> and assign to the Functional interface


 i.e     Consumer<Integer> consumer 


--> and close the bracket   with semicolon ---->   ;



Case 2
--------------->
public class ConsumerDemo{

     public static void main(String[] args) {
    	
    	Consumer<Integer> consumer = (t) -> {
    	     System.out.println("Printing : "+ t);	
    		};
    		
     }
}


--------------->








--> Consumer interface contains accept() method, so we can directly call the method
using interface reference


i.e :  consumer.accept(10);


Case 3
--------------->


public class ConsumerDemo{

     public static void main(String[] args) {
    	
    	Consumer<Integer> consumer = (t) -> {
    	     System.out.println("Printing : "+ t);	
    		};
		
    		consumer.accept(10);
     }
}

--------------->





(t) -> {
    	System.out.println("Printing : "+ t);	
        
        };
    		
    		
    		
    		
    		
    		

--> we can optimize the above code ,
if we have one statement we don't require bracket

--> similarly if method argument is one,  we no need any bracket



t ->  System.out.println("Printing : "+ t);	







Case 4
--------------->

public class ConsumerDemo{

     public static void main(String[] args) {
    	
    	Consumer<Integer> consumer = t -> System.out.println("Printing : "+ t);
    	
    		consumer.accept(10);
     }
}


--------------->




--> so this accept method always accepts the argument and it don't have any return type

--> the argument which we give to method, 
based on that we can perform the operation which we want





--> in Jave 8 stream API, there is a method call, forEach() method

and which always accepts consumer interace


i.e: forEach(Consumer<? super Integer> action): void - Stream


so lets see how we can use this consumer functional interface in java8 streams.



--> 
   Lets create a list of integer 
   
   
   List<Integer> list = Arrays.asList(1,2,3,4,5);



  and we want to use the consumer functional interface
  
  
  
  list.stream()


--> and we can pass the our consumer reference

      
      list.stream().forEach(consumer);



--> and internally it will call the accept method






Case 5
--------------->
public class ConsumerDemo{

     public static void main(String[] args) {
    	
    	Consumer<Integer> consumer = t -> System.out.println("Printing : "+ t);    		
    		
    		List<Integer> list = Arrays.asList(1,2,3,4,5);
    		
    		list.stream().forEach(consumer);
    		
     }
}

--------------->




-->

the forEach method is accepting Consumer functional interface.
so instead of passing, reference we can directly pass the 
lambda syntax of the consumer Functional interface


i.e:  t -> System.out.println("Printing : "+ t)






Case 6
--------------->
public class ConsumerDemo{

     public static void main(String[] args) {

    		List<Integer> list = Arrays.asList(1,2,3,4,5);
    		
    		list.stream().forEach(t -> System.out.println("Printing : "+ t));
    		
     }
}

--------------->



Output:
------

Printing : 1
Printing : 2
Printing : 3
Printing : 4
Printing : 5






--->

so  we are giving array list to forEach , which is internally using consumer interface
and internally calls the accept method
and gives the argument --> T t 





















API Documentation
-------------------

 
 1) Consumer Functional Interface
--------------------------------

@FunctionalInterface
public interface Consumer<T>{

 void accept(T t);
}
--------------------------------



*/