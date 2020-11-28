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
	public void sumTest() {
		User user= new User("unknown","unknown","unknown","unknown",0);
		OrderManager order= new OrderManager();
		List<MenuItem> menuitem= new ArrayList <MenuItem>();
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
		menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
		menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
		try{
			assertEquals(11.0,order.getOrderPrice(menuitem, user),0.0);
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}
		
		
	}

}
	


