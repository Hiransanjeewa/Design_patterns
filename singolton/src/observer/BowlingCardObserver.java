package observer;

public class BowlingCardObserver implements ScoreCardObserver{

        @Override
        public void notifyNewDilivery(String Matchstate){
            System.out.println("Update the Bowling with new match state "+ Matchstate) ;
        }
}

