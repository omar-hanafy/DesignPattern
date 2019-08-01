package Builder.Company;
import Builder.Robot;
import Builder.RobotDirector;
import Builder.SphericalRobotBuilder;

public class CompanySimulator {
    public static void main(String[] args) {
        RobotDirector robotDirector = new RobotDirector(new SphericalRobotBuilder());
        Robot robot = robotDirector.getRobot();
        System.out.println(robot);

    }

}