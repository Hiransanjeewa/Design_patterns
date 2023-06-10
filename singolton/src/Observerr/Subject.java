package Observerr;

import java.util.ArrayList;
import java.util.List;

//This is like a newspaper agency
//this class is responsible for updating the scorecards when the match status changes
public class Subject {

    // Maintains list of observsers
    private List<ScorecardObserver> Scorecards=new ArrayList<ScorecardObserver>();

    // Allowing observers to subscribe
    public void subscribe(ScorecardObserver scorecard){
        Scorecards.add(scorecard);
    }
    // Allowing observers to unsubscribe
    public void unsubscribe(ScorecardObserver scorecard){
        Scorecards.remove(scorecard);
    }

    // When the matchstate changes notify all the observers
    public void notifyObservers(String matchstate){

        for(ScorecardObserver scorecard:Scorecards){
            scorecard.notifyNewDilivery(matchstate);
        }
    }
}
