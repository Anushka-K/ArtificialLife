
public class Defector extends Organism {

  public Defector() {
    super();
  }

  @Override
  public String getType() {
    return "defector";
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
}
