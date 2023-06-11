package observer;

public class MatchSummeryObserver  implements ScoreCardObserver{
    
        @Override
        public void notifyNewDilivery(String Matchstate){
            System.out.println("Update the Match summery with new match state "+Matchstate) ;
        }
    
}

