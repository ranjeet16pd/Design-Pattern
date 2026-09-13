package Observer;

import java.util.ArrayList;
import java.util.List;

interface IParticipant {

    void update(String senderName, String message);

    String getName();
}

interface IChatGroup {

    void addParticipant(IParticipant participant);

    void removeParticipant(IParticipant participant);

    void sendMessage(IParticipant sender, String message);
}

class ChatGroup implements IChatGroup {

    private final List<IParticipant> participants;
    private final String groupName;

    ChatGroup(String groupName) {
        this.groupName = groupName;
        this.participants = new ArrayList<>();
    }

    @Override
    public void addParticipant(IParticipant participant) {
        participants.add(participant);
    }

    @Override
    public void removeParticipant(IParticipant participant) {
        participants.remove(participant);
    }

    @Override
    public void sendMessage(IParticipant sender, String message) {

        System.out.println(
                "Message sent in " + groupName +
                        " by " + sender.getName()
        );

        notifyParticipants(sender, message);
    }

    private void notifyParticipants(
            IParticipant sender,
            String message
    ) {

        for (IParticipant participant : participants) {

            // Sender ko apna message notification nahi milega
            if (participant != sender) {
                participant.update(
                        sender.getName(),
                        message
                );
            }
        }
    }
}

class Participant implements IParticipant {

    private final String name;

    Participant(String name) {
        this.name = name;
    }

    @Override
    public void update(String senderName, String message) {

        System.out.println(
                name +
                        " received message from " +
                        senderName +
                        ": " +
                        message
        );
    }

    @Override
    public String getName() {
        return name;
    }
}

public class ChatGroupNotificationSystemMain {

    public static void main(String[] args) {

        IChatGroup chatGroup =
                new ChatGroup("OCL Unofficial");

        IParticipant participant1 =
                new Participant("Rj");

        IParticipant participant2 =
                new Participant("Rj2");

        IParticipant participant3 =
                new Participant("Rj3");

        IParticipant participant4 =
                new Participant("Rj4");

        chatGroup.addParticipant(participant1);
        chatGroup.addParticipant(participant2);
        chatGroup.addParticipant(participant3);
        chatGroup.addParticipant(participant4);

        chatGroup.sendMessage(
                participant1,
                "Hi, how are you?"
        );

        System.out.println(
                "---- Rj3 left the group ----"
        );

        chatGroup.removeParticipant(participant3);

        chatGroup.sendMessage(
                participant1,
                "Good morning!"
        );
    }
}