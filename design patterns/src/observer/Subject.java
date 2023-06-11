package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // Just like a newspaper agency
    // class responsible for updating the scorecards when match states changes

        private List<ScoreCardObserver> ScoreCards = new ArrayList<ScoreCardObserver>();

        // Allowing observers to subscribe
        public void subscribe(ScoreCardObserver scoreCard){
            ScoreCards.add(scoreCard);
        }
        // Allowing observers to unsubscribe
        public void unsubscribe(ScoreCardObserver scoreCard){
            ScoreCards.remove(scoreCard);
        }
        // When the match states changes notify the all observers

        public void notifyNewDilivery(String matchsState){

            for (ScoreCardObserver scorecard: ScoreCards){

                scorecard.notifyNewDilivery(matchsState);
            }

        }
    }

