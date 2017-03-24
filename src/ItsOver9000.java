import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ItsOver9000 {
	
	public static void main(String...strings) {
		Map<Value, Integer> map
				= new EnumMap<Value, Integer>(Value.class);
		map.put(Value.ONE, 1);
		map.put(Value.MINUS_ONE, -1);
		
		Iterator<Map.Entry<Value, Integer>> iterator
							= map.entrySet().iterator();
		
		Entry<Value, Integer> entry = iterator.next();
		iterator.next();
		
		System.out.println((int)(char)(int)entry.getValue());
	}
}
enum Value { ONE, MINUS_ONE }

// Choices:
// 1
// -1
// Order of iteration is not guaranteed, can be either 1 or -1
// None of the above