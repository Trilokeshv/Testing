package test;

public class PP1 {
	int a = 10;

	public void test3() {
		System.out.println("test3");
	}
}

class PP2 extends PP1 {
	int b = 20;

	public void test4() {
		System.out.println("test4");
	}

	{
		PP2 ob1 = new PP2();
		PP1 ob2 = ob1;
		ob2.test3();
		System.out.println(ob2.a);
		PP2 ob3 = (PP2) ob2;

	}
}