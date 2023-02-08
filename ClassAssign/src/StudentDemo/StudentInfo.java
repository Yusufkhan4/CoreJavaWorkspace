package StudentDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentInfo {
		
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("Enter the Number of Students");
	     int n = sc.nextInt();
		 Student[] arr = new Student[n];
		 StudCRUD s = new StudCRUD();
		 int ch,sch;
		 int id = 0;
		 String name = "";
		 int subMarks[] = new int[3];
		 int sum = 0;
		 
		 
	     
	     do {
	    	 System.out.println("1: ADD STUDENT \n2: SEARCH STUDENT \n3: DISPLAY STUDENT \n4: EXIT");
	    	 ch = sc.nextInt();
	    	 switch(ch) {
	    	 case 1: 
	    		 System.out.println("Enter Student Id");
	 			id=sc.nextInt();
	 			System.out.println("Enter Student Name");
	 			 name=br.readLine();
	 			System.out.println("Enter three subject marks");
	 			
	 			 for(int i=0;i<3;i++) {
	 				 subMarks[i] = sc.nextInt();
	 			 }
	 			int sump = 0;
	 			for(int i=0;i<subMarks.length;i++) {
	 				sump +=sump + subMarks[i];
	 			}
	 			double percentage = sump /3;
	 			char gr;
	 			
	 			int perc = (int) percentage;
	 		      // System.out.println(perc);
	 		      if(perc >= 70){
	 		          gr =  'O';        
	 		      }else if(perc>60 && perc <69){
	 		       gr =  'A'; 
	 		      }else if(perc>50 && perc <59){
	 		       gr =  'B'; 
	 		      }else if(perc>35 && perc <49){
	 		       gr =  'C'; 
	 		      }else if(perc <35){
	 		       gr =  'D'; 
	 		      }else {
	 		    	 gr =  'F';  
	 		      }
	 			 Student stud = new Student(id,name,subMarks,percentage,gr);
	 			 boolean b = s.addStudent(stud);
	 			 
	 			if(b)
					System.out.println("Student Added successfully...");
				else
					System.out.println("Student insertion failed...");
			
				break;
				
	    	 case 2:
	    		 System.out.println("Choice 1 option from below:");
	    		 System.out.println("Search Student \n1. By ID \n2. By Name \n3. By Percentage \n4. By Grade");
		    	 sch = sc.nextInt();
		    	 switch(sch) {
			    	 case 1 : System.out.println("Enter the Id of the student");
			    	 int sid = sc.nextInt();
			    	 Student searchID = s.searchStudentID(sid);
			    	 
			    	 System.out.println(searchID);
			    	 break;
			    	 
			    	 case 2: System.out.println("Enter the name of the student");
			    	 String sname = br.readLine();
			    	 Student[] searchName = s.searchStudentName(sname);
			    	 
					 for(int i=0;i<searchName.length;i++){
						System.out.println(searchName[i]);
					 }
			    	 
			    	 
			    	 break;
			    	 
			    	 case 3: System.out.println("Enter the percentage of the student");
			    	 double sperc = sc.nextDouble();
			    	 Student[] searchPerc = s.searchStudentPercentage(sperc);
			    	 
			    	 System.out.println(searchPerc);
			    	 for(int i=0;i<searchPerc.length;i++){
							System.out.println(searchPerc[i]);
						 }
			    	 
			    	 break;
			    	 
			    	 case 4: System.out.println("Enter the grade of the student");
			    	 char sgrade = sc.next().charAt(0);
			    	 Student searchGrade[] = s.searchStudentGrade(sgrade);
			    	 
			    	 for(int i=0;i<searchGrade.length;i++){
			    		 System.out.println(searchGrade);
						 }
			    	 
			    	 break;
			    	 
			    	 default:System.out.println("Wrong Choice!!!");
						break;
		    	 }
		    	 break;
	    		 
	    	 case 3:
	    		 s.display();
	    		 break;
	    		 
	    	 case 4: System.out.println("EXITED..");
	    		 break;
	    	
	    	 default:System.out.println("Wrong Choice!!!");
				break;
	    	 }
	    		 
	    	 }while(ch!=4);
	    	 
		
	}

}

