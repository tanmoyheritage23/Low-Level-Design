/* Double Locking Method */

public class Singleton {
	
	private static Singleton conObject;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(conObject == null) {
			synchronized(Singleton.class) {
				if(conObject == null) {
					conObject = new Singleton();
				}
			}
		}
		
		return conObject;
	}
}