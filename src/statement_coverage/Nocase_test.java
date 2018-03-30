package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.NoCaseSequenceStore;

public class Nocase_test {

	@Test
	public void test() {
		
		NoCaseSequenceStore ncs = new NoCaseSequenceStore(true);
		assertEquals('S', ncs.getStartChar('s'));
		assertEquals(1, ncs.compare('t', 's'));
	}

}
