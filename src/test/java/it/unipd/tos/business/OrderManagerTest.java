package it.unipd.tos.business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import it.unipd.tos.business.OrderManager;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.model.Time;
import java.util.*;


public class OrderManagerTest{
	
	@Test
	public void sum_Test() {
		User user= new User("unknown","unknown","unknown","unknown",0);
		Time oraOrdine= new Time(10);
		List<MenuItem> menuitem= new ArrayList <MenuItem>();
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
		menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
		menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
		OrderManager order= new OrderManager(menuitem,user,oraOrdine);
		try{
			assertEquals(17.0,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
		
		
	}
	
	@Test
	public void fiftyPercentDiscountOnThePriceOfTheCheapestIceCream_Test() {
	  User user= new User("unknown","unknown","unknown","unknown",0);
	  Time oraOrdine= new Time(10);
	  List<MenuItem> menuitem= new ArrayList <MenuItem>();
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",7.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  OrderManager order= new OrderManager(menuitem,user,oraOrdine);
	  
	  try{
          assertEquals(32.5,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
	}
	
	@Test
	public void tenPercentDiscountOnTotalWith50PlusEuroOrder_Test() {
	  User user= new User("unknown","unknown","unknown","unknown",0);
	  Time oraOrdine= new Time(10);
	  List<MenuItem> menuitem= new ArrayList <MenuItem>();
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",3.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa punguino",7.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",5.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",5.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",6.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",7.00));
	  OrderManager order= new OrderManager(menuitem,user,oraOrdine);
	  try{
          assertEquals(49.5,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void NumberElementsExceed30_Test() throws TakeAwayBillException {
    	User user= new User("unknown","unknown","unknown","unknown",0);
		Time oraOrdine= new Time(10);
  	    List<MenuItem> menuitem= new ArrayList <MenuItem>();
  	    OrderManager order= new OrderManager(menuitem,user,oraOrdine);
        thrown.expect(TakeAwayBillException.class);
        thrown.expectMessage("Attenzione! L'ordine non può superare i 30 elementi");

        for(int i = 1; i <= 40; i++) menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));

        order.getOrderPrice(menuitem, user);
    }
    
    @Test
	public void addACommissionIfTheTotalIsLessThan10Euro_Test() {
      User user= new User("unknown","unknown","unknown","unknown",0);
	  Time oraOrdine= new Time(10);
	  List<MenuItem> menuitem= new ArrayList <MenuItem>();
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",1.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",1.00));
	  menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",1.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",2.00));
	  OrderManager order= new OrderManager(menuitem,user,oraOrdine);
	  
	  
	  try{
		  assertEquals(8.50,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
	}
	

}
	


