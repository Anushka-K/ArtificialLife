
public class PartialCooperator extends Organism{
  
  public PartialCooperator() {
    super();
    this.type = "PartialCooperator";
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
    double cooperation = 0.5;
    return cooperation;
}
  @Override
  public PartialCooperator reproduce() {
    this.energy=0;
    PartialCooperator pCoop = new PartialCooperator();
    return pCoop;
  }
}
