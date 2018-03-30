package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtRuntimeException;

public class runtimeException {

	@Test
	public void test() {
		
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtRuntimeException ext = new ExtRuntimeException(st);
		ExtRuntimeException ext1 = new ExtRuntimeException(th);
		ExtRuntimeException ext2 = new ExtRuntimeException(th, st);
		ExtRuntimeException ext3 = new ExtRuntimeException(st, obj);
		ExtRuntimeException ext4 = new ExtRuntimeException(th, st, obj);
		ExtRuntimeException ext5 = new ExtRuntimeException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
