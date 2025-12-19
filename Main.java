public class Main {
    public static void main(String[] args) {
        ConcreteConferenceMediator mediator = new ConcreteConferenceMediator();

        User galya = new ConcreteUser("Галия", mediator);
        User aynur = new ConcreteUser("Айнур", mediator);
        User kamilla = new ConcreteUser("Камилла", mediator);

        mediator.addUser(galya);
        mediator.addUser(aynur);
        mediator.addUser(kamilla);

        galya.sendMessage("Привет всем!");
        aynur.toggleMicrophone(true);
        kamilla.toggleCamera(true);
        galya.toggleScreenShare(true);
    }
}
