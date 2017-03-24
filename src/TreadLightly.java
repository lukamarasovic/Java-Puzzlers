public class TreadLightly {

	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() { 
				System.out.print(Boolean.getBoolean("true"));
			}
		};
		t.run();
		System.out.print(Boolean.getBoolean("false"));
	}
}

// Choices:
// truefalse
// falsetrue
// falsefalse
// truetrue
// none of the above
