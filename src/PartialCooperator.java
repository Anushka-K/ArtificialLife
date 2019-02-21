
public class PartialCooperator extends Organism {

  public PartialCooperator() {
    super();
  }

  @Override
  public String getType() {
    return "partial cooperator";
  }

  @Override
  public boolean cooperates() {
    return true;
  }

  @Override
  double getCooperationProbability() {
    double cooperation = 0.5;
    return cooperation;
  }
}

