package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.util.ExtNoSuchElementException;


public class util_test {

	@Test
	public void test() {
		String st="sarah";
		Object[] obj= {1,2,3};
		Throwable th=null;
		Throwable t2 = new Throwable();
		
		ExtNoSuchElementException ext = new ExtNoSuchElementException(st);
		ExtNoSuchElementException ext1 = new ExtNoSuchElementException(th);
		ExtNoSuchElementException ext2 = new ExtNoSuchElementException(th, st);
		ExtNoSuchElementException ext3 = new ExtNoSuchElementException(st, obj);
		ExtNoSuchElementException ext4 = new ExtNoSuchElementException(th, st, obj);
		ExtNoSuchElementException ext5 = new ExtNoSuchElementException(t2, null, obj);

		
		assertEquals("sarah", ext3.getFormat());
		assertNotNull(ext4.getMessage());
		assertArrayEquals(obj, ext3.getArguments());
		
		
		assertEquals(null, ext4.nextThrowable());
		assertEquals(false, ext4.isWrapper());
	}

}
