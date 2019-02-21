import java.util.Random;

public class Organism {

public int energy;
public String type;

  /*
   * Don't know if the name or type needs to be initialized by the constructor or if so how.
   */
  public Organism() {
    this.energy = 0;
    this.type = "Organism";
  }

  /*
   * update needs to do other things that I have not figured out yet
   */
  public void update() throws Exception {
    this.energy++;
    double help= this.getCooperationProbability();
    
    long rgenseed = System.currentTimeMillis();
    Random rand= new Random(rgenseed);
    
    if(help==0) {
      return;
    }else if(help==0.5){
      if((rand.nextInt()%2)==0) {
        return;
      }}
 
    
    for(int i=0; i<8; i++) {
        int neighPos= rand.nextInt(Population.list.size());
        Population.list.get(neighPos).incrementEnergy();
    
    }//for (give energy to neighbours)
    
    this.decrementEnergy();
    }

  public int getEnergy() {
    return this.energy;
  }

  void incrementEnergy() {
    this.energy++;
  }


  void decrementEnergy() throws Exception {
    if (this.energy >0)
      this.energy--;
  }


  /*
   * Don't know what gettype should do, but I included a name field at the top and might try to
   * modify the constructor to include a name.
   */
  public String getType() {
    return this.type;
  }

  public Organism reproduce() {
    this.energy = 0;
    Organism org = new Organism();
    return org;
  }


  double getCooperationProbability() {

    double cooperation=0;


    if (this.type.equals("cooperator"))
      cooperation = 1;
    else if (this.type.equals("partial cooperator"))

    if (this.type.equals("Cooperator"))
      cooperation = 1;
    else if (this.type.equals("PartialCooperator"))

      cooperation = 0.5;
    else
      cooperation = 0;

    return cooperation;

}
  
  boolean cooperates() {
    return this.type.equals("Cooperator") || this.type.equals("PartialCooperator");
  }

}
