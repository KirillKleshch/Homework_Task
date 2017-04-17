package ua.kpi.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Kirill on 15.04.2017.
 */
public class Model implements GlobalVariables{
    private int secretValue;
    private int minBarrier = MIN_VALUE ;
    private int maxBarrier = MAX_VALUE ;
    private List<Integer> allUserValues = new ArrayList<Integer>();

    public Model() {
        secretValue = randValue(minBarrier,maxBarrier);
    }

    public int randValue(int minBarrier,int maxBarrier ){
        return  minBarrier + (int)Math.round((Math.random()*(maxBarrier-minBarrier)));
    }

    public boolean checkValue(int valueFromUser){
        allUserValues.add(valueFromUser);
        if(valueFromUser == secretValue) {
           return true;
        }
        if(valueFromUser > secretValue) {
           maxBarrier = valueFromUser-1;
           return false;
        }
        else{
           minBarrier = valueFromUser+1;
           return false;
        }
    }
   public int getMinBarrier(){
       return minBarrier;
   }

    public int getSecretValue() {
        return secretValue;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public List<Integer> getAllUserValues() {
        return allUserValues;
    }

    public void setSecretValue(int secretValue){this.secretValue = secretValue;}

}
