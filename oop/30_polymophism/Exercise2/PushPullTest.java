public interface Pull {
	public void pull();
}
public class PushPull implements Pull{
	
	
	public void pull() {
		System.out.println("pull");
	}
	
	public void push() {
		System.out.println("push");
	}
	
}


public class PushPullTest {
	public static void main(String[] args) {
		
		PushPull pushPull = new PushPull();
		
		Push var1 = null;
		Pull var2 = null;
		
		//---Replace
    }
}
