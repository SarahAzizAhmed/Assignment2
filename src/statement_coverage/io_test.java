package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.io.ExtIOException;

public class io_test {
	@Test
	public void test() {
		
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtIOException ext1 = new ExtIOException(th);
		ExtIOException ext2 = new ExtIOException(th, st);
		ExtIOException ext3 = new ExtIOException(st, obj);
		ExtIOException ext4 = new ExtIOException(th, st, obj);
		ExtIOException ext5 = new ExtIOException(t2, null, obj);

		
		assertEquals("sarah", ext3.getFormat());
		assertNotNull(ext4.getMessage());
		assertArrayEquals(obj, ext3.getArguments());
		
		
		assertEquals(null, ext4.nextThrowable());
		
		
		
	}

}
