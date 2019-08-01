package Builder;

public class CubicalRobotBuilder extends RobotBuilder {

    @Override
    RobotBuilder setPrice() {
        this.price = 60000;
        return this;
    }

    @Override
    RobotBuilder setWarrantyYears() {
        this.warrantyYears = 10;
        return this;
    }

    @Override
    RobotBuilder setType() {
        this.type = "Cubical";
        return this;
    }

    @Override
    RobotBuilder setHeadType() {
        this.headType = "Cubical";
        return this;
    }

    @Override
    RobotBuilder setBodyType() {
        this.bodyType = "Cubical";
        return this;
    }

    @Override
    RobotBuilder setLegsType() {
        this.legsType = "Cubical";
        return this;
    }
}