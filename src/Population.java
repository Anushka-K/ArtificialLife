import java.util.ArrayList;

public class Population {
  
  ArrayList<Organism> list;
  int iteration;
  

  public Population(Pair<String,Integer>[] counts) {
   for(int j=0; j<counts.length;j++) {
    for(int i=0; i< counts[j].getRight(); i++) {
     list.add(new Cooperator());
   }
   }
   
  }//what kinds of orgs
  
  public void update() {
    
  }
  
  public Pair<String,Integer> getPopulationCounts(){
    Pair<String,Integer>[] pop= (Pair<String,Integer>[])(new Pair[3]);
    
  }
  
  public double calculateCooperationMean() {
    double average= 09;
  }
}
