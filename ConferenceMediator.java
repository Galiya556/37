import java.util.List;

public interface ConferenceMediator {
    void sendMessage(String message, User sender);
    void notifyMicrophoneChange(User sender, boolean isOn);
    void notifyCameraChange(User sender, boolean isOn);
    void notifyScreenShare(User sender, boolean isSharing);
}
