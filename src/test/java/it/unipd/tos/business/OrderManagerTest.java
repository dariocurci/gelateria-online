package it.unipd.tos.business;

import static org.junit.Assert.*;

import org.junit.Test;

import it.unipd.tos.business.OrderManager;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import java.util.*;


public class OrderManagerTest{
	
	@Test
	public void sum_Test() {
		User user= new User("unknown","unknown","unknown","unknown",0);
		OrderManager order= new OrderManager();
		List<MenuItem> menuitem= new ArrayList <MenuItem>();
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
		menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
		menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
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
	  OrderManager order= new OrderManager();
	  List<MenuItem> menuitem= new ArrayList <MenuItem>();
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	  menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",4.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",7.00));
	  menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",3.00));
	  
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
	  OrderManager order= new OrderManager();
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
	  
	  try{
          assertEquals(49.5,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
	}
	

}
	


