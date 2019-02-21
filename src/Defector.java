


public class Defector extends Organism {

  public Defector() {
    super();
    this.type = "Defector";
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public boolean cooperates() {
    return false;
  }

  @Override
  double getCooperationProbability() {
    double cooperation = 0;
    return cooperation;
  }
  @Override
  public Defector reproduce() {
    this.energy=0;
    Defector def = new Defector();
    return def;

  }

  
}
