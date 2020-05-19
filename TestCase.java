public class TestCase {
  public void test(int year){

      //Test Case 1:
      // if(year%400==0){
      //   System.out.println("Leap Year");
      // }

      //Test Case 2: Leap year % 100 or Leap %400 !=0
      if(year%100==0){
        if(year%400!=0){
          System.out.println("This "+year+" is Not leap year");
        }else{
          System.out.println("this "+year+ " is Leap year");
        }
      }

  }
  
} 