////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import it.unipd.tos.business.OrderManager;
import it.unipd.tos.business.exception.TakeAwayBillException;

public class OrdersManager {
  private List<OrderManager> o;

  public OrdersManager(List<OrderManager> a) {
    this.o=a;
  }
  
  public List<Double> totalOrdersCalculation() throws TakeAwayBillException{
    List<String> uniqueUnderageUsers= new ArrayList<String>();
    List<Double> total= new ArrayList<Double>();
    List<String> usersWithFreeBill= new ArrayList<String>();

    for(OrderManager m:this.o) {
      if(m.getUser().getAge()<18 && m.getTime().getOra()>=18 && m.getTime().getOra()<=19) {
        if(!uniqueUnderageUsers.contains(m.getUser().getUsername())) {
          uniqueUnderageUsers.add(m.getUser().getUsername());
        }
      }
    }
  
    if(!uniqueUnderageUsers.isEmpty())Collections.shuffle(uniqueUnderageUsers);
  
    for (int i=0;i < uniqueUnderageUsers.size() && i<10;i++) {
      usersWithFreeBill.add(uniqueUnderageUsers.get(i));
    }

    for(OrderManager m:this.o) {
      boolean match=false;
       
      for (int i=0;i < usersWithFreeBill.size();i++){
        if(m.getUser().getUsername()==usersWithFreeBill.get(i)) {
          total.add(0.0);
          usersWithFreeBill.remove(i);
          match=true;
        }
      } 

      if(match==false) {
        try{
          total.add(m.getOrderPrice(m.getMenu(), m.getUser()));
          
        }
        catch(TakeAwayBillException exc){
          exc.getMessage();
        } 
     }
   } 
    return total;
  }
}
