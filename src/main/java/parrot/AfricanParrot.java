package parrot;

public class AfricanParrot extends Parrot {

    public AfricanParrot() {
        super(ParrotTypeEnum.AFRICAN, 1, 0, false);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, 12.0 - 9.0);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}

