package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtNoSuchMethodException;


public class nosuchmethodExcep_test {

	@Test
	public void test() {
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtNoSuchMethodException ext = new ExtNoSuchMethodException(st);
		ExtNoSuchMethodException ext1 = new ExtNoSuchMethodException(th);
		ExtNoSuchMethodException ext2 = new ExtNoSuchMethodException(th, st);
		ExtNoSuchMethodException ext3 = new ExtNoSuchMethodException(st, obj);
		ExtNoSuchMethodException ext4 = new ExtNoSuchMethodException(th, st, obj);
		ExtNoSuchMethodException ext5 = new ExtNoSuchMethodException(t2, null, obj);
		
		assertEquals(null, ext4.getCause());
		assertEquals(null, ext3.nextThrowable());
		assertEquals(false, ext2.isWrapper());
		assertEquals("sarah", ext4.getFormat());
		assertArrayEquals(obj, ext4.getArguments());
		assertNotNull(ext4.getMessage());
	}

}
