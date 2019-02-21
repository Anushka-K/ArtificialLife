import java.io.PrintWriter;
import java.util.ConcurrentModificationException;

public class ALifeSim {

  public static void printReport(Pair<String,Integer>[] counts, int iterations) {
    PrintWriter pen = new PrintWriter(System.out, true);

    pen.println("After " + iterations + " ticks:");
    pen.println("Cooperators =" + counts[0].getRight());
    pen.println("Defectors =" + counts[1].getRight());
    pen.println("Partial Cooperators =" + counts[2].getRight());
    pen.println("");
    pen.println("");
    pen.println("Mean Cooperation Probability = ");

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
    int coopNum= Integer.parseInt(args[1]);
    int defectNum= Integer.parseInt(args[2]);
    int partialNum= Integer.parseInt(args[3]);
    Population thisWorld= new Population(map(coopNum, defectNum, partialNum));
    
    int iterations= Integer.parseInt(args[0]);
    
    for(int i=0; i<iterations; i++) {
      thisWorld.update();
       }
    Pair<String,Integer>[] counts= thisWorld.getPopulationCounts();
    
    printReport(counts, iterations);
    
    
    //print result
  }

}
