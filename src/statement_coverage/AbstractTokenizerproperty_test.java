package statement_coverage;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import de.susebox.java.lang.ExtIllegalArgumentException;
import de.susebox.jtopas.AbstractTokenizerProperties;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.TokenizerPropertyEvent;
import de.susebox.jtopas.TokenizerPropertyListener;

public class AbstractTokenizerproperty_test {

	@Test
	public void test() {
		AbstractTokenizerProperties atp = new AbstractTokenizerProperties() {

			@Override
			public String getWhitespaces() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getSeparators() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getStrings() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getLineComments() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getBlockComments() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getSpecialSequences() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getKeywords() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getPatterns() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getProperties() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected TokenizerProperty doAddProperty(TokenizerProperty property) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected TokenizerProperty doRemoveProperty(TokenizerProperty property) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected TokenizerProperty doGetProperty(int type, String startImage) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected String doSetWhitespaces(String whitespaces) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected String doSetSeparators(String separators) {
				// TODO Auto-generated method stub
				return null;
			}
	};
	assertNotNull(atp.isFlagSet(0));
	
	String[] s = {"a"};
	Object obj = 0;
	TokenizerProperty tp = new TokenizerProperty(0, s, obj, 0, 0);
	
	assertNotNull(atp.isFlagSet(tp, 1));
	
	atp.setWhitespaces(" ");
	
	try
	{
		atp.addWhitespaces("sarahisagoodgirl");
		fail("ERROR");
	}
	catch(IllegalArgumentException e)
	{
		
	}
	
	try
	{
		atp.removeWhitespaces("sarahisagoodgirl");
		fail("ERROR");
	}
	catch(IllegalArgumentException e)
	{
		
	}
	
	atp.setSeparators("A");
	try
	{
		atp.addSeparators("sarahisagoodgirl");
		fail("ERROR");
	}
	catch(IllegalArgumentException e)
	{
		
	}
	
	try
	{
		atp.removeSeparators("sarahisagoodgirl");
		fail("ERROR");
	}
	catch(IllegalArgumentException e)
	{
		
	}
	
	atp.addString("a", "b", "n");
	atp.addString("a", "b", "n", obj);
	atp.addString("a", "b", "n", obj,1);
	atp.addString("a", "b", "n", obj,1,1);
	
	try
	{
		atp.removeString("A");
		atp.removeString("");
	}
	catch(IllegalArgumentException e)
	{
		
	}
	
	assertNull(atp.getStringCompanion("abc"));
	
	assertNotNull(atp.stringExists("String"));
	
	assertNull(atp.getStringCompanion("String"));
	
	atp.addLineComment("String");
	atp.addLineComment("String", obj);
	atp.addLineComment("String", obj, 0);
	atp.addBlockComment("String", "b", obj, 0, 0);
	
	atp.removeLineComment("String");
	
	assertNull(atp.getLineCommentCompanion("String"));
	
	assertNotNull(atp.lineCommentExists("String"));
	
	atp.addBlockComment("a", "b");
	atp.addBlockComment("a", "b", obj);
	atp.addBlockComment("a", "b", obj, 0);
	atp.addBlockComment("a", "b", obj, 0, 0);
	
	atp.removeBlockComment("String");
	
	assertNull(atp.getBlockCommentCompanion("String"));
	assertNotNull(atp.blockCommentExists("String"));
	
	atp.addSpecialSequence("a");
	atp.addSpecialSequence("a", obj);
	atp.addSpecialSequence("a", obj, 0);
	atp.addSpecialSequence("a", obj, 0, 0);
	
	atp.removeSpecialSequence("String");
	
	assertNull(atp.getSpecialSequenceCompanion("String"));
	
	assertNotNull(atp.specialSequenceExists("String"));
	
	atp.addKeyword("a");
	atp.addKeyword("a",obj);
	atp.addKeyword("a", obj, 0);
	atp.addKeyword("a", obj, 0, 0);
	
	atp.removeKeyword("String");
	
	assertNull(atp.getKeywordCompanion("String"));
	
	assertNotNull(atp.keywordExists("String"));
	
	atp.addPattern("a");
	atp.addPattern("a",obj);
	atp.addPattern("a", obj, 0);
	atp.addPattern("a", obj, 0, 0);
	
	atp.removePattern("String");
	
	assertNull(atp.getPatternCompanion("String"));
	
	assertNotNull(atp.patternExists("String"));
	
	atp.removeProperty(tp);
	
	assertNotNull(atp.propertyExists(tp));
	
	TokenizerPropertyListener tpl = new TokenizerPropertyListener() {

		@Override
		public void propertyChanged(TokenizerPropertyEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	
	};
	atp.addTokenizerPropertyListener(tpl);
	
	atp.removeTokenizerPropertyListener(tpl);
	
	Map m1 = new HashMap<>();
	
	
	atp.publicMapCharacterSet(m1, "zxcz", false);
	
	
	atp.publicEscapeChar('\\');
	atp.publicEscapeChar('a');
	
	StringBuffer sb = new StringBuffer("abc");
	atp.publicAddRange(sb, '-', '\\');
	
	atp.publicMergeSet("abcd", "basda", true);
	
	assertNotNull(atp.publicNormalizeFlags(10, 0));
	
	atp.publicCheckArgument("String", "String");
	
	try
	{
		atp.publicCheckArgument(null, "String");
		fail("ERROR");
	}
	catch(ExtIllegalArgumentException e)
	{
		
	}
	
	TokenizerProperty tp2 = null;
	
	try
	{
		atp.publicCheckPropertyArgument(tp2);
		fail("ERROR");
	}
	catch(ExtIllegalArgumentException e)
	{
		
	}
	
	TokenizerProperty tp3 = new TokenizerProperty(0, null);
	try
	{
		atp.publicCheckPropertyArgument(tp3);
		fail("ERROR");
	}
	catch(ExtIllegalArgumentException e)
	{
		
	}
	
	atp.publicHandleEvent(0, "String", "abc");
	atp.publicHandleEvent(0, null, "abc");
	

}
	}
