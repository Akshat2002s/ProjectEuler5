import java.util.*;
public class SmallMultiple {

	public static void main(String[] args) {
		int num=999999999;
		char flag=0;
		for(int i=1; i<num; i++) {
			flag=0;
			for (int j=1; j<21;j++) {
				if(i%j!=0) {
					flag=1;
				}
				
			}
			if(flag==0)
				System.out.println(i);
		}
		
	}
}
				
					
				
			
			
			
		

		



