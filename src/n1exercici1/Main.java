package n1exercici1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Month> mesos = new ArrayList<Month>();
		
		Month gener    = new Month("gener");
		Month febrer   = new Month("febrer");
		Month març     = new Month("març");
		Month abril    = new Month("abril");
		Month maig     = new Month("maig");
		Month juny     = new Month("juny");
		Month juliol   = new Month("juliol");
		Month agost    = new Month("agost");
		Month setembre = new Month("setembre");
		Month octubre  = new Month("octubre");
		Month novembre = new Month("novembre");
		Month decembre = new Month("decembre");
		
		mesos.add(gener);
		mesos.add(febrer);
		mesos.add(març);
		mesos.add(abril);
		mesos.add(maig);
		mesos.add(juny);
		mesos.add(juliol);
		//no poso agost		
		mesos.add(setembre);
		mesos.add(octubre);
		mesos.add(novembre);
		mesos.add(decembre);
				
		//imprimim l'array sense agost
		System.out.println("Array sense agost");
		System.out.println(mesos.toString());
		
		//introduïm agost al seu lloc (8-1=7)
		mesos.add(7,agost);
		
		//imprimim l'array amb agost
		System.out.println("Array amb agost");
		System.out.println(mesos.toString());
		
	}

}
