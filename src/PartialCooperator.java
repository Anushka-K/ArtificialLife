
public class PartialCooperator extends Organism {

  double cooperation;
 
  public PartialCooperator() {
    this.cooperation = 0.5;
  }
  
  public String getType() {
    return "partial cooperator";
  }
  
  public boolean cooperates() {
    return this.cooperation != 0;
  }
}

