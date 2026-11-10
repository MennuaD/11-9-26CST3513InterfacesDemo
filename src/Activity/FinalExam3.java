package Activity;

public class FinalExam3 extends GradedActivity implements Relatable{
    private int nmQuestions, nmMissed; // total questions and amount missed
    private double pointsEach; // points for each question

    public FinalExam3(int questions, int missed){ // parameters are # questions on exam and # student missed
        double numericScore;
        nmQuestions = questions;
        nmMissed = missed;

        pointsEach = (100.0/questions); //calc points per question
        numericScore = 100.0 - (missed * pointsEach); //calc score using points each

        setScore(numericScore); //uses parent class method, setScore() to set score to numericScore

    }
    //Mennua Netri Herta Davis
    public double getPointsEach() { //returns points per question
        return pointsEach;
    }

    public int getMissed() { //returns questions missed
        return nmMissed;
    }

    public boolean equals(GradedActivity g){ //compares parameter object to object called from for equality
        boolean status;
        if(this.getScore() == g.getScore()){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    public boolean isGreater(GradedActivity g){
        boolean status;
        if(this.getScore() > g.getScore()){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    public boolean isLess(GradedActivity g){
        boolean status;
        if(this.getScore() < g.getScore()){
            status = true;
        }else{
            status = false;
        }
        return status;
    }

}
