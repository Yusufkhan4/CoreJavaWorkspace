package StudentDemo;

import java.util.ArrayList;
import java.util.List;

public class StudCRUD {

	List<Student>studList; 
	public StudCRUD() {
			studList = new ArrayList<>(); //ArrayList implements ListInterface and its type is an object type
		}
		public boolean addStudent(Student stud) {
			if(stud !=null) {
				boolean b = studList.add(stud);
				return b;
			}
			else {
				return false;
			}
		}
		
		public void display() {
			for(Student stud: studList) {
				System.out.println(stud);
			}
	}
		public Student searchStudentID(int sid) {
			Student searchedId = null;
			for(int i=0;i<studList.size();i++) {
				Student st = studList.get(i);
				if(st.getId() == sid) {
					searchedId = st;
					break;
				}
			}
			return searchedId;
		}
		
		public Student[] searchStudentName(String sname) {
				Student searchedName[] = new Student[studList.size()];
			for(int i=0;i<studList.size();i++) {
				Student st = studList.get(i);
				if(st.getName().toLowerCase().equals(sname.toLowerCase())) {//contains
					searchedName[i] = st;
				}
			}
			
			return searchedName;
		}
		
		public Student[] searchStudentPercentage(double sperc) {
			Student searchedPerc[] = new Student[studList.size()];;
			
			for(int i=0;i<studList.size();i++) {
				Student st = studList.get(i);
				if(st.getPercentage() == sperc) {
					searchedPerc[i] = st;
					break;
				}
			}
			return searchedPerc;
		}
		
		public Student[] searchStudentGrade(char sgrade) {
			Student searchedGrade[] = new Student[studList.size()];;
			
			for(int i = 0;i<studList.size();i++) {
				Student st = studList.get(i);
				if(st.getGrade() == sgrade) {
					searchedGrade[i] = st;
					break;
				}
			
			}
			return searchedGrade;
		}
}


