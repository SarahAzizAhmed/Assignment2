package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtUnsupportedOperationException;

public class unsupportedopExcept_test {

	@Test
	public void test() {
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtUnsupportedOperationException ext = new ExtUnsupportedOperationException(st);
		ExtUnsupportedOperationException ext1 = new ExtUnsupportedOperationException(th);
		ExtUnsupportedOperationException ext2 = new ExtUnsupportedOperationException(th, st);
		ExtUnsupportedOperationException ext3 = new ExtUnsupportedOperationException(st, obj);
		ExtUnsupportedOperationException ext4 = new ExtUnsupportedOperationException(th, st, obj);
		ExtUnsupportedOperationException ext5 = new ExtUnsupportedOperationException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
