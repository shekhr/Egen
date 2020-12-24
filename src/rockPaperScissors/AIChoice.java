package rockPaperScissors;

public class AIChoice {
    public String getAiChoice() {
        return aiChoice;
    }

    public void setAiChoice(String aiChoice) {
        this.aiChoice = aiChoice;
    }

    private String aiChoice;
    public AIChoice(){

        int choice = (int)(Math.random()*3);
        if(choice == 1){
            setAiChoice(Utility.ROCK);
        }else if(choice == 2){
            setAiChoice(Utility.PAPER);
        }else{
            setAiChoice(Utility.SCISSORS);
        }
    }
}
