public class Subject
{
   private String name = "";
   private int score = 0;

   public Subject(){}

   public String getName(){
       return this.name;
   }

   public int getScore(){
       return this.score;
   }

   public void setName(String name){
       this.name = name;
   }

   public void setScore(int score){
       this.score = score;
   }
}
