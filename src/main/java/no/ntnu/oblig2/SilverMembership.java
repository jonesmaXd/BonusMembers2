package no.ntnu.oblig2;

public class SilverMembership extends Membership {

    private final float POINTS_SCALING_FACTOR = 1.2f;

    public SilverMembership(int points) {
        super(points);
    }

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        bonusPointBalance += Math.round(newPoints * POINTS_SCALING_FACTOR);
        return bonusPointBalance;
    }
    public String getMemberShipName() {
        return "Silver";
    }
}

