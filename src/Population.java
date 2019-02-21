import java.util.ArrayList;

public class Population {
  
  ArrayList<Organism> list;
  int iteration;
  

  public Population(Pair<String,Integer>[] counts) {
   for(int j=0; j<counts.length;j++) {
    for(int i=0; i< (int)counts[j].getRight(); i++) {
     list.add(new Cooperator());
   }
   }
    this.iteration=0;
   
   
  }//constructor
  
  public void update() {
    for(int i=0; i< this.list.size();i++) {
      list.get(i).update();
    }
    //check that update happened
    //check if they reproduce
  }
  
  public Pair<String,Integer>[] getPopulationCounts(){
    Pair<String,Integer>[] pop= (Pair<String,Integer>[])(new Pair[3]);
    
    int coopCount=0;
    int defCount=0;
    int partCount=0;
    
    for(int i=0; i< this.list.size();i++) {
      Organism thisOne= list.get(i);
      if(thisOne instanceof Cooperator) {
        coopCount++;
      }else if(thisOne instanceof Defector) {
        defCount++;
      }else if(thisOne instanceof PartialCooperator) {
        partCount++;
      }
    }
    pop[0]=new Pair<String, Integer>("Cooperator",coopCount);
    pop[0]=new Pair<String, Integer>("Defector",defCount);
    pop[0]=new Pair<String, Integer>("Partial Cooperator",partCount);
    
    return pop;
  }
  
  public double calculateCooperationMean() {
    double average=0;
    int i=0;
    for(; i< this.list.size();i++) {
      average+=list.get(i).getCooperationProbability();
    }
    average/=i;
    return average;
    }
}
