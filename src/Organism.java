
public class Organism {
public int energy;


  public Organism() {
    this.energy=0;
  }
  
  
  public void incrementEnergy() {
    this.energy++;
  }
  
  void decrementEnergy() throws Exception {
    if (this.energy >= 1)
      this.energy--;
    else
      throw new Exception("Energy cannot be negative.");
  }
  
  public int getEnergy() {
    return this.energy;
  }

  public Organism reproduce() {
    Organism org = new Organism();
    return org;
  }
  
  double getCooperationProbability() {

    double cooperation;

    if (this.type.equals("cooperator"))
      cooperation = 1;
    else if (this.type.equals("partial cooperator"))
      cooperation = 0.5;
    else
      cooperation = 0;

    return cooperation;
}
  public void update() {
    this.energy++;
}
}
