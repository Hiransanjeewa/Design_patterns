package Observerr;

public class BallingcardObserver implements ScorecardObserver {

    @Override
    public void notifyNewDilivery(String matchstate) {
        System.out.println("Updating the balling card with new matchstate : "+matchstate);

    }
}
