package no.ntnu.oblig2;

public class GoldMembership extends Membership{
    private final float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private final float POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;

    public GoldMembership(int points, String membershipName) {
        super(points, membershipName);
    }

    @Override
    public int registerPoints(int bonusPointBalance, int newPoints) {
        if(bonusPointBalance < 90000) {
            bonusPointBalance += Math.round(newPoints + POINTS_SCALING_FACTOR_LEVEL_1);
        }
            else if(bonusPointBalance >= 90000){
            bonusPointBalance += Math.round(newPoints + POINTS_SCALING_FACTOR_LEVEL_2);
            }
        return bonusPointBalance;
        }
    }


