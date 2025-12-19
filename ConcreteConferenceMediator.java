import java.util.ArrayList;
import java.util.List;

public class ConcreteConferenceMediator implements ConferenceMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message, sender);
            }
        }
    }

    @Override
    public void notifyMicrophoneChange(User sender, boolean isOn) {
        for (User user : users) {
            if (user != sender) {
                user.updateMicrophoneStatus(sender, isOn);
            }
        }
    }

    @Override
    public void notifyCameraChange(User sender, boolean isOn) {
        for (User user : users) {
            if (user != sender) {
                user.updateCameraStatus(sender, isOn);
            }
        }
    }

    @Override
    public void notifyScreenShare(User sender, boolean isSharing) {
        for (User user : users) {
            if (user != sender) {
                user.updateScreenShareStatus(sender, isSharing);
            }
        }
    }
}
