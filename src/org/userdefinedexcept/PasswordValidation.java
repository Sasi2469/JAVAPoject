package org.userdefinedexcept;

public class PasswordValidation {
    
	public static void passwordChecking(String password) throws PasswordMismatchException {
	    
		
		String capital="" ;
		String number="" ;
		
		String special="";
		String small="";
		
		char[] charArray = password.toCharArray();
		
		for (char c : charArray) {
			if(c >= 'A' && c<='Z') {
				capital = capital+ c;
			}
			
			else if(c >= 'a' && c<='z') {
				small = small+ c;
			}

			else if(c >= '0' && c<='9') {
				number = number+ c;
			}
			

			else {
				special = special+c;
			}
			
			
		
		}

		
			
	if(capital.isEmpty() || small.isEmpty()||number.isEmpty()|| special.isEmpty() || special.contains(" ") || password.length() <= 8 ) {
		
		throw  new PasswordMismatchException("Please enter valid password") ;
	}

	else {
		
		System.out.println("password valid and confirmed");
	}
	}
	
}
