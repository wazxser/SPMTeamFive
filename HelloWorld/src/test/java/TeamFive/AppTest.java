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
}
