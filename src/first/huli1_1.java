package first;

import java.sql.SQLOutput;

public class huli1_1 {


	public static void main(String[] args) {
		String str = "";
		String mac ="";
		 for (int i = 0; i < 10; i++) {
			   for (int j = 0; j < 10 - i; j++)
			    //System.out.print(" ");
			   	str+=" ";
			   for (int k = 0; k < (2 * i + 1); k++)
			    //System.out.print("X");
				   str+="X";
			   System.out.println(str);
			   if(i==0){
			   	mac=str;
			   }
			   str = "";
			  }
		//System.out.println("    X");
		System.out.println(mac);
	}

}
