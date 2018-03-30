package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerException;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.SequenceStore;
import de.susebox.jtopas.spi.DataProvider;

public class sequence_test {

	@Test
	public void test() throws NullPointerException, TokenizerException {
		SequenceStore ss = new SequenceStore(false);
		assertEquals(false, ss.hasSequenceCommentOrString());
		
		DataProvider dp = new DataProvider() {

			@Override
			public char getCharAt(int index) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public char[] getData() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public char[] getDataCopy() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getStartPosition() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getLength() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		assertEquals(null, ss.startsWithSequenceCommentOrString(dp));
		assertEquals(0, ss.getSequenceMaxLength());
		assertEquals(false, ss.hasKeywords());
		assertEquals(null, ss.isKeyword(dp));
		
		final String[] s = {"a","b"};
		Object obj = 1;
		TokenizerProperty tp = new TokenizerProperty(0, s, obj,0, 0);
		assertEquals(null, ss.addSpecialSequence(tp));
		
		assertNotNull(ss.removeSpecialSequence("a"));
		assertNull(ss.getSpecialSequence("a"));
		assertNotNull(ss.getSpecialSequences(0));
		
		assertEquals(null, ss.addKeyword(tp));
		
		assertNotNull(ss.removeKeyword("a"));
		assertNull(ss.getKeyword("a"));
		assertNotNull(ss.getKeywords());
		
		
		ss.publicInsertMapped('a', tp);
		
		
		ss.publicCompare("abcdef", "qb", 0);
		
		ss.publicComparePrefix("abc", dp, 0);

		
	}

}
