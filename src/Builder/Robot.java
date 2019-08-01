package Builder;

public class Robot {
    private int id, price, warrantyYears;
    private static int idCounter;
    private String type, headType, bodyType, legsType;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getLegsType() {
        return legsType;
    }

    Robot() {
        this.id = idCounter++;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    private Robot(String type) {
        this.id = idCounter++;
        this.type = type;
        this.price = (type.equals("Spherical")) ? 60000 : 20000;
        this.warrantyYears = (type.equals("Spherical")) ? 10 : 5;
        this.headType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
        this.bodyType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
        this.legsType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
    }

    private Robot(String type, int warrantyYears) {
        this(type);
        this.warrantyYears = warrantyYears;

    }

    private Robot(String type, int warrantyYears, int price) {
        this(type, warrantyYears);
        this.price = price;

    }

    Robot(String type, int warrantyYears, int price, String headType, String bodyType, String legsType) {
        this(type, warrantyYears, price);
        this.headType = headType;
        this.bodyType = bodyType;
        this.legsType = legsType;

    }

    @Override
    public String toString() {
        return id + "  " + type + "  " + warrantyYears + "  " + price + "  " + headType + "  " + bodyType + "  " + legsType;

    }



}
