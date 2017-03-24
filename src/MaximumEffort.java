import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumEffort {
	
	public static void main(String...strings) {
		LegacyTypedList<Integer> list 
				= new LegacyTypedList<Integer>();
		list.add((Integer)1);
		list.add((Object)1);
		
		System.out.print(list.typedList.size());
		System.out.println(list.objectList.size());
	}
}

class TypedList<E> {
	 List<E> typedList = new ArrayList<E>(); 
	 
	 void add(E e) { typedList.add(e); }
}

class LegacyTypedList<E> extends TypedList<E> {
	List<Object> objectList = new ArrayList<Object>();
	
	void add(Object object) { objectList.add(object); }
}

// Choices:
// 20
// 11
// 02
// none of the above