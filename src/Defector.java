
public class Defector extends Organism {

  double cooperation;
  
  public Cooperator() {
    this.cooperation = 0;
  }
  
  public String getType() {
    return "defector";
  }
  
  public boolean cooperates() {
    return this.cooperation != 0;
  }
}
