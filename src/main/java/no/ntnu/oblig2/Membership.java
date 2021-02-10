package no.ntnu.oblig2;


public class Membership {

private int points;
private String membershipName;



public Membership(int points, String memberShipName){
    this.points = points;
    this.membershipName = memberShipName;
}

public int registerPoints(int bonusPointBalance, int newPoints){
    bonusPointBalance += newPoints;
    return newPoints;
}
public String getMemberShipName(){
    return this.membershipName;
}
}
