package sample;

public class DiceRoller {

    public String roll(int diceCount, int maxNum){
        String output = "";

        for(int x = 0; x<diceCount; x++)
        {
            int random = (int)(Math.random()*maxNum)+1;
            output = output+"Dice "+(x+1)+" rolled: "+random+"!!"+"\n";
        }

        return output;
    }
}

