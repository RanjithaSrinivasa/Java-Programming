import java.util.*;

//difference btw Hashmap and Treemap is that Treemap sorts the keys and returns the data
//time to search in hashmap is o(1) but in treemap it is O(log n) as it is a tree

class TestTreeMap{
	public static void main(String[] args){
	/*	TreeMap <Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(1,"Ranju");
		treemap.put(2, "Nikesh");

		System.out.println(treemap.containsKey(1));

		System.out.println(treemap);

		System.out.println("elem is " + treemap.get(2));

		System.out.println("size is " + treemap.size());

		System.out.println(treemap.remove(1));
 
		System.out.println(treemap); */



		//Creating objects of person

		Person Nikesh =  new Person(1, "Nikesh", 25);
		Person Ranjitha = new Person(2, "Ranjitha", 24);
		Person Shruthi = new Person(3, "Shruthi", 31);
		Person Aira = new Person(4, "Aira", 1);
		Person Dilip = new Person(5, "Dilip", 32);

		Map<Person, Integer> people = new TreeMap<Person, Integer>();

		people.put(Nikesh, 1);
		people.put(Aira, 4);
		people.put(Ranjitha, 2);
		people.put(Dilip, 5);
		people.put(Shruthi, 3);

		//below commented code works when key is integer and value is object
		/*
		System.out.println("size is " + people.size());

		System.out.println(people);

		System.out.println("elem is " + people.get(2));

		System.out.println(people.remove(1));

		System.out.println(people);

		System.out.println(people.containsKey(2));  */

		/* Since treemap sorts it's keys, here key type is object which treemap is umaware of
		   Hence, you have to override compareTo method to specify to treemap how to sort the keys */
		people.forEach((key, value) -> System.out.println(key + ":" + value));




	}
}

class Person implements Comparable<Person>{
	int id;
	String name;
	int age;

	Person(){}


	Person(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person person){
		/*
		if(this.age > a.age) return 1;
		else if(this.age == a.age) return 0;
		else return -1; */

		return this.age - person.age;

	}

	@Override
	public String toString(){
		return this.name + " age = "+  this.age + " id = " + this.id;
	}
}