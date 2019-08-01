package Builder;

public abstract class RobotBuilder {

     int id, price, warrantyYears;
    int idCounter;
      String type;
     String headType;
    String bodyType;
     String legsType;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getLegsType() {
        return legsType;
    }

    abstract RobotBuilder setPrice();
//        {
//            if (price.length > 0) {
//                this.price = price[0];
//            } else {
//                this.price = (this.type.equals("Spherical")) ? 60000 : 20000;
//
//            }
//
//            return this;
//        }

    abstract RobotBuilder setWarrantyYears();
//        {
//            this.warrantyYears = warrantyYears;
//            return this;
//
//        }

    abstract RobotBuilder setType();
//        {
//            this.type = type;
//            return this;
//
//        }

    abstract RobotBuilder setHeadType();
//        {
//            this.headType = headType;
//            return this;
//
//        }

    abstract RobotBuilder setBodyType();
//        {
//            this.bodyType = bodyType;
//            return this;
//
//        }

    abstract RobotBuilder setLegsType();
//        {
//            this.legsType = legsType;
//            return this;
//
//        }



    Robot Builder() {
        if (legsType == null) throw new IllegalArgumentException("LegsType must not be  null");
        if (bodyType == null) throw new IllegalArgumentException("BodyType must not be  null");
        if (headType == null) throw new IllegalArgumentException("HeadType must not be  null");
        if (price == 0) this.price = (type.equals("Spherical")) ? 600000 : 10000;

        return new Robot(type, warrantyYears, price, headType, bodyType, legsType);
    }

}