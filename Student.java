public class Student {
    public String name, studentId;
    public char gender, grade;
    public int age;
    public boolean isFulltime;


    public void setInfo(String name,String studentId, char gender, char grade, int age, boolean isFulltime) {
        this.name = name;
        this.studentId=studentId;
        this.gender=gender;
        this.grade=grade;
        this.age=age;
        this.isFulltime=isFulltime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", isFulltime=" + isFulltime +
                '}';
    }
}
/*
Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */