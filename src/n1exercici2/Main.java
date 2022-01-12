package n1exercici2;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<Month> mesos = new HashSet<Month>();
		
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
		mesos.add(agost);
		mesos.add(setembre);
		mesos.add(octubre);
		mesos.add(novembre);
		//no poso decembre
		
		System.out.println("Introduïm tots menys decembre ");
		System.out.println(mesos.toString());
			
		System.out.println("Introduïm decembre i un altre cop novembre");
		mesos.add(decembre);
		mesos.add(novembre);

		System.out.println(mesos.toString());	
		System.out.println("Nomès afegeix el que faltava, decembre");
	}
}
