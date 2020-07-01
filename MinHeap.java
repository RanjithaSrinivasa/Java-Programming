import java.util.*;

class MinHeap{

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void insert(int elem){

		if(list.isEmpty()){
			list.add(elem);
		} else {

			list.add(elem);

			//System.out.println(list);

			int i = list.indexOf(elem);

			//System.out.println(i);
			
			
			while(i!=0) 
			{
				//System.out.println("inside while");
				if(list.get(i) < list.get(i/2)){
					//System.out.println("element less than parent");

					int small = list.get(i);
					int big = list.get(i/2);

					list.set(i, big);
					list.set(i/2, small);

					//System.out.println(list);

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

	public int delete(){

		int del = 0;
		int root = 0;

		if(list.size() != 0){

			int size = list.size();

			root = list.get(0);
			del = list.get(size-1);

			list.set(0, del);
			list.remove(size-1);

			int i = 0;
			size = list.size();
			System.out.println("BFR WHILE" + list);
			while(i < list.size()){

				int child1 = 2*i + 1;
				int child2 = 2*i + 2;

				if((child1 > size-1) && (child2 > size-1)){
					break;
				}

				System.out.println("iteration i " + i);
				if((child1 <= size - 1) && (child2 > size-1) ){
					System.out.println("child2 not prsent");
					int parent = list.get(i);
					int child = list.get(child1);

					if(parent > child){
						list.set(i, child);
						list.set(child1, parent);
						i = child1;
					}
					else{
						break;
					}
				}

				else if(child1 <= size - 1 && child2 <= size - 1 && list.get(child1) <= list.get(child2)){
					System.out.println("child1 lesser than child2");
					int parent = list.get(i);
					int child = list.get(child1);

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