

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ConcurrentModificationException;

public class ALifeSim {

  public static void printReport( int iterations,Population thisWorld) {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    Pair<String,Integer>[] counts= thisWorld.getPopulationCounts();
    
    DecimalFormat df = new DecimalFormat("#.##");    
    
    pen.println("After " + iterations + " ticks:");
    pen.println("Cooperators = " + counts[0].getRight());
    pen.println("Defectors = " + counts[1].getRight());
    pen.println("Partial Cooperators = " + counts[2].getRight());
    pen.println("");
    pen.println("");
    pen.println("Mean Cooperation Probability = "+ String.valueOf(df.format(
              thisWorld.calculateCooperationMean())));

  }

  
  public static Pair<String,Integer>[] map(int collabNum, int defNum, int partialNum) {
    Pair<String,Integer>[] pop = (Pair<String,Integer>[]) (new Pair[3]);
    pop[0] = new Pair<String, Integer>("Cooperator", collabNum);
    pop[1] = new Pair<String, Integer>("Defector", defNum);
    pop[2] = new Pair<String, Integer>("Partial-Cooperator", partialNum);
    return pop;
  }
  public static void main(String args[]) throws ConcurrentModificationException, Exception {
    // java ALifeSim <#/iterations> <#/cooperators> <#/defectors> <#/partial cooperators>

    //the simulation runs
    int coopNum= Integer.parseInt(args[2]);
    int defectNum= Integer.parseInt(args[3]);
    int partialNum= Integer.parseInt(args[4]);
    Population thisWorld= new Population(map(coopNum, defectNum, partialNum));
    
    int iterations= Integer.parseInt(args[1]);
    
    for(int i=0; i<iterations; i++) {
      thisWorld.update();
       }
    
    
    printReport( iterations, thisWorld);
    
    
    //print result
  }

}
