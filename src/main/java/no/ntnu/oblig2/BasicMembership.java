package no.ntnu.oblig2;

public class BasicMembership extends Membership {


    public BasicMembership(int points, String membershipName) {
        super(points, membershipName);
    }

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        bonusPointBalance += newPoints;
        return bonusPointBalance;
    }
}
