package busReservation;

import java.sql.Time;
import java.util.Date;


public class Bus 
{
    int busno;
	String from,to;
    boolean ac;
    Time arrt,dept;
    int seat[] = new int[2];
    Date doj;
    float fare;
    
    public Bus()
    {
 
    }
    
    public Bus(int b,String f,String t,boolean a,float f1)
    {
       busno = b;
       from = f;
       to = t;
       ac = a;
    }
    
    public void StartBus()
    {
        Bus koltojalac = new Bus(78,"Kolkata","Jalpaiguri",true,700.0f);
        BusAdd ba = new BusAdd();
        dept.setHours(21);
        dept.setMinutes(00);
        arrt.setHours(10);
        arrt.setMinutes(00);
        ba.BusAdd(koltojalac);
        Bus koltojalnac = new Bus(68,"Kolkata","Jalpaiguri",false,500.0f);
        dept.setHours(03);
        dept.setMinutes(00);
        arrt.setHours(17);
        arrt.setMinutes(00);
        ba.BusAdd(koltojalnac); 
    }
}
