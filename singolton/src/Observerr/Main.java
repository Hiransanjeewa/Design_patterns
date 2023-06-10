package Observerr;

public class Main {
    public static void main(String[] args) {
        // Scorecards (Observers) Subscribers
               //Summary (current score - wickets,overs)
               //Batting cart
               //Balling cart


        //Subject Publisher

        Subject subject=new Subject();
        ScorecardObserver battingCard=new BattingcardObserver();
        ScorecardObserver ballingCard=new BallingcardObserver();
        ScorecardObserver matchSummary=new MatchSummaryObserver();

        // subscribe
        subject.subscribe(ballingCard);
        subject.subscribe(battingCard);
        subject.subscribe(matchSummary);

        subject.notifyObservers("Bat1-> 20, Bat2 -> 39 ");
        subject.notifyObservers("Bat1-> 34, Bat2 -> 54 ");
        subject.notifyObservers("Bat1-> 78, Bat2 -> 67 ");
    }
}
