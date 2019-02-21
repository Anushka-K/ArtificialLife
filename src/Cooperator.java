
public class Cooperator extends Organism {

  public Cooperator() {
    super();
  }

  @Override
  public String getType() {
    return "cooperator";
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
