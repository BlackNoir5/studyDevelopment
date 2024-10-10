import java.util.ArrayList;

public class Student
{
   private int s_id = 10000;
   private String name = "";
   ArrayList<Subject> subjectList;

   public Student(String name){
       this.s_id = ++s_id;
       this.name = name;
       subjectList = new ArrayList<>();
   }

   public void addSubject(String name, int score){
       Subject subject = new Subject();

       subject.setName(name);
       subject.setScore(score);
       subjectList.add(subject);
   }

   public String getName(){
       return this.name;
   }

   public int getS_id(){
       return this.s_id;
   }

   public void setName(String name){
       this.name = name;
   }

   public void setS_id(int s_id){
       this.s_id = s_id;
   }
}
