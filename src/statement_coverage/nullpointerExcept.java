package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtNullPointerException;

public class nullpointerExcept {

	@Test
	public void test() {
		
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtNullPointerException ext = new ExtNullPointerException(st);
		ExtNullPointerException ext1 = new ExtNullPointerException(th);
		ExtNullPointerException ext2 = new ExtNullPointerException(th, st);
		ExtNullPointerException ext3 = new ExtNullPointerException(st, obj);
		ExtNullPointerException ext4 = new ExtNullPointerException(th, st, obj);
		ExtNullPointerException ext5 = new ExtNullPointerException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
