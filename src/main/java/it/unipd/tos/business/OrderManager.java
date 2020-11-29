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
    int numberOfGelati=0;
    double lowestPriceGelati=0;
    for (MenuItem m: itemsOrdered) {
      if(m.getItems()==MenuItem.items.gelati) {
        if(numberOfGelati==0) lowestPriceGelati=m.getPrice();
        numberOfGelati++;
        if(m.getPrice()<lowestPriceGelati) {
          lowestPriceGelati=m.getPrice();
        }
      }
      total=total+m.getPrice();
    }
    
    if(numberOfGelati<=5)return total;
    else return total-(lowestPriceGelati/2);

    }
}


