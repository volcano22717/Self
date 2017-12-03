
public class TestRecursion {
//	
//	public static void main(String[] args) {
//		public static long factorial(int a) {
//			int n;
//			if(a==1) {
//				return 1;
//			}else {
//				return n*factorial(n-1);
//			}
//		}
//		
//	}
	static int a;
	public static void test01() {
		a++;
		System.out.println("Test01"+a);
		if(a<10) {
			test01();
		}else {
			System.out.println("over");
		}
	}
	
	public static void test02() {
		System.out.println("test02");
	}
		
	public static long factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		test01();
	}

}
