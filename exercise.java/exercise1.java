public class App {
   static boolean iwillReview = true;
   static boolean iwillNotFail = true;
   
   public static void main (String[]args) throws Exception {
   
    App myReview = new App();
   
    // precondition
    assert iwillReview == true: "I'm studying.";
   
    myReview.study();
   
    // postcondition
    assert iwillNotFail == true: "I will ace this school year!";
   
    }

   void study() {
   iwillNotFail = false;

 }
  
}
