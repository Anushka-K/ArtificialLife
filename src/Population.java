import java.util.ArrayList;

public class Population {
  
  int iteration;
  ArrayList<Organism> list;
  
  Population(Pair<String, Integer>[] counts){
    Pair<String,Integer>[] pop = (Pair<String,Integer>[]) (new Pair[3]);
    pop[0] = new Pair<String, Integer>("Collab", 3);
    pop[1] = new Pair<String, Integer>("Defect", 100);
    pop[2] = new Pair<String, Integer>("Other", 5);
    return pop;
  }

  public void update() {
    
  }

  double calculateCooperationMean() {
    
  }
  
  Pair<String, Integer>[] getPopulationCounts(){
    
  }
}
