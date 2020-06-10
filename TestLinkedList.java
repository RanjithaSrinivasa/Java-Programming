import java.util.*;

class TestLinkedList{

	public static void main(String[] args){

		LinkedList<String> list = new LinkedList<String>();

		list.add("Sathya");
	    list.add("Ranjitha");
	    list.add("Shruthi");
	    list.add("Aira");


	    list.addFirst("Srinivasa");
	    list.addLast("Dilip");

	    System.out.println(list.contains("Sathya"));


	    System.out.println(list);

	    System.out.println(list.get(0));

	    System.out.println(list.getLast());

	    list.remove("Ranjitha");

	    System.out.println(list);

	    list.remove(2);

	    System.out.println(list);

	    list.set(1, "Shruthi");

	    System.out.println(list);

	    System.out.println(list.remove());

	    System.out.println("size is " + list.size());

	    list.clear();

	    System.out.println("size is " + list.size());

		Food masaladosa = new Food("Masala Dosa", 1);
		Food momos = new Food("Momos", 4);
		Food pasta = new Food("Pasta", 3);
		Food aloo = new Food("Aloo", 2);

		List<Food> foodlist_ranjitha = new LinkedList<Food>();

		foodlist_ranjitha.add(masaladosa);
		foodlist_ranjitha.add(momos);

		List<Food> foodlist_nikesh = new LinkedList<Food>();

		foodlist_nikesh.add(pasta);
		foodlist_nikesh.add(aloo);


		Person Ranjitha = new Person("Ranjitha", 648385488, 5.3f, foodlist_ranjitha);


		Person Nikesh = new Person("Nikesh", 648385489, 5.7f, foodlist_nikesh);

		List<Person> people = new LinkedList<Person>();

		people.add(Ranjitha);
		people.add(Nikesh);

		System.out.println(Ranjitha.getName());
		System.out.println(Nikesh.getName());

		System.out.println(Ranjitha.getHeight());
		System.out.println(Nikesh.getHeight());

		System.out.println(Ranjitha.getFavorites());
		System.out.println(Nikesh.getFavorites());
		System.out.println(Ranjitha.getFavorites());


	}
}

class Person{
	private String name;
	private long id;
	private float height;
	private List<Food> favorites;

	Person(String name, long id, float height, List<Food> favorites){
		this.name = name;
		this.id = id;
		this.height = height;
		this.favorites = favorites;
	}

	public String getName(){
		return this.name;
	} 
	public long getId(){
		return this.id;
	} 
	public float getHeight(){
		return this.height;
	} 

	public List<Food> getFavorites(){
		return favorites;
	}

	public void setName(String _name){
		this.name = _name;
	}

	public void setId(long _id){
		this.id = _id;
	}
	public void setHeight(float _height){
		this.height = _height;
	}

	public void setfavorites(List<Food> _favorites){
		this.favorites = _favorites;
	}
	
	@Override
	public String toString(){
		return this.name;
	}
}

class Food {
	private String name;
	private int id;

	Food(String name, int id){
		this.name = name;
		this.id = id;
	}

	//to print object
	@Override
	public String toString(){
		return this.name;
	}

	@Override
	public boolean equals(Object o){
		if(o instanceof Person){
			Person p = (Person) o;
			return this.name.equals(p.getName());
		}
		else
			return false;
	}
}