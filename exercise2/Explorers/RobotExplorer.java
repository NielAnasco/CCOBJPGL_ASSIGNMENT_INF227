public class RobotExplorer implements Explorer {
   
    public void visit(Earth earth) {
        System.out.println("Loading instructions from system... Wall-E exploring Earth");
    }
    public void visit(Uranus uranus) {
        System.out.println("Loading instructions from system... Autobots exploring Uranus");
    }

}
