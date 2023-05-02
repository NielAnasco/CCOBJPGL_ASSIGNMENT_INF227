public class App {

    public static void main(String[] args) {
       
        Earth earth = new Earth();
        Uranus uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        earth.accept(astronaut);
        uranus.accept(astronaut);

        earth.accept(rover);
        uranus.accept(rover);

    }
}
