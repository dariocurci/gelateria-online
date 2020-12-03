////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class Time {
  private int ora;

  public Time(int o) {
    if(o>=23||o<0) this.ora=0;
    else this.ora=o;
  }
  
  public int getOra() {
    return this.ora;
  }
}
