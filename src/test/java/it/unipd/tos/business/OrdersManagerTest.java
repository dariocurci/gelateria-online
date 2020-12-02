package it.unipd.tos.business;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import it.unipd.tos.business.OrderManager;
import it.unipd.tos.business.exception.TakeAwayBillException;
import org.junit.rules.ExpectedException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.model.Time;

public class OrdersManagerTest {

	@Test
	public void allOrdersArePlacedBefore18() {
		List<MenuItem> menuitem= new ArrayList <MenuItem>();
		Time oraordine=new Time(17);
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
		menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
		menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
		menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
		User user1= new User("unknown1","unknown","unknown","unknown",17);
		  User user2= new User("unknown2","unknown","unknown","unknown",17);
		  User user3= new User("unknown3","unknown","unknown","unknown",20);
		  User user4= new User("unknown3","unknown","unknown","unknown",17);
		  User user5= new User("unknown3","unknown","unknown","unknown",20);
		  User user6= new User("unknown3","unknown","unknown","unknown",20);
		  User user7= new User("unknown3","unknown","unknown","unknown",17);
		  User user8= new User("unknown3","unknown","unknown","unknown",20);
		  User user9= new User("unknown3","unknown","unknown","unknown",20);
		  User user10= new User("unknown3","unknown","unknown","unknown",17);
		  User user11= new User("unknown3","unknown","unknown","unknown",20);
		  User user12= new User("unknown3","unknown","unknown","unknown",17);
		  User user13= new User("unknown3","unknown","unknown","unknown",20);
		  User user14= new User("unknown3","unknown","unknown","unknown",17);
		  User user15= new User("unknown3","unknown","unknown","unknown",17);
		  User user16= new User("unknown3","unknown","unknown","unknown",17);
		  User user17= new User("unknown3","unknown","unknown","unknown",17);
		  User user18= new User("unknown3","unknown","unknown","unknown",17);
		  User user19= new User("unknown3","unknown","unknown","unknown",20);
		  User user20= new User("unknown3","unknown","unknown","unknown",17);
		  List<OrderManager> o= new ArrayList <OrderManager>();
		  o.add(new OrderManager(menuitem,user1,oraordine));
		  o.add(new OrderManager(menuitem,user2,oraordine));
		  o.add(new OrderManager(menuitem,user3,oraordine));
		  o.add(new OrderManager(menuitem,user4,oraordine));
		  o.add(new OrderManager(menuitem,user5,oraordine));
		  o.add(new OrderManager(menuitem,user6,oraordine));
		  o.add(new OrderManager(menuitem,user7,oraordine));
		  o.add(new OrderManager(menuitem,user8,oraordine));
		  o.add(new OrderManager(menuitem,user9,oraordine));
		  o.add(new OrderManager(menuitem,user10,oraordine));
		  o.add(new OrderManager(menuitem,user11,oraordine));
		  o.add(new OrderManager(menuitem,user12,oraordine));
		  o.add(new OrderManager(menuitem,user13,oraordine));
		  o.add(new OrderManager(menuitem,user14,oraordine));
		  o.add(new OrderManager(menuitem,user15,oraordine));
		  o.add(new OrderManager(menuitem,user16,oraordine));
		  o.add(new OrderManager(menuitem,user17,oraordine));
		  o.add(new OrderManager(menuitem,user18,oraordine));
		  o.add(new OrderManager(menuitem,user19,oraordine));
		  o.add(new OrderManager(menuitem,user20,oraordine));
		  OrdersManager totalorders=new OrdersManager(o);
		  List<Double> result= new ArrayList<Double>();
		  for(int i= o.size(); i!=0; i--) {
			  result.add(17.00);
		  }
		  
		  try{
			  assertEquals(result,totalorders.totalOrdersCalculation());
			}
			catch(TakeAwayBillException exc){
				exc.getMessage();
			}	
	}


@Test
public void allOrdersArePlacedAfter19() {
	List<MenuItem> menuitem= new ArrayList <MenuItem>();
	Time oraordine=new Time(20);
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	User user1= new User("unknown1","unknown","unknown","unknown",17);
	  User user2= new User("unknown2","unknown","unknown","unknown",17);
	  User user3= new User("unknown3","unknown","unknown","unknown",20);
	  User user4= new User("unknown3","unknown","unknown","unknown",17);
	  User user5= new User("unknown3","unknown","unknown","unknown",20);
	  User user6= new User("unknown3","unknown","unknown","unknown",20);
	  User user7= new User("unknown3","unknown","unknown","unknown",17);
	  User user8= new User("unknown3","unknown","unknown","unknown",20);
	  User user9= new User("unknown3","unknown","unknown","unknown",20);
	  User user10= new User("unknown3","unknown","unknown","unknown",17);
	  User user11= new User("unknown3","unknown","unknown","unknown",20);
	  User user12= new User("unknown3","unknown","unknown","unknown",17);
	  User user13= new User("unknown3","unknown","unknown","unknown",20);
	  User user14= new User("unknown3","unknown","unknown","unknown",17);
	  User user15= new User("unknown3","unknown","unknown","unknown",17);
	  User user16= new User("unknown3","unknown","unknown","unknown",17);
	  User user17= new User("unknown3","unknown","unknown","unknown",17);
	  User user18= new User("unknown3","unknown","unknown","unknown",17);
	  User user19= new User("unknown3","unknown","unknown","unknown",20);
	  User user20= new User("unknown3","unknown","unknown","unknown",17);
	  List<OrderManager> o= new ArrayList <OrderManager>();
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user2,oraordine));
	  o.add(new OrderManager(menuitem,user3,oraordine));
	  o.add(new OrderManager(menuitem,user4,oraordine));
	  o.add(new OrderManager(menuitem,user5,oraordine));
	  o.add(new OrderManager(menuitem,user6,oraordine));
	  o.add(new OrderManager(menuitem,user7,oraordine));
	  o.add(new OrderManager(menuitem,user8,oraordine));
	  o.add(new OrderManager(menuitem,user9,oraordine));
	  o.add(new OrderManager(menuitem,user10,oraordine));
	  o.add(new OrderManager(menuitem,user11,oraordine));
	  o.add(new OrderManager(menuitem,user12,oraordine));
	  o.add(new OrderManager(menuitem,user13,oraordine));
	  o.add(new OrderManager(menuitem,user14,oraordine));
	  o.add(new OrderManager(menuitem,user15,oraordine));
	  o.add(new OrderManager(menuitem,user16,oraordine));
	  o.add(new OrderManager(menuitem,user17,oraordine));
	  o.add(new OrderManager(menuitem,user18,oraordine));
	  o.add(new OrderManager(menuitem,user19,oraordine));
	  o.add(new OrderManager(menuitem,user20,oraordine));
	  OrdersManager totalorders=new OrdersManager(o);
	  List<Double> result= new ArrayList<Double>();
	  for(int i= o.size(); i!=0; i--) {
		  result.add(17.00);
	  }
	  
	  try{
		  assertEquals(result,totalorders.totalOrdersCalculation());
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}	
}

