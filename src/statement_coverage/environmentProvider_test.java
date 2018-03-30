package statement_coverage;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import de.susebox.java.lang.Environment;
import de.susebox.java.lang.EnvironmentProvider;

public class environmentProvider_test {

	@Test
	public void test() {
		
		EnvironmentProvider ep=new EnvironmentProvider();
		Object obj=1;
		Environment env=new Environment() {

			@Override
			public InputStream in() throws UnsupportedOperationException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PrintStream out() throws UnsupportedOperationException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public PrintStream err() throws UnsupportedOperationException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setExitStatus(int status) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getExitStatus() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void exit() throws UnsupportedOperationException {
				// TODO Auto-generated method stub
				
			}
		
	};
	
	EnvironmentProvider.setEnvironment(obj, env);
	try
	{
	EnvironmentProvider.setEnvironment(null, env);
	}
	catch(NullPointerException n)
	{}
	try
	{
		EnvironmentProvider.setEnvironment(obj, null);
	}
	catch(NullPointerException n)
	{}
	EnvironmentProvider.setEnvironment(obj.getClass(), env);
	assertNotNull(EnvironmentProvider.getEnvironment(obj));
	
	EnvironmentProvider.removeEnvironment(obj);
	EnvironmentProvider.removeEnvironment(obj.getClass());
	EnvironmentProvider.getEnvironment(obj.getClass());
	}
}
