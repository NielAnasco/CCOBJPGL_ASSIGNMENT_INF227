public class Earth implements Planet {
    
    public void accept(Explorer explorer) {
        explorer.visit(this);
  
    }
}
