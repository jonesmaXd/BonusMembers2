package no.ntnu.oblig2;


public abstract class Membership {

    private int points;


    public Membership(int points) {
        this.points = points;
    }

    public abstract int registerPoints(int bonusPointBalance, int newPoints);

    public abstract String getMemberShipName();
}
