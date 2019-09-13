package test;

public class P1 {

	public P2 test1() {
		P2 ob1 = new P2();
		return ob1;
	}

	public static class P2 {

		public int test2() {
			String a = "Selenium Testing";
			int l1 = a.length();
			return l1;
		}

		public static void main(String[] args) {
			/*
			 * P1 ob2=new P1(); P2 ob3=ob2.test1(); int l2=ob3.test2();
			 * System.out.println(l2);
			 */

			/*
			 * P1 ob2=new P1(); P2 ob3=ob2.test1(); System.out.println(ob3.test2());
			 */

			P1 ob2 = new P1();
			System.out.println(ob2.test1().test2());

		}
	}
}
