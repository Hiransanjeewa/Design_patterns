package observer;

public class BattingCardObserver implements ScoreCardObserver{

    @Override
    public void notifyNewDilivery(String Matchstate){
        System.out.println("Update the scorecard with new match state "+Matchstate) ;
    }

  
}
