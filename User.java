public abstract class User {
    protected String name;
    protected ConferenceMediator mediator;

    public User(String name, ConferenceMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message, User sender);

    public abstract void toggleMicrophone(boolean isOn);
    public abstract void toggleCamera(boolean isOn);
    public abstract void toggleScreenShare(boolean isSharing);

    public abstract void updateMicrophoneStatus(User sender, boolean isOn);
    public abstract void updateCameraStatus(User sender, boolean isOn);
    public abstract void updateScreenShareStatus(User sender, boolean isSharing);
}
