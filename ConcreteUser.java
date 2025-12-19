public class ConcreteUser extends User {

    public ConcreteUser(String name, ConferenceMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " отправляет сообщение: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message, User sender) {
        System.out.println(name + " получил сообщение от " + sender.name + ": " + message);
    }

    @Override
    public void toggleMicrophone(boolean isOn) {
        System.out.println(name + " микрофон " + (isOn ? "включен" : "выключен"));
        mediator.notifyMicrophoneChange(this, isOn);
    }

    @Override
    public void toggleCamera(boolean isOn) {
        System.out.println(name + " камера " + (isOn ? "включена" : "выключена"));
        mediator.notifyCameraChange(this, isOn);
    }

    @Override
    public void toggleScreenShare(boolean isSharing) {
        System.out.println(name + " демонстрация экрана " + (isSharing ? "началась" : "остановлена"));
        mediator.notifyScreenShare(this, isSharing);
    }

    @Override
    public void updateMicrophoneStatus(User sender, boolean isOn) {
        System.out.println(name + " видит, что у " + sender.name + " микрофон " + (isOn ? "включен" : "выключен"));
    }

    @Override
    public void updateCameraStatus(User sender, boolean isOn) {
        System.out.println(name + " видит, что у " + sender.name + " камера " + (isOn ? "включена" : "выключена"));
    }

    @Override
    public void updateScreenShareStatus(User sender, boolean isSharing) {
        System.out.println(name + " видит, что " + sender.name + " " + (isSharing ? "делится экраном" : "закрыл демонстрацию экрана"));
    }
}
