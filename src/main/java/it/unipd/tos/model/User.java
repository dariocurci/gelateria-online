////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class User {
  private String username;
  private String name;
  private String surname;
  private String address;
  private int age;

  public User(String u, String n, String s, String a,int ag) {
    this.username=u;
    this.name=n;
    this.surname=s;
    this.address=a;
    this.age=ag;
  }


}
