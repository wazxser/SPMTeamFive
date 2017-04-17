package TeamFive;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public App app = new App();
	
	@Test
	public void testPrin(){
		assertEquals("Hello, WangYuehuan", app.prin());
	} 
	
	@Test
	public void testPrinChen(){
		assertEquals("Hello, ChenYao", app.prinChen());
	} 

	@Test
	public void testPrinZhao(){
		assertEquals("Hello, ZhaoDanning", app.prinZhao());
	} 

	@Test
	public void testPrinLiang(){
		assertEquals("Hello, LiangXiao", app.prinLiang());
	} 
	
	@Test
	public void testPrinZhang(){
		assertEquals("Hello, ZhangYuchi", app.prinZhang());
	} 
	@Test
	public void testPrintNiu(){
		assertEquals("Hello, Niu Feifei", app.printNiu());
	}
}
