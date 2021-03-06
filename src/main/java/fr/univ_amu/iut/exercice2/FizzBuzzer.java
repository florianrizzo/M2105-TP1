package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if(i % 15 == 0)
            return "FizzBuzz";
        if(i % 3 == 0)
            return "Fizz";
        if(i % 5 == 0)
            return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        String [] list = new String [i];
        for (int j = 1; j < i+1; ++j)
        {
            list[j-1] = computeString(j);
        }
        return list;
    }
}
