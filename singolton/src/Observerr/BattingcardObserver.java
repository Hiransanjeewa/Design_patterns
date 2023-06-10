package Observerr;

public class BattingcardObserver implements ScorecardObserver{
    @Override
    public void notifyNewDilivery(String matchstate) {
        System.out.println("Updating the batting card with new matchstate : "+matchstate);
    }
}
