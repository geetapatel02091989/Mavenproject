package miit.maven.demo;
import static org.junit.Assert.*;
import org.junit.Test;

public class Testadd {
   Calculator c1 = new Calculator();
	@Test
	public void testadd() {
		int expectResult = 25;
		int actualResult = c1.add(10,15);
		
		assertEquals(expectResult ,actualResult, 10);
	}
@Test
public void testsub() {
	int expectResult = 30;
	int actualResult = c1.sub(50,20);
	
	assertEquals(expectResult ,actualResult, 10);
}
@Test
public void testmul() {
	int expectResult = 50;
	int actualResult = c1.mul(10,5);
	
	assertEquals(expectResult ,actualResult, 10);
}
@Test
public void testdiv() {
	int expectResult = 15;
	int actualResult = c1.div(30,2);
	
	assertEquals(expectResult ,actualResult, 10);
}
		
}


