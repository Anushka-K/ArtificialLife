
public class Organism {
private int energy;

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
}
