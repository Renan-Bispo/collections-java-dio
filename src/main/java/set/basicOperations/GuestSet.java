package set.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
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

    public static void main(String[] args) {
        GuestSet guestSet = new GuestSet();

        guestSet.addGuest("Renan", 1234);
        guestSet.addGuest("Nanan", 1235);
        guestSet.addGuest("Maria", 1234);
        guestSet.addGuest("João", 1236);

        System.out.println(guestSet.countGuest() + " convidados dentro da lista ");

        guestSet.displayGuest();

        guestSet.removeGuestForInvitationCode(1236);
        guestSet.displayGuest();
    }
}
