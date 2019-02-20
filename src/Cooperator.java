
public class Cooperator extends Organism {

  double cooperation;
  
  public Cooperator() {
    this.cooperation = 1;
  }
  
  public String getType() {
    return "cooperator";
  }
  
  public boolean cooperates() {
    return this.cooperation != 0;
  }
}
