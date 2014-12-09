
import java.util.Scanner;
public class ColumnarCipher {


    /**
     * Aven Stewart
     * 12/2/2014
     */
    
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int SKIPVAR = 1;
		char SPACECHAR = '$';
		String input = "ERROR";
		
		System.out.print(
    			"===============================\n" +
    			"Columnar Cipher Generator v1.0\n" +
    			"===============================\n" +
    			" ~~ Written by Aven Stewart ~~\n" //+
    			//"\n" +
    			/*"Enter a sentence to encrypt:"*/);
    	System.out.println("\nEncryption[1] or decryption[2]?");
    	int input1 = scan1.nextInt();
    	if (input1 == 1){
    		System.out.println("Enter encryption keynum:");
    		SKIPVAR = scan1.nextInt();
    		System.out.println("\nEnter space replacement character:");
    		String spacecharstr = scan1.next();
    		SPACECHAR = spacecharstr.charAt(0);
    		System.out.println("\nEnter phrase to encrypt:");
    		Scanner scan2 = new Scanner(System.in);
    		input = scan2.nextLine();
    		input = input.replace(' ',SPACECHAR);
    		String crypted = crypt(SKIPVAR, SPACECHAR, input);
    		System.out.println("Encrypted string: "+crypted);
    		scan2.close();
    	}
    	else{
    		System.out.println("Enter encryption keynum:");
    		SKIPVAR = scan1.nextInt();
    		System.out.println("\nEnter space replacement character:");
    		String spacecharstr = scan1.next();
    		SPACECHAR = spacecharstr.charAt(0);
    		System.out.println("\nEnter phrase to decrypt:");
    		Scanner scan3 = new Scanner(System.in);
    		input = scan3.nextLine();
    		input = input.replace(' ',SPACECHAR);
    		String decrypted = decrypt(SKIPVAR, SPACECHAR, input);
            System.out.println(decrypted);
            scan3.close();
    	}
        scan1.close();

    }

    public static String crypt(int SKIPVAR, char SPACECHAR, String input){
            while (input.length() % SKIPVAR != 0){
                    input = input + SPACECHAR;
            }
            int StrLength = input.length();
            String concat = "";
            for (int a = 0;a<=SKIPVAR-1; a++){
            	for ( int b = a;b<StrLength;b+=SKIPVAR){
            		concat = concat + input.charAt(b);
            	}
            }
            return concat;
    }
    public static String decrypt(int SKIPVAR, char SPACECHAR, String input){
            int StrLength = input.length();
            String concat2 = "";
            int divdnd = StrLength/SKIPVAR;
            for (int a = 0;a<=divdnd-1;a+=1){
                    concat2 = concat2 + input.charAt(a);
            }
            String concat = "";
            
            // Magic 
            for (int c = 0; c < concat2.length(); c +=1){    
                concat = concat + concat2.charAt(c);
                  for (int b = c; b <= StrLength-1;b += divdnd){
                          if (b + divdnd > StrLength-1){
                        	  break;
                          }
                          else {
                        	  concat = concat + input.charAt(b + divdnd);
                          }
                  }
            }
            concat = concat.replace(SPACECHAR, ' ');
            return concat;
    }
}
