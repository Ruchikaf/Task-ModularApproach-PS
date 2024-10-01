package com.controller;

import java.util.Scanner;

import com.service.PatientService;

public class PatientController {

	public static void main(String[] args) throws Exception {
		PatientService s=new PatientService();
		Scanner sc=new Scanner(System.in);
	   for(;;) {
		   System.out.println("\nChose option :");
		   System.out.println("1.Insert Data");
		   System.out.println("2.Update Data");
		   System.out.println("3.Delete Data");
		   System.out.println("4.Fetch All Records");
		   System.out.println("5.EXIT");
		   int op=sc.nextInt();
		   switch(op) {
		   case 1:
			   s.insertData();
			   break;
		   case 2:
			   s.updateData();
			   break;
		   case 3:
			   s.deleteData();
			   break;
		   case 4:
			   s.fetchAllRecords();
			   break;
		   case 5:
			   System.out.println("EXITING ...");
			   sc.close();
			   return;
			default:
				System.out.println("Wrong option ");
				break;
		   }
	   }

	}

}
