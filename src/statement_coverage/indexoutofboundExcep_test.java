package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtIndexOutOfBoundsException;


public class indexoutofboundExcep_test {

	@Test
	public void test() {
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtIndexOutOfBoundsException ext = new ExtIndexOutOfBoundsException(st);
		ExtIndexOutOfBoundsException ext1 = new ExtIndexOutOfBoundsException(th);
		ExtIndexOutOfBoundsException ext2 = new ExtIndexOutOfBoundsException(th, st);
		ExtIndexOutOfBoundsException ext3 = new ExtIndexOutOfBoundsException(st, obj);
		ExtIndexOutOfBoundsException ext4 = new ExtIndexOutOfBoundsException(th, st, obj);
		ExtIndexOutOfBoundsException ext5 = new ExtIndexOutOfBoundsException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
