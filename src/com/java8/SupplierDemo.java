package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String args[]) {

		List<String> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(() -> "Welcome to Java8"));

	}

}


























/*

--> 
  in supplier the method won't contains any arguments, but it expects one return type
  
  
 --> 
first implement the interface  Supplier

I'm giving string, means it always returns the string.


--> implement the unimplemented method





CAse: 1
------------------------------>
public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Welcome to Java8";
	}
	
}
------------------------------>





--> add main method

--> next create implementation of supplier

-->
i.e: Supplier<String> supplier = new SupplierDemo();


--> then call the get() method

 i.e: supplier.get();





CAse: 2
------------------------------>
public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Welcome to Java8";
	}

	public static void main(String args[]) {

		Supplier<String> supplier = new SupplierDemo();

		System.out.println(supplier.get());

	}

}
------------------------------>





now convert this traditional approach to lamda expression



--> remove implements

implements Supplier<String>

--> copy the get() method implementaion inside main method



------>
public String get() {
			return "Welcome to Java8";
		}

------>

for the above method we are going to write lamda expression








--> first remove the method name and prefix

--> and this method doesn't have any arguments

--> it has only return type

--> add lambda in between & close the bracket with semicolon


--------->
() -> {
			return "Welcome to Java8";
		};
--------->




--> use the interface reference and assign






CAse: 3
------------------------------>
public class SupplierDemo {

	public static void main(String args[]) {

		Supplier<String> supplier = () -> {
			return "Welcome to Java8";
		};

	}

}

------------------------------>




--> now call this method

supplier.get();







CAse: 4
------------------------------>
public class SupplierDemo {

	public static void main(String args[]) {

		Supplier<String> supplier = () -> {
			return "Welcome to Java8";
		};

		 System.out.println(supplier.get());
	}

}
------------------------------>




--> we can further simply it as 



--> remove the braces , because it has only one line statement




Before
-------
Supplier<String> supplier = () -> {
			return "Welcome to Java8";
		};



After
-------
Supplier<String> supplier = () ->  "Welcome to Java8";








CAse: 5
------------------------------>

public class SupplierDemo {

	public static void main(String args[]) {

		Supplier<String> supplier = () ->  "Welcome to Java8";

		 System.out.println(supplier.get());
	}

}

------------------------------>







-->

so the supplier have get() method which have return type but no method arguments


so this 

T get()

--> get method always expects return type




--> where do we exactly use this in stream api, in java8 ?






if we are doing any filtering process and not getting any response or result
and you want to return any dummy data or
meaningful response.. in such cases you can go for Supplier









--> Lets create a list of Strings 


List<Integer> list = Arrays.asList(1,2,3,4,5);


so here we will  do  some condition check , if we don't get  any result
we do our "Welcome to Jave8"





List<String> list = Arrays.asList("a","b");

list.stream().findAny()



--> if I am not gettting any element from the stream

then I want to reeturn something


.orElseGet(supplier)   ---> which has supplier



-------->
 list.stream().findAny().orElseGet(supplier);
-------->




and print that using system out 





CAse: 6
------------------------------>

public class SupplierDemo {

	public static void main(String args[]) {

		Supplier<String> supplier = () -> "Welcome to Java8";

		System.out.println(supplier.get());

		List<String> list = Arrays.asList("a", "b");

		System.out.println(list.stream().findAny().orElseGet(supplier));

	}

}
------------------------------>


from the list we are trying to find out any element, if we are not finding anything

then return  the supplier...and our supplier will return "Welcome to Java8"




--> now make the array list empty .. to see how it works






CAse: 7
------------------------------>
public class SupplierDemo {

	public static void main(String args[]) {

		Supplier<String> supplier = () -> "Welcome to Java8";

		List<String> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(supplier));

	}

}
------------------------------>



we can further simplify as 


we can directly pass the lamda expression





CAse: 8
------------------------------>
public class SupplierDemo {

	public static void main(String args[]) {

		List<String> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(() -> "Welcome to Java8"));

	}

}

------------------------------>






























API Documentataion
--------------------



 3) Supplier Functional Interface
-------------------------------- 
@FunctionalInterface
public interface Supplier<T>{

 T get ();
}
--------------------------------


*/