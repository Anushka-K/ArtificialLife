import java.util.ArrayList;
import java.lang.Integer;

import java.util.ConcurrentModificationException;
import java.util.Random;

public class Population {
  
   ArrayList<Organism> list;
  int iteration;
  

  public Population(Pair<String,Integer>[] counts) {
   this.list= new ArrayList<Organism>();
    for(int i=0; i< Integer.valueOf(counts[0].getRight()); i++) {
      Cooperator  c= new Cooperator();
     this.list.add(c);
   }
    for(int i=0; i< Integer.valueOf(counts[1].getRight()); i++) {
      
      this.list.add(new Defector());
    }
    
    for(int i=0; i< Integer.valueOf(counts[2].getRight()); i++) {
     
     this.list.add(new PartialCooperator());
    }
    
    this.iteration=0;
      
  }//constructor
  
  public  void update() throws Exception, ConcurrentModificationException{
   ArrayList<Organism> babies=new ArrayList();
    
    for(int i=0; i< this.list.size();i++) {
      int popSize= this.list.size();
      
      this.list.get(i).update();
      
      double help= this.list.get(i).getCooperationProbability();
      
      long rgenseed = System.currentTimeMillis();
      Random rand= new Random(rgenseed);
      
      if(help==0) {
        return;
      }else if(help==0.5){
        if((rand.nextInt()%2)==0) {
          return;
        }}
   
      
      for(int j=0; j<8; j++) {
          int neighPos= rand.nextInt(this.list.size());
          this.list.get(neighPos).incrementEnergy();
      
      }//for (give energy to neighbours)
      
      this.list.get(i).decrementEnergy();
      
      if(this.list.get(i).getEnergy()>=10) {
        int replace= rand.nextInt(this.list.size());
       this.list.set(replace, this.list.get(i).reproduce());
        //babies.add(this.list.get(i).reproduce());
      }
      
    }
    //check that update happened
    //check if they reproduce
     list.addAll(babies);
  }
  
  public  Pair<String,Integer>[] getPopulationCounts(){
    Pair<String,Integer>[] pop= (Pair<String,Integer>[])(new Pair[3]);
    
    int coopCount=0;
    int defCount=0;
    int partCount=0;
    
    for(int i=0; i< this.list.size();i++) {
      Organism thisOne= this.list.get(i);
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
  
  public  double calculateCooperationMean() {
    double average=0;
    int i=0;
    for(; i< this.list.size();i++) {
      average+=this.list.get(i).getCooperationProbability();
    }
    average/=i;
    return average;
    }
}
