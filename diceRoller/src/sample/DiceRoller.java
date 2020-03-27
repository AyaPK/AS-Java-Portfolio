package sample;

public class DiceRoller {

    public String roll(int diceCount, int maxNum){
        String output = "";
        int totalvalue = 0;
        for(int x = 0; x<diceCount; x++)
        {
            int random = (int)(Math.random()*maxNum)+1;
            totalvalue += random;
            output = output+"Dice "+(x+1)+" rolled: "+random+"\n";
        }
        output = output+"\nThe total value of the dice rolled is: "+totalvalue;

        return output;
    }
}

