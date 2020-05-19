public class TestCase {
  public void test(int year){

      //Test Case 1:
      // if(year%400==0){
      //   System.out.println("Leap Year");
      // }

      //Test Case 2: Leap year % 100 or Leap %400 !=0
      // if(year%100==0){
      //   if(year%400!=0){
      //     System.out.println("This "+year+" Not is leap year");
      //   }else{
      //     System.out.println("this "+year+ " is Leap year");
      //   }
      // }

      // Test Case 3:
      // if(year%4 ==0){
      //   if(year%100 !=0){
      //     System.out.println("This "+year+" is Leap year");
      //   }
      // }else{
      //   System.out.println("This "+year+" is Not leap year");
      // }

      //Test Case 4:
      if(year%4==0){
        System.out.println("This "+year+" is Not leap year");
      }else{
        System.out.println("This "+year+" is leap year");
      }

  }
  
} 