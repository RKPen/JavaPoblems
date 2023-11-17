import java.util.*;

public class Student{
        private    String firstName;
        private   String  lastName;
        public Student(){}
        public Student( String fname, String lname) {
            firstName = fname;
            lastName = lname;
        }
	
        public String getFirstName (){return firstName;}
        public String getLastName (){return lastName;}
        public void setFirstName (String fname){firstName=fname;}
        public void setLastName (String lname){lastName=lname;}
        public String toString(){
            return firstName + " " + lastName;
        } 

    
} 