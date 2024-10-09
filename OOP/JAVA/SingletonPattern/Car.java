public class Car {
   
   private int carNum=10000;
   private static int idx=0;

   public Car(){
       idx++;
       carNum +=idx;
   }

   public int getCarNum(){
       return this.carNum;
   }
    
}
