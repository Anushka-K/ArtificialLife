
public class Cooperator extends Organism {

  public Cooperator() {
    super();
    this.type = "Cooperator";
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public boolean cooperates() {
    return true;
  }

  @Override
  double getCooperationProbability() {
    double cooperation = 1;
    return cooperation;
  }
}
