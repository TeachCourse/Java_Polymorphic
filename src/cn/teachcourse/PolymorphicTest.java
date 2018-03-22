package cn.teachcourse;

public class PolymorphicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show(b));//��ӡ��1--A and A
		System.out.println("2--" + a1.show(c));//��ӡ��2--A and A
		System.out.println("3--" + a1.show(d));//��ӡ��3--A and D
		
		System.out.println("4--" + a2.show(b));//��ӡ��4--B and A
		System.out.println("5--" + a2.show(c));//��ӡ��5--B and A
		System.out.println("6--" + a2.show(d));//��ӡ��6--A and D
		
		System.out.println("7--" + b.show(b));//��ӡ��7--B and B
		System.out.println("8--" + b.show(c));//��ӡ��8--B and B
		System.out.println("9--" + b.show(d));//��ӡ��9--A and D
	}
	static class A {
		public String show(D obj) {
			return ("A and D");
		}

		public String show(A obj) {
			return ("A and A");
		}
	}

	static class B extends A {
		public String show(B obj) {
			return ("B and B");
		}

		public String show(A obj) {
			return ("B and A");
		}
	}

	static class C extends B {
	
	}

	static class D extends B {
	
	}

}
