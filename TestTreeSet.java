import java.util.*;

//NOTE: TreeSet is a class, Set is an Interface, you can implement set interface
//TreeSet is class, use parent as reference and it's child for instantiation

//if you try to add a duplicate element, set allows it but it might result in loss of data


//treeset is used when you need to maintain a data structure with unique elements in sorted order

class TestTreeSet{
	public static void main(String[] args){

		//always use bigger collection i.e set instead of treeset while instantiating
		Set<Fruit> treeset = new TreeSet<Fruit>();

		Fruit orange = new Fruit(1, "orange");
		Fruit apple = new Fruit(2, "red");
		Fruit pineapple = new Fruit(3, "yellow");
		Fruit grape = new Fruit(4, "green");

		System.out.println("is treeset empty ?? " + treeset.isEmpty());

		//adding elements
		treeset.add(orange);
		treeset.add(apple);
		treeset.add(pineapple);
		treeset.add(grape);

		//check size
		System.out.println("size of treeset is " + treeset.size());

		//printing objects
		System.out.println(treeset);

		//check for specific object
		System.out.println("does treemap contain orange ?? " + treeset.contains(orange));

		//remove particular objec, returns true
		System.out.println(treeset.remove(orange));

		System.out.println(treeset);

		//works only for Treeset

		//first() gives first element in set
		System.out.println("first object is " + treeset.first());

		//returns last element in sorted set
		System.out.println("last object is " + treeset.last());

		//these methods only work for treeset and not set

		/*

		System.out.println(treeset.pollFirst());

		System.out.println(treeset);

		System.out.println(treeset.pollLast());

		System.out.println(treeset); */


	}
}

class Fruit implements Comparable<Fruit>{
	String color;
	int id;

	Fruit(){}

	Fruit(int id, String color){
		this.color = color;
		this.id = id;
	}

	//when you try printing treeset, it would just print ref addr hence making it clear 
	@Override
	public String toString(){
		return "color-" + this.color + " " + "id-" + this.id;
	}

	//since we are adding objects, set wouldn't know how to print in sorted order
	//hence make it easy for set by specifying thro what params it has to compare
	@Override
	public int compareTo(Fruit fruit){
		return this.id - fruit.id;
	}

}