package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.Test;
import it.unipd.tos.model.MenuItem;

public class MenuItemTest {

	@Test
	public void getPrice_Test() {
      MenuItem items1= new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00);
      MenuItem items2= new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00);
      MenuItem items3= new MenuItem(MenuItem.items.bevande,"coca cola",3.00);
      
      assertEquals(5.00,items1.getPrice(),0.0);
      assertEquals(4.00,items2.getPrice(),0.0);
      assertEquals(3.00,items3.getPrice(),0.0);
	}

	@Test
	public void getItems_Test() {
      MenuItem items1= new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00);
      MenuItem items2= new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00);
      MenuItem items3= new MenuItem(MenuItem.items.bevande,"coca cola",3.00);
      
      assertEquals(MenuItem.items.gelati,items1.getItems());
      assertEquals(MenuItem.items.budini,items2.getItems());
      assertEquals(MenuItem.items.bevande,items3.getItems());
	}
}
