import java.util.Arrays;

public class Farm {
    private Cow[]  ferm;

    public Farm() {
    }

    public Farm(Cow[] ferm) {
        this.ferm = ferm;

    }

    public Cow[] getFerm() {
        return ferm;
    }

    public void setFerm(Cow[] ferm) {
        this.ferm = ferm;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "ferm=" + Arrays.toString(ferm) +
                '}';
    }
}
