package Test;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority =1)
	public void a_Test() {
		System.out.println("a test");
	}
	@Test(priority =2)
	public void b_Test() {
		System.out.println("b test");
	}
	@Test(priority =1)
	public void c_Test() {
		System.out.println("c test");
	}
	@Test(priority =0)
	public void d_Test() {
		System.out.println("d test");
	}
	@Test
	public void e_Test() {
		System.out.println("e test");
	}


}
