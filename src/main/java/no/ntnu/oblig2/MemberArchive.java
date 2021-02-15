package no.ntnu.oblig2;


import java.time.LocalDate;
import java.util.HashMap;

/**
 * The member archive holds all the bonus members. The archive provides
 * functionality for adding members to the register, looking up bonuspoints
 * of given members, registering new bonuspoints and listing all the members.
 *
 * @author arne
 */
public class MemberArchive {

    // Use a HashMap, since the members have a unique member number.
    private HashMap<Integer, BonusMember> members;

    /**
     * Creates a new instance of no.ntnu.oblig2.MemberArchive.
     */
    public MemberArchive() {
        this.members = new HashMap<>();
        this.fillRegisterWithTestdata();
    }

    /**
     * Adds a new member to the register. The new member must have a memebr number
     * different from exsisting members. If not, the new member will not be added.
     *
     * @return {@code true} if the new member was added successfully,
     * {@code false} if the new member could not be added, due to a
     * membernumber that allready exsists.
     */
    public boolean addMember(BonusMember bonusMember) {

        boolean success = false;
        if (!this.members.containsKey(bonusMember.getMemberNumber())) {
            success = true;
            this.members.put(bonusMember.getMemberNumber(), bonusMember);
        } else {
            System.out.println("Member with member number: " + bonusMember.getMemberNumber() + " was not found");

            success = false;
        }
        return success;
    }


    public int findPoints(int memberNumber, String password) {
        int foundPoints = 0;
        boolean isMemberReal = this.members.containsKey(memberNumber);
        BonusMember member = this.members.get(memberNumber);
        if (isMemberReal) {
            if (member.checkPassword(password)) {
                foundPoints = member.getBonusPointsBalance();
            }
        } else {
            foundPoints = -1;
        }
        return foundPoints;

    }


    /**
     * Registers new bonuspoints to the member with the member number given
     * by the parameter {@code memberNumber}. If no member in the register
     * matches the provided member number, {@code false} is returned.
     *
     * @param memberNumber the member number to add the bonus points to
     * @param bonusPoints  the bonus points to be added
     * @return {@code true} if bonuspoints were added successfully,
     * {@code flase} if not.
     */
    public boolean registerPoints(int memberNumber, int bonusPoints) {
        boolean success = false;
        BonusMember bonusMember = this.members.get(memberNumber);
        if (this.members.containsKey(memberNumber)) {
            bonusMember.registerBonusPoints(bonusPoints);
            success = true;
        } else {
            System.out.println("Member with member number: " + memberNumber + " was not found");
            success = false;
        }


        return success;
    }

    /**
     * Lists all members to the console.
     */
    public void listAllMembers() {
        for(BonusMember bonusMember : this.members.values()){
            printMemberDetails(bonusMember);
        }

    }

    public void printMemberDetails(BonusMember bonus) {
        System.out.println("Member Number: " + bonus.getMemberNumber());
        System.out.println("Enrolled date: " + bonus.getEnrolledDate());
        System.out.println("Name: " + bonus.getName());
        System.out.println("Email address: " + bonus.getEMailAddress());
        System.out.println("points available: " + bonus.getBonusPointsBalance());
        System.out.println("Membership level: " + bonus.getMemberShipLevel());
        System.out.println("");
    }


    /**
     * Fills the register with some arbitrary members, for testing purposes.
     */
    public void fillRegisterWithTestdata() {
        BonusMember member = new BonusMember(1, LocalDate.now(), 10000, "Olsen, Ole", "ole@olsen.biz");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(2, LocalDate.now(), 15000, "Jensen, Jens", "jens@jensen.biz");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(3, LocalDate.now(), 5000, "Lie, Linda", "linda@lie.no");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(4, LocalDate.now(), 30000, "Paulsen, Paul", "paul@paulsen.org");
        this.members.put(member.getMemberNumber(), member);
        member = new BonusMember(5, LocalDate.now(), 75000, "FLo, Finn", "finn.flo@gmail.com");
        this.members.put(member.getMemberNumber(), member);

    }

}