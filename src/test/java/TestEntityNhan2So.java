import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestEntityNhan2So {
	
	@Test
	public void testNhan2So() {
		
		Nhan2So n2so = new Nhan2So(2, 2);
		
		int result = n2so.nhan2So();
		
		assertEquals(4, result);
		
		assertNotEquals(3, result);
		
		//đầu vào
		//xử lý
		//đầu ra
		// 2, 2 => 4
		
	}

}
