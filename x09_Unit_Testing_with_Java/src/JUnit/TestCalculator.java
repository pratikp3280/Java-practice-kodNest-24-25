package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	int a , b , expRes;
	static Calculator c;
	
	@BeforeAll
	static void getObject() {
		c = new Calculator();
	}
	
	@BeforeEach
	void setValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		System.out.println("Enter expected result: ");
		expRes = sc.nextInt();
	}
	
//	@BeforeAll
//	static void testNetwork1() {
//		System.out.println("Before All Test Case.");
//	}
//	
//	@AfterAll
//	static void testNetwork2() {
//		System.out.println("After All Test Case.");
//	}
//	
//	@BeforeEach
//	void testData1() {
//		System.out.println("Before Each test Case.");
//	}
//	
//	@AfterEach
//	void testData2() {
//		System.out.println("After Each test Case.");
//	}
//	
//	
	
	
	@Test
	void testAdd() {
		int actRes = c.add(a, b);
		assertEquals(expRes , actRes, "Failed test Case for Additions");
	}
	
	@Test
	void testSub() {
		int actRes = c.sub(a,b);
		assertEquals(expRes , actRes, "Failed test Case for Subtraction");
	}
	
	@Test
	void testMul() {
		int actRes = c.mul(a , b);
		assertEquals(expRes , actRes);
	}
	
	@Test
	void testDiv() {
		int actRes = c.div(a , b);
		assertEquals(expRes , actRes);
	}

}
