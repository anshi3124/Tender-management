import java.util.Scanner;

import Tender.Mainclasses.adminmain;
import Tender.Mainclasses.vendermain;
import Tender.Model.Vender;

public class Main {
	
	public static adminmain adminobj = new adminmain();
	public static vendermain venderobj = new vendermain();
	
	
	public static  void Entry() {
		
	//	String k=null;
		System.out.println("WELCOME TO SMART TENDER MANAGER ");
		System.out.println("--------------------------------------");
		System.out.println("enter your choice ");
		System.out.println("----> 1 If you are admin ");

		System.out.println("----> 2 If you are vender ");

		System.out.println("----> 3 for exit ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//k =sc.next();
		
		

		if(a==1){
			
			adminobj.Admintask();
			//break;
			
		}else if(a==2) {
			
		venderobj.Vendertask();
		//break;
		}else if(a != 1 ||a != 2 ) {
			System.out.println("Invalid Entry");
			Entry() ;
		//	break;
		return;
		};
//		else if (k != null) {
//			System.out.println("Kindly choose appropiate option");
//		};
	//}
		
	}
	
	
public static void main(String[] args) {
	
	
	//while(true) {
	Entry();
	
}
}
