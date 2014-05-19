public class Singleton {

	private int id = 0;
	private static Singleton sing = null;

	private Singleton() {
		id = 0;
	}
	
	public static Singleton getInstance() {
		if (sing == null) {
			sing = new Singleton();
		}
		return sing;
	}

	public int getIdentifier() {
		int i = id;
		id += 1;
		return i;
	}

}