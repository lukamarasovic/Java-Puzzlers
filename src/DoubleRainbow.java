public class DoubleRainbow {
	
	public static void main(String[] args) {
		int length = "Abcd\u0022.length() + \u0022efgh".length();	
		System.out.println(selectValue(length));
	}
	
	public static int selectValue(int value) {
		try {
			return value / 4;
		} finally { 
			return value; 
		}
	}
}

// Choices:
// 5
// 8
// 22
// 32
// none of the above

