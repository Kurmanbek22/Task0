public class Sheep extends Cow {
    public Sheep() {
    }

    public Sheep(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);

    }

    @Override
    public String toString() {
        return "Sheep{}";
    }
}
