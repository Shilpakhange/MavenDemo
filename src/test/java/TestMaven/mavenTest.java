package TestMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class mavenTest {
		
	@Test
	public void add() {
		System.out.println("Addintion");
		int a=10;
		int b=20;
		assertEquals(30, a+b);
	}

	@Test
	public void sub() {
		System.out.println("Subtraction");
		int a=10;
		int b=20;
		assertEquals(10, b-a);
	}

	@Test
	public void mult() {
		System.out.println("Multiplication");
		int a=10;
		int b=20;
		assertEquals(200, a*b);
	}


	}


