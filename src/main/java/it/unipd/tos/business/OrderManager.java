////////////////////////////////////////////////////////////////////
// [Dario] [Curci] [1174909]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business;

import java.util.List;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;

public class OrderManager implements TakeAwayBill {

  public double getOrderPrice(List<MenuItem> itemsOrdered, User user) throws TakeAwayBillException {
    double total=0;
    double totalPriceGelati=0;
    double totalPriceBudini=0;
    int numberOfGelati=0;
    double lowestPriceGelati=0;
    
    if(itemsOrdered.size() > 30){
        throw new TakeAwayBillException("Attenzione! L'ordine non può superare i 30 elementi");
    }
    
    for (MenuItem m: itemsOrdered) {
    
      if(m.getItems()==MenuItem.items.gelati) {
        totalPriceGelati=totalPriceGelati+m.getPrice();
        if(numberOfGelati==0) lowestPriceGelati=m.getPrice();
        numberOfGelati++;
        if(m.getPrice()<lowestPriceGelati) {
          lowestPriceGelati=m.getPrice();
        }
      }
      
      if(m.getItems()==MenuItem.items.budini) totalPriceBudini=totalPriceBudini+m.getPrice();
      
      total=total+m.getPrice();
    }
    
    if(numberOfGelati>5) total=total-(lowestPriceGelati/2);
    if((totalPriceGelati+totalPriceBudini)>50) total=total-((total/100)*10);
    if(total<10.0) total=total+0.50;
    return total;

    }
}