package Builder;

public class SphericalRobotBuilder extends RobotBuilder {

    @Override
    RobotBuilder setPrice() {
        this.price = 20000;
        return this;
    }

    @Override
    RobotBuilder setWarrantyYears() {
        this.warrantyYears = 5;
        return this;
    }

    @Override
    RobotBuilder setType() {
        this.type = "Spherical";
        return this;
    }

    @Override
    RobotBuilder setHeadType() {
        this.headType = "Spherical";
        return this;
    }

    @Override
    RobotBuilder setBodyType() {
        this.bodyType = "Spherical";
        return this;
    }

    @Override
    RobotBuilder setLegsType() {
        this.legsType = "Spherical";
        return this;
    }
}