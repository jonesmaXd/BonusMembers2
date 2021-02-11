package no.ntnu.oblig2;

import java.time.LocalDate;

public class BonusMember {

    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPointsBalance, String name, String eMailAddress){
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.eMailAddress = eMailAddress;
    }

    public void registerBonusPoints(int newPoints){
        membership.registerPoints(bonusPointsBalance, newPoints);
    }

    public void checkAndSetMembership(){

    }

    public Boolean checkPassword(String password){
        if(password.equals(this.password)){
            return true;
        }
        else{
            return false;
        }
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }

    public String getName() {
        return name;
    }

    public String getEMailAddress() {
        return eMailAddress;
    }

    public String getPassword() {
        return password;
    }

}
