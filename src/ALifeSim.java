import java.io.PrintWriter;

public class ALifeSim {
  /*
   * public void printReport() { PrintWriter pen=new PrintWriter(System.out, true);
   * 
   * pen.println("After "+iterations+" ticks:"); pen.println("Cooperators ="+jsdfj);
   * pen.println("Cooperators ="+jsdfj); pen.println("Cooperators ="+jsdfj); pen.println("");
   * pen.println(""); pen.println("Mean Cooperation Probability = ");
   * 
   * 
   * }
   */
  
  public static Pair<String,Integer>[] map(int collabNum, int defNum, int partialNum) {
    Pair<String,Integer>[] pop = (Pair<String,Integer>[]) (new Pair[3]);
    pop[0] = new Pair<String, Integer>("Cooperator", collabNum);
    pop[1] = new Pair<String, Integer>("Defector", defNum);
    pop[2] = new Pair<String, Integer>("Partial-Cooperator", partialNum);
    return pop;
  }
  public static void main(String args[]) {
    // java ALifeSim <#/iterations> <#/cooperators> <#/defectors> <#/partial cooperators>

    //the simulation runs
    int coopNum= Integer.parseInt(args[1]);
    int defectNum= Integer.parseInt(args[2]);
    int partialNum= Integer.parseInt(args[3]);
    Population thisWorld= new Population(map(coopNum, defectNum, partialNum));
    
    int iterations= Integer.parseInt(args[0]);
    
    
    //run iterations/
    //print result
  }

}
