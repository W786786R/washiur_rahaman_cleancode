package grp1.new1;
import java.util.Scanner;
import java.io.IOException;

public class client {

	

	public static void main(String[] args)throws IOException {
		
		
		house ob1=new house();
		double size,co;
    	int ch=0;
		Scanner sc=new Scanner (System. in);
		 System.out.write("Enter the area of the house you want:".getBytes());
	        size=sc.nextDouble();
	        
	        
	        
	        System. out.write("Choose 1 to Use Standard material.\n 2. to Use Above Standard material \n 3. to Use High Standard material  \n  4.to Use High Standard material And Fully Automated ".getBytes());
	        ch=sc.nextInt();
	        switch(ch)
	        {
	        	case 1:
	        		co=ob1.stndrd(size);
     	            System.out.write("Total cost needed=".getBytes());
     	            System.err.print(co);
     	            break;
	        	case 2:
	        		co=ob1.abvstndrd(size);
     	            System.out.write("Total cost needed=".getBytes());
     	            System.err.print(co);
     	            break;
	        	case 3:
	        		co=ob1.high(size);
     	            System.out.write("Total cost needed=".getBytes());
     	            System.err.print(co);
     	            break;
	        	case 4:
	        		co=ob1.auto(size);
     	            System.out.write("Total cost needed=".getBytes());
     	            System.err.print(co);
     	            break;
	        	default:
	            	System.out.write("Wrong move".getBytes());
	            	break;




	}

}
}
