public class Asymmetric {
	
	public static void main(String[] args) {
        char x = 'd';
        int value = 100;
        System.out.print(Double.NaN == Double.NaN ? 100 : x);
        System.out.print(Math.abs(Integer.MIN_VALUE) > 0 ? value : x);
	}
}

// Choices:
// 100100
// 100d
// dd
// d100
// none of the above
