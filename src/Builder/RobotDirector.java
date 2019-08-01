package Builder;

public class RobotDirector {
    RobotBuilder b;

   public RobotDirector(SphericalRobotBuilder b) {
        this.b = b;
    }

    public Robot getRobot() {
        b.setType()
                .setPrice()
                .setBodyType()
                .setHeadType()
                .setLegsType();
        return b.Builder();
    }
}
