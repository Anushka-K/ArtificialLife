
public class Organism {
  /*
   * not sure if this is the right way to include type info in the class, will ask
   */

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
  public void update() {
    this.energy++;
  }

  public int getEnergy() {
    return this.energy;
  }

  void incrementEnergy() {
    this.energy++;
  }

  void decrementEnergy() throws Exception {
    if (this.energy >= 1)
      this.energy--;
    else
      throw new Exception("Energy cannot be negative.");
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

    double cooperation;

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
