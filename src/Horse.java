public class Horse extends  Cow{
 private String color;

    public Horse(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Horse(int weight, int age, char gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                '}';
    }
}
