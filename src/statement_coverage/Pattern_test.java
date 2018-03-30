package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerException;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.PatternMatcher;
import de.susebox.jtopas.spi.DataProvider;

public class Pattern_test {

	@Test
	public void test()throws NullPointerException, TokenizerException {
		{
			final String[] s = {"a","b"};
			Object obj = 1;
			TokenizerProperty tp = new TokenizerProperty(0, s, obj, 16384, 16384);
			
			
			
			PatternMatcher pm = new PatternMatcher(tp, 16384);
			assertTrue(pm.hasPattern());
			
			DataProvider dp = new DataProvider() {
				
				@Override
				public int getStartPosition() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getLength() {
					// TODO Auto-generated method stub
					return 1;
				}
				
				@Override
				public char[] getDataCopy() {
					// TODO Auto-generated method stub
					char[] c = {'a'};
					return c;
				}
				
				@Override
				public char[] getData() {
					// TODO Auto-generated method stub
					char[] c = {'a'};
					return c;
				}
				
				@Override
				public char getCharAt(int index) {
					// TODO Auto-generated method stub
					return 'a';
				}
			};
			
			assertNotNull(pm.matches(dp));
			
			pm.setProperty(tp);
			
			assertEquals(tp, pm.getProperty());		
			
			
		}
	}
}
