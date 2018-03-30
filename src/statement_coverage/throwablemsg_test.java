package statement_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ThrowableList;
import de.susebox.java.lang.ThrowableMessageFormatter;

public class throwablemsg_test {

	@Test
	public void test() {
		
		ThrowableList tl = new ThrowableList() {
			
			@Override
			public Throwable nextThrowable() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWrapper() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getFormat() {
				// TODO Auto-generated method stub
				return "abc";
			}
			
			@Override
			public Throwable getCause() {
				// TODO Auto-generated method stub
				Throwable t = new Throwable();
				return t;
			}
			
			@Override
			public Object[] getArguments() {
				// TODO Auto-generated method stub
				Object[] obj = {1,2,3};
				return obj;
			}
		};
		ThrowableMessageFormatter.getMessage(tl);
		
	}

}
