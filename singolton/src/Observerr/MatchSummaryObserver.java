package Observerr;

public class MatchSummaryObserver implements ScorecardObserver{
    @Override
    public void notifyNewDilivery(String matchstate) {
        System.out.println("Updating the match summary with new matchstate : "+matchstate);

    }
}
