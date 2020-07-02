import java.util.*;

class MinHeap{

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void insert(int elem){

		if(list.isEmpty()){
			//addding first element
			list.add(elem);
		} else {
			//element gets added at the end of arraylist 
			list.add(elem);

			//System.out.println(list);

			int i = list.indexOf(elem);

			//System.out.println(i);
			
			
			while(i!=0) 
			{
				//once element is inserted at the end of the array go until node 0
				//as that represents root to compare if the inserted element is small than root
				if(list.get(i) < list.get(i/2)){

					//element less than parent so swap it
					int small = list.get(i);
					int big = list.get(i/2);

					list.set(i, big);
					list.set(i/2, small);

					//jump to updated parent and continue the comparision
					i = i/2;
				} 
				else {
					break;
				}
			}
		}
	}

	public void display(){
		System.out.println(list);
	}

	//to preserve CBT property we start by eliminating root element
	public int delete(){

		int del = 0;
		int root = 0;

		if(list.size() != 0){
			int size = list.size();
			//remove root element and swap last elem to root
			root = list.get(0);
			del = list.get(size-1);
			list.set(0, del);
			list.remove(size-1);

			int i = 0;
			size = list.size();
			while(i < list.size()){

				//get children of root
				int child1 = 2*i + 1;
				int child2 = 2*i + 2;

				//comapring children 
				//if both children don't exist on array list then break
				if((child1 > size-1) && (child2 > size-1)){
					break;
				}


				//if only child1 exists
				if((child1 <= size - 1) && (child2 > size-1) ){
					System.out.println("child2 not prsent");
					int parent = list.get(i);
					int child = list.get(child1);
					//compare child1 with parent and swap if necessary
					if(parent > child){
						list.set(i, child);
						list.set(child1, parent);
						i = child1;
					}
					else{
						break;
					}
				}

				//both child1 and child2 exists and child1 nodes's value is lesser than child2
				else if(child1 <= size - 1 && child2 <= size - 1 && list.get(child1) <= list.get(child2)){
					System.out.println("child1 child2 exists");
					int parent = list.get(i);
					int child = list.get(child1);

					//comapre child1 and parent
					if(parent > child){
						list.set(i, child);
						list.set(child1, parent);
						i = child1;
						System.out.println("c1 < c2" + list);
					}
					else{
						break;
					}
				}

				//both child1 and child2 exists and child2 nodes's value is lesser than child1
				else if(child1 <= size - 1 && child2 <= size - 1 && list.get(child2) < list.get(child1)){
					System.out.println("child2 lesser than child1");
					int parent = list.get(i);
					int child = list.get(child2);

					if(parent > child){
						list.set(i, child);
						list.set(child2, parent);
						i = child2;
					}
					else{
						break;
					}
				}else{
					break;
				}
				System.out.println(list);
			}

		}
		return root;

	}

	public static void main(String[] args){

		MinHeap min = new MinHeap();

		//min.insert(10);
		min.insert(30);
		min.insert(40);
		min.insert(20);
		
		min.insert(5 );
		min.insert(60);
		//min.display();
		//min.insert(4);
		min.display();

		System.out.println(min.delete());

		min.display();

		System.out.println(min.delete());

		min.display();		
	}

}