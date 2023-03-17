package hop.com;

public class Hello {

	public void Display() {
		System.out.println("Hello");
	}

	public void Dummy() {
		System.out.println("Dummy");
	}

	public static void main(String[] args) {
		Thidbranch TB = new Thidbranch();
		TB.third_branch();

		SecondBranch SB = new SecondBranch();
		SB.second_branch();

		Hello hello = new Hello();
		hello.Display();
		hello.Dummy();

	}
}
