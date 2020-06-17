import java.util.*;


//treeset is used when you need to maintain a data structure with unique elements in sorted order

class TestHashSet{
	public static void main(String[] args){

		//always use bigger collection i.e set instead of treeset while instantiating
		Set<Fruit> hashset = new HashSet<Fruit>();

		Fruit orange = new Fruit(1, "orange");
		Fruit apple = new Fruit(2, "red");
		Fruit pineapple = new Fruit(3, "yellow");
		Fruit grape = new Fruit(4, "green");

		System.out.println("is hashset empty ?? " + hashset.isEmpty());

		//adding elements
		hashset.add(orange);
		hashset.add(apple);
		hashset.add(pineapple);
		hashset.add(grape);

		//check size
		System.out.println("size of treeset is " + hashset.size());

		//printing objects
		System.out.println(hashset);

		//check for specific object
		System.out.println("does treemap contain orange ?? " + hashset.contains(orange));

		//remove particular objec, returns true if object is removed
		hashset.remove(orange);

		System.out.println(hashset);

		hashset.clear();

		System.out.println(hashset.isEmpty());

		//BMETHODS FOR TREESET ONLY AND NOT HASHSET

		//first() gives first element in set
		//System.out.println("first object is " + hashset.first());

		//returns last element in sorted set
		//System.out.println("last object is " + treeset.last());

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