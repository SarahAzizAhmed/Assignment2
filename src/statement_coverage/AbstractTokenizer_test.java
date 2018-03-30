package statement_coverage;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import de.susebox.jtopas.TokenizerProperties;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.TokenizerPropertyListener;

public class AbstractTokenizer_test {

	@Test
	public void test() {
		
		TokenizerProperties tp = new TokenizerProperties() {

			@Override
			public void setParseFlags(int flags) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getParseFlags() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isFlagSet(int flag) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isFlagSet(TokenizerProperty prop, int flag) throws NullPointerException {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void setWhitespaces(String whitespaces) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addWhitespaces(String whitespaces) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeWhitespaces(String whitespaces) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getWhitespaces() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setSeparators(String separators) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addSeparators(String separators) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeSeparators(String separators) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String getSeparators() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addString(String start, String end, String escape)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addString(String start, String end, String escape, Object companion)
					throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addString(String start, String end, String escape, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addString(String start, String end, String escape, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeString(String start) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getStringCompanion(String start)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean stringExists(String start) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getString(String start) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getStrings() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addLineComment(String lineComment)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addLineComment(String lineComment, Object companion)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addLineComment(String lineComment, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addLineComment(String lineComment, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeLineComment(String lineComment) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getLineCommentCompanion(String lineComment) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean lineCommentExists(String lineComment) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getLineComment(String lineComment) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getLineComments() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addBlockComment(String start, String end)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addBlockComment(String start, String end, Object companion)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addBlockComment(String start, String end, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addBlockComment(String start, String end, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeBlockComment(String start) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getBlockCommentCompanion(String start) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean blockCommentExists(String start) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getBlockComment(String start) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getBlockComments() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addSpecialSequence(String specSeq)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addSpecialSequence(String specSeq, Object companion)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addSpecialSequence(String specSeq, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addSpecialSequence(String specSeq, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeSpecialSequence(String specSeq) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getSpecialSequenceCompanion(String specSeq) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getSpecialSequences() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean specialSequenceExists(String specSeq) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getSpecialSequence(String specSeq) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addKeyword(String keyword) throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addKeyword(String keyword, Object companion)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addKeyword(String keyword, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addKeyword(String keyword, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeKeyword(String keyword) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getKeywordCompanion(String keyword) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getKeywords() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean keywordExists(String keyword) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getKeyword(String keyword) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addPattern(String pattern) throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPattern(String pattern, Object companion)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPattern(String pattern, Object companion, int flags)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addPattern(String pattern, Object companion, int flags, int flagMask)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removePattern(String pattern) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object getPatternCompanion(String pattern) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean patternExists(String pattern) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public TokenizerProperty getPattern(String pattern) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Iterator getPatterns() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void addProperty(TokenizerProperty property)
					throws IllegalArgumentException, UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeProperty(TokenizerProperty property) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Iterator getProperties() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean propertyExists(TokenizerProperty property) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void addTokenizerPropertyListener(TokenizerPropertyListener listener) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void removeTokenizerPropertyListener(TokenizerPropertyListener listener) {
				// TODO Auto-generated method stub
				
			}
	};
	}

}
