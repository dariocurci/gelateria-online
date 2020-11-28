////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class MenuItem {
  public enum items{gelati,budini,bevande};
  private items itemType;
  private String name;
  private double price;

  public MenuItem(items i,String n, double p) {
    this.itemType=i;
    this.name=n;
    this.price=p;
  };

  public double getPrice() {
    return this.price;
  }

}
