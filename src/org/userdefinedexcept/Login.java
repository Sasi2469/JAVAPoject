package org.userdefinedexcept;
public class Login {

	
	public static void PasswordValid() throws PasswordMismatchException {
		
		
			PasswordValidation.passwordChecking("Sasi@1995");
			
		
		
                System.out.println("sasi");
	}
	
	
	public static void main(String[] args) throws PasswordMismatchException {
		
		
			PasswordValid();
		
	}
}


