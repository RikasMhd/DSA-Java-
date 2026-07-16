import java.util.ArrayList;

class Student{
    private String name;
    private int age;
    private double grade;

    Student(String name, int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    double getGrade(){
        return this.grade;
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    void setGrade(double grade){
        this.grade=grade;
    }
}
public class Q3{
    public static  void traverse(ArrayList<Student> studentList){
        for(int i=0;i<studentList.size();i++){
            System.out.println("Name: "+studentList.get(i).getName()+" , "+"Age: "+studentList.get(i).getAge()+" , "+"Grade: "+studentList.get(i).getGrade());

        }
    } 
    public static void main(String[] args) {
        ArrayList <Student> studentList = new ArrayList<>();

        //Add three student objects to the studentList with the following details:
        Student s1=new Student("John Doe",18,85.5 );
        Student s2=new Student("Jane Smith",17,92.0);
        Student s3=new Student("Michael Johnson",19,78.3 );

        //adding Students to StudentList
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        
        //Print the details of all the students in the studentList.
        System.out.println("Print Students");
        traverse(studentList);
        System.out.println();
        

        //Update the grade of "John Doe" to 90.2.
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getName().equals("John Doe")){
                studentList.get(i).setGrade(90.2);
            }
        }

        //Remove "Jane Smith" from the studentList.
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getName().equals("Jane Smith")){
                studentList.remove(i);
            }
        }

        //Print the details of all the students in the studentList after the modifications.
        System.out.println("Print Update Student List");
        traverse(studentList);
    }
}