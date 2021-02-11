package no.ntnu.oblig2;

public class BasicMembership extends Membership {


    public BasicMembership(int points) {
        super(points);
    }

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        bonusPointBalance += newPoints;
        return bonusPointBalance;
    }

    @Override
    public String getMemberShipName() {
        return "Basic";
    }
}
