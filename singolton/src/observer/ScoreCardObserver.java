package observer;

public interface ScoreCardObserver {
    // a method used to communicate with
    // new events to the observers

    //todo: use an object for match state
    void notifyNewDilivery(String Matchstate);

   
}
