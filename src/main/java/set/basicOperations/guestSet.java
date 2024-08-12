package set.basicOperations;

import java.util.Set;

public class guestSet {

    private Set<Guest> guestSet;

    public guestSet(Set<Guest> guestSet) {
        this.guestSet = guestSet;
    }

    public void addGuest(String name, int invitationCode){
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuestForInvitationCode(int invitationCode){
        Guest guestToRemove = null;

        for (Guest g: guestSet){
            if (g.getInvitationCode() == invitationCode){
                guestToRemove = g;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuest(){
        return guestSet.size();
    }

    public void displayGuest(){
        System.out.println(guestSet);
    }
}
