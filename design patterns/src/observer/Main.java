

package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Scorecards (observers)

               //summerry(score,wickerts,overs)
               //Balling card
               // batting card

        //Subjects(publishers)

        // Create subject
        Subject subject = new Subject();

        // create observers
        ScoreCardObserver battingcard =new BattingCardObserver();
        ScoreCardObserver bowlingcard = new BowlingCardObserver();
        ScoreCardObserver matchsummery= new MatchSummeryObserver();

        // Subscribe
        subject.subscribe(battingcard);
        subject.subscribe(bowlingcard);
        subject.subscribe(matchsummery);


        System.out.println("===========New Dilivery ============");
        subject.notifyNewDilivery("Bat 1 -> 20,Bat 2 -> 38");

        Thread.sleep(5000);
        System.out.println("===========New Dilivery ============");

        subject.notifyNewDilivery("Bat 1 -> 26,Bat 2 -> 83");

        Thread.sleep(5000);
        System.out.println("===========New Dilivery ============");

         subject.notifyNewDilivery("Bat 3 -> 50,Bat 2 -> 100");


    }
}