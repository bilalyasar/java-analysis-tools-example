
public class FindBugsExample {

	
	private String checkStrValue = null;

	
	private void executeSomeConditions() {
		if ("SomeValue".equalsIgnoreCase(this.checkStrValue)) {
			// Condition 1
		} else if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 2
		}
	}


	private String nullPointer() {
		String str = null;
		return str.toUpperCase();
	}	
	
}
