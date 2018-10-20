package beans;

public class MyPrivateMembers {

	// private member
	private String name = "DRXYZ";
	private int id = 121;

	// private constructor
	private MyPrivateMembers() {
		System.out.println("no-args private constructor");
	}

	// private method
	private void noArgsMethod() {
		System.out.println("no-args method");
	}

}
