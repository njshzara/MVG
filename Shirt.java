import java.io.Serializable;
public class Shirt extends Armour implements Serializable{

  /* Class Variables */
private final static long serialVersionUID = "1L";


  /* Constructors */
  public Shirt(String name, int durability, int defenseRating) {
    super(name, durability, defenseRating);
  }
}