import java.io.PrintStream;

public class SesionexcededException extends Exception {
	
	
	
	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
		System.out.println("as execido el limite de cantidd de la sesion");
		
		
	}

}