@Test
public void allOrdersArePlacedFromAdultUsers() {
	List<MenuItem> menuitem= new ArrayList <MenuItem>();
	Time oraordine=new Time(18);
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	User user1= new User("unknown1","unknown","unknown","unknown",18);
	  User user2= new User("unknown2","unknown","unknown","unknown",19);
	  User user3= new User("unknown3","unknown","unknown","unknown",20);
	  User user4= new User("unknown3","unknown","unknown","unknown",19);
	  User user5= new User("unknown3","unknown","unknown","unknown",20);
	  User user6= new User("unknown3","unknown","unknown","unknown",20);
	  User user7= new User("unknown3","unknown","unknown","unknown",22);
	  User user8= new User("unknown3","unknown","unknown","unknown",20);
	  User user9= new User("unknown3","unknown","unknown","unknown",20);
	  User user10= new User("unknown3","unknown","unknown","unknown",18);
	  User user11= new User("unknown3","unknown","unknown","unknown",20);
	  User user12= new User("unknown3","unknown","unknown","unknown",18);
	  User user13= new User("unknown3","unknown","unknown","unknown",20);
	  User user14= new User("unknown3","unknown","unknown","unknown",18);
	  User user15= new User("unknown3","unknown","unknown","unknown",19);
	  User user16= new User("unknown3","unknown","unknown","unknown",22);
	  User user17= new User("unknown3","unknown","unknown","unknown",23);
	  User user18= new User("unknown3","unknown","unknown","unknown",80);
	  User user19= new User("unknown3","unknown","unknown","unknown",20);
	  User user20= new User("unknown3","unknown","unknown","unknown",18);
	  List<OrderManager> o= new ArrayList <OrderManager>();
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user2,oraordine));
	  o.add(new OrderManager(menuitem,user3,oraordine));
	  o.add(new OrderManager(menuitem,user4,oraordine));
	  o.add(new OrderManager(menuitem,user5,oraordine));
	  o.add(new OrderManager(menuitem,user6,oraordine));
	  o.add(new OrderManager(menuitem,user7,oraordine));
	  o.add(new OrderManager(menuitem,user8,oraordine));
	  o.add(new OrderManager(menuitem,user9,oraordine));
	  o.add(new OrderManager(menuitem,user10,oraordine));
	  o.add(new OrderManager(menuitem,user11,oraordine));
	  o.add(new OrderManager(menuitem,user12,oraordine));
	  o.add(new OrderManager(menuitem,user13,oraordine));
	  o.add(new OrderManager(menuitem,user14,oraordine));
	  o.add(new OrderManager(menuitem,user15,oraordine));
	  o.add(new OrderManager(menuitem,user16,oraordine));
	  o.add(new OrderManager(menuitem,user17,oraordine));
	  o.add(new OrderManager(menuitem,user18,oraordine));
	  o.add(new OrderManager(menuitem,user19,oraordine));
	  o.add(new OrderManager(menuitem,user20,oraordine));
	  OrdersManager totalorders=new OrdersManager(o);
	  List<Double> result= new ArrayList<Double>();
	  for(int i= o.size(); i!=0; i--) {
		  result.add(17.00);
	  }
	  
	  try{
		  assertEquals(result,totalorders.totalOrdersCalculation());
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}	
}

