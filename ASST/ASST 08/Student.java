import java.util.*;

public class Student{
        private   String firstName;
        private   String  lastName;
        private   Integer studentId;
        private   Integer grades;
        public Student(){}
        public Student( String fname, String lname, int id, int grade){ 
            firstName = fname;
            lastName = lname;
            studentId = id;
            grades = grade;
        }
	
        public String getFirstName (){return firstName;}
        public String getLastName (){return lastName;}
        public Integer  getStudentId (){return studentId;}
        public Integer getGrades (){return grades;}

        public void setFirstName (String fname){firstName=fname;}
        public void setLastName (String lname){lastName=lname;}
        public void setStudentId (int id){studentId=id;}
        public void setGrades (int grade){grades=grade;}

        public String toString(){
            return "" + studentId + "  " + firstName + " " + lastName + " " + grades;
        } 
}