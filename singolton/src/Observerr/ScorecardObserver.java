package Observerr;

// Observer Interface
public interface ScorecardObserver {
    // A method used to communicate about
    // New events to the observers

    void notifyNewDilivery(String matchstate);

}
