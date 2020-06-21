import java.util.*;

class Compare{

	public static void main(String[] args){

		Person Ranjitha = new Person("Ranjitha", 8, 5.3f);


		Person Nikesh = new Person("Nikesh", 6, 5.7f);

		List<Person> people = new ArrayList<Person>();

		people.add(Ranjitha);
		people.add(Nikesh);

		System.out.println(people);

		/* toString explaination

		without overriding the toString method, this would just print references as output
		hence override toString method and specify what needs to be printed

		before overriding toString
		output1 : [Person@6ff3c5b5, Person@3764951d]
		output2: [Ranjitha 648385488 5.3, Nikesh 648385489 5.7]
		*/


		//type 1
		Collections.sort(people);

		System.out.println("sort using toCompare method");
		System.out.println(people);

		//type 2
		Collections.sort(people, new Comparator<Person>(){
			public int compare(Person p1, Person p2){
				return p2.id - p1.id;
			}
		});
		System.out.println("sort using compare");
		System.out.println(people);

		//type 3
		Comparename cn = new Comparename();
		Collections.sort(people, cn);

		System.out.println("sort using inner class for compare method");
		System.out.println(people);

		/* Compare objects Explaination:

		compiler wouldn't know how to compare people objects 
		
		Solution 1 : override the compareTo method to take objects of type 
		person, implement interface Comparable<type> 
		Note: sort would to take one argument that is list as its arg

		Solution 2: pass comaparator to sort function, 
		Note: sort takes two args, list and comparator 

		another way of writing comparator
		is writing inner class*/


		//reference equality
		Person Aira = new Person("Aira", 8, 5.3f);
		Person Airajr = Aira;

		//prints true
		System.out.println(Aira.equals(Airajr));

		//object equality
		Person Shruthi = new Person("Shruthi", 8, 5.3f);
		Person Shruthijr = new Person("Shruthi", 8, 5.3f);

		//prints false cause equals don't know how apply equals methods on person objects
		//therefore implement equals in Person class
		System.out.println(Shruthi.equals(Shruthijr));

		}
}






class Person implements Comparable<Person>{
	String name;
	int id;
	float height;

	Person(String name, int id, float height){
		this.name = name;
		this.id = id;
		this.height = height;
	}

	public String toString(){
		return this.name + " " + this.id + " " + this.height;
	}

	public int compareTo(Person p){
		return this.id - p.id;
	}

	public boolean equals (Object o){
		if(o instanceof Person){
			Person p1 = (Person) o;
			return this.name.equals(p1.name);
		} else
			return false;
	}

	/*
	public boolean equals (Person p1){
			return this.name.equals(p1.name);
	} */

}

class Comparename implements Comparator<Person>{
	public int compare(Person p1, Person p2){
		return p1.name.compareTo(p2.name);
	}
}