@Test
public void theSameUnderageUserHasPlacedMultipleOrders() {
	List<MenuItem> menuitem= new ArrayList <MenuItem>();
	Time oraordine=new Time(18);
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	User user1= new User("unknown1","unknown","unknown","unknown",17);
	  User user2= new User("unknown2","unknown","unknown","unknown",17);
	  User user3= new User("unknown3","unknown","unknown","unknown",20);
	  List<OrderManager> o= new ArrayList <OrderManager>();
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  OrdersManager totalorders=new OrdersManager(o);
	  List<Double> result= new ArrayList<Double>();
	  result.add(0.00);
	  result.add(17.00);
	  result.add(17.00);
	  result.add(17.00);
	  result.add(17.00);
	  result.add(17.00);
	  result.add(17.00);
	  
	  
	  try{
		  assertEquals(result,totalorders.totalOrdersCalculation());
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}	
}

@Test
public void tenUnderageUsersPlaceAnOrder() {
	List<MenuItem> menuitem= new ArrayList <MenuItem>();
	Time oraordine=new Time(18);
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",5.00));
	menuitem.add(new MenuItem(MenuItem.items.budini,"coppa pinguino",4.00));
	menuitem.add(new MenuItem(MenuItem.items.bevande,"coca cola",2.00));
	menuitem.add(new MenuItem(MenuItem.items.gelati,"coppa nafta",6.00));
	User user1= new User("unknown1","unknown","unknown","unknown",17);
	  User user2= new User("unknown2","unknown","unknown","unknown",17);
	  User user3= new User("unknown3","unknown","unknown","unknown",17);
	  User user4= new User("unknown4","unknown","unknown","unknown",17);
	  User user5= new User("unknown5","unknown","unknown","unknown",17);
	  User user6= new User("unknown6","unknown","unknown","unknown",17);
	  User user7= new User("unknown7","unknown","unknown","unknown",17);
	  User user8= new User("unknown8","unknown","unknown","unknown",17);
	  User user9= new User("unknown9","unknown","unknown","unknown",17);
	  User user10= new User("unknown10","unknown","unknown","unknown",17);
	  List<OrderManager> o= new ArrayList <OrderManager>();
	  o.add(new OrderManager(menuitem,user1,oraordine));
	  o.add(new OrderManager(menuitem,user2,oraordine));
	  o.add(new OrderManager(menuitem,user3,oraordine));
	  o.add(new OrderManager(menuitem,user4,oraordine));
	  o.add(new OrderManager(menuitem,user5,oraordine));
	  o.add(new OrderManager(menuitem,user6,oraordine));
	  o.add(new OrderManager(menuitem,user7,oraordine));
	  o.add(new OrderManager(menuitem,user8,oraordine));
	  o.add(new OrderManager(menuitem,user9,oraordine));
	  o.add(new OrderManager(menuitem,user10,oraordine));
	  OrdersManager totalorders=new OrdersManager(o);
	  List<Double> result= new ArrayList<Double>();
	  for(int i= o.size(); i!=0; i--) {
		  result.add(0.00);
	  }
	  
	  try{
		  assertEquals(result,totalorders.totalOrdersCalculation());
		}
		catch(TakeAwayBillException exc){
			exc.getMessage();
		}	
}
}

