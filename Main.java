import java.util.*;

public class Main {
	static void removePos(ArrayList<Integer> l, ArrayList<Integer> p){
		
		ArrayList<Integer>.MyListIterator iterator=l.new MyListIterator();
		for(int i=0;i<p.size();i++) {
			l.myListIterator(p.get(i)).remove();
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> p=new ArrayList<>();
		
	
		ArrayList<Integer>.MyListIterator iterator1=l.myListIterator();
		ArrayList<Integer>.MyListIterator iterator2=p.myListIterator();
		iterator1.add(3);iterator1.add(10);iterator1.add(8);iterator1.add(5);iterator1.add(12);iterator1.add(67);iterator1.add(25);
		iterator1.add(22);
		
		iterator2.add(1);iterator2.add(3);iterator2.add(4);iterator2.add(6);
		
		iterator1.display();
		iterator2.display();
		
		removePos(l,p);
		
		iterator1.display();
		
		iterator1.next();
		iterator1.set(1);
		iterator1.previous();
		iterator1.set(100);
		
	}

}


