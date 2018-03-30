package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.DefaultEnvironment;

public class def_environment_test {

	@Test
	public void test() {
	
	DefaultEnvironment de = new DefaultEnvironment();
	
	assertEquals(System.in,de.in());
	assertEquals(System.out,de.out());
	assertEquals(System.err,de.err());
	
	de.setExitStatus(0);
	
	assertEquals(0,de.getExitStatus());
	//assertEquals(0,de.exit());
}
}
