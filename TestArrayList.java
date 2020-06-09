import java.util.*;


class TestArrayList{

	public static void main(String[] args){

		List<Integer> list = new ArrayList<Integer>();

	    int n = 5;

		for(int i = 0; i<n ; i++){
			list.add(i);
		}

	    System.out.println(list);

		//list.remove(Integer.valueOf(2));

		list.remove(new Integer(2));

		System.out.println(list.contains(2));


		System.out.println(list);

		//list.remove(3);

		
		System.out.println("size is " + list.size());

		list.set(1, 5);

		System.out.println(list);

		System.out.println("elem at 1 position is " + list.get(1));

		for(Integer i: list){
			System.out.println(i);
		}

		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}


		list.clear();

		System.out.println(list);

		System.out.println("size is " + list.size());

		Food masaladosa = new Food("Masala Dosa", 1);
		Food momos = new Food("Momos", 4);
		Food pasta = new Food("Pasta", 3);
		Food aloo = new Food("Aloo", 2);

		List<Food> foodlist_ranjitha = new ArrayList<Food>();

		foodlist_ranjitha.add(masaladosa);
		foodlist_ranjitha.add(momos);

		List<Food> foodlist_nikesh = new ArrayList<Food>();

		foodlist_nikesh.add(pasta);
		foodlist_nikesh.add(aloo);


		Person Ranjitha = new Person("Ranjitha", 648385488, 5.3f, foodlist_ranjitha);


		Person Nikesh = new Person("Nikesh", 648385489, 5.7f, foodlist_nikesh);

		List<Person> people = new ArrayList<Person>();

		people.add(Ranjitha);
		people.add(Nikesh);

		/*
		for(int i=0; i<people.size(); i++){
			System.out.println("person" + people.get(i));
		}*/

		for(Person i: people){
			System.out.println(i);
		}

		for(Person i: people){

			if(i.getName() == "Nikesh"){
				System.out.println("object exists " + i);
				break;
			}	
		}

		System.out.println(people.contains(Nikesh));


		System.out.println(Ranjitha.getName());
		System.out.println(Nikesh.getName());

		System.out.println(Ranjitha.getHeight());
		System.out.println(Nikesh.getHeight());

		System.out.println(Ranjitha.getFavorites());

		System.out.println(Nikesh.getFavorites());
		//Ranjitha.setfavorites(biriyani);
		//System.out.println(Ranjitha.getFavorites());


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


	//public static void main(String[] args){
		//List<String> per
	//}