/**
 * 
 */
package grp1.new1;

import java.util.Scanner;
import java.io.IOException;
public class console {

	
	

	   public static void main( String[] args )throws IOException
		    {
		    	double pr, rate, t,si,co;
		    	int ch=0;
		    	App ob1=new App();
		        Scanner sc=new Scanner (System. in);
		        System.out.write("Enter the amount:".getBytes());
		        pr=sc.nextDouble();
		        System. out. write("Enter the No.of years:".getBytes());
		        t=sc.nextDouble();
		        System. out.write("Enter the Rate of  interest".getBytes());
		        rate=sc.nextDouble();
		        System. out.write("Choose 1 to find Simple Interest.\n 2. to find Compound Interest".getBytes());
		        ch=sc.nextInt();
		        switch(ch)
		        {
		        	case 1:
		        	       si=ob1.simpleint(pr,t,rate);
		        	       System.out.write("Simple Interest=".getBytes());
		        	       System.err.print(si);
		        	       break;
		        	case 2:  
		        		   co=ob1.simpleint(pr,t,rate);
		        	       System.out.write("Compound Interest=".getBytes());
		        	       System.err.print(co);
		        	       break;
		        default:
		            	System.out.write("Wrong move".getBytes());
		            	break;
		       }

	}
}


