package rockPaperScissors;

public class UserChoice extends AIChoice {
    public String getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    private String userChoice;
    public UserChoice(){
    }

    public UserChoice(String userChoice){
        setUserChoice(userChoice);
    }

    public void getResult(){
        System.out.println("User selected "+getUserChoice());
        System.out.println("Computer selected "+getAiChoice());

        if(getUserChoice().equals(getAiChoice())) {
            System.out.println("It's a tie!");
        } else if((getUserChoice().equals("rock") && getAiChoice().equals("scissors")) || (getUserChoice().equals("scissors") && getAiChoice().equals("paper")) || (getUserChoice().equals("paper") && getAiChoice().equals("rock"))) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
