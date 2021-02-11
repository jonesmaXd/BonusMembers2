package no.ntnu.oblig2;


public abstract class Membership {

    private int points;


    public Membership(int points) {
        this.points = points;
    }

    public int registerPoints(int bonusPointBalance, int newPoints) {
        this.points = bonusPointBalance + newPoints;
        return points;
    }

    public String getMemberShipName() {
        return "";
    }
}
