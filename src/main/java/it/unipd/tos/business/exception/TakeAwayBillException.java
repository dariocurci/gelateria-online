////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;

public class TakeAwayBillException extends Throwable{
  private String error;

  public TakeAwayBillException(String e){
    this.error = e;
  }

  public String getMessage(){
  return this.error;
  }
}