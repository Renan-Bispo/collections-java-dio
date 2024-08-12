package set.basicOperations;

public class guest {
    private String name;
    private int invitationCode;

    public guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return "guest{" +
                "name='" + name + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}
