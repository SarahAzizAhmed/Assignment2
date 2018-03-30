package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtIllegalArgumentException;


public class illegalArgumentExcep_test {

	@Test
	public void test() {
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtIllegalArgumentException ext = new ExtIllegalArgumentException(st);
		ExtIllegalArgumentException ext1 = new ExtIllegalArgumentException(th);
		ExtIllegalArgumentException ext2 = new ExtIllegalArgumentException(th, st);
		ExtIllegalArgumentException ext3 = new ExtIllegalArgumentException(st, obj);
		ExtIllegalArgumentException ext4 = new ExtIllegalArgumentException(th, st, obj);
		ExtIllegalArgumentException ext5 = new ExtIllegalArgumentException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
