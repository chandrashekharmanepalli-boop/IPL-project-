package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.IPL_Player;

public class IPLDao {
	private List<IPL_Player> ipl_db=null;
	
	public List<IPL_Player> getAllPlayer(){
		
		ipl_db= new ArrayList<IPL_Player>();
		
		// =================== RCB ===================
		ipl_db.add(new IPL_Player("RCB",18,"Virat Kohli",8545,45));
		ipl_db.add(new IPL_Player("RCB",97,"Rajat Patidar",850,28));
		ipl_db.add(new IPL_Player("RCB",19,"Josh Hazlewood",120,35));
		ipl_db.add(new IPL_Player("RCB",31,"Yash Dayal",85,30));
		ipl_db.add(new IPL_Player("RCB",13,"Liam Livingstone",980,40));
		ipl_db.add(new IPL_Player("RCB",22,"Jitesh Sharma",1450,60));
		ipl_db.add(new IPL_Player("RCB",75,"Tim David",1300,55));
		ipl_db.add(new IPL_Player("RCB",7,"Krunal Pandya",1650,110));
		ipl_db.add(new IPL_Player("RCB",99,"Bhuvneshwar Kumar",320,180));
		ipl_db.add(new IPL_Player("RCB",11,"Phil Salt",980,35));
		ipl_db.add(new IPL_Player("RCB",5,"Suyash Sharma",90,22));

		// =================== SRH ===================
		ipl_db.add(new IPL_Player("SRH",63,"Pat Cummins",520,65));
		ipl_db.add(new IPL_Player("SRH",9,"Travis Head",1600,42));
		ipl_db.add(new IPL_Player("SRH",8,"Abhishek Sharma",1800,75));
		ipl_db.add(new IPL_Player("SRH",27,"Heinrich Klaasen",1900,68));
		ipl_db.add(new IPL_Player("SRH",14,"Nitish Kumar Reddy",850,32));
		ipl_db.add(new IPL_Player("SRH",5,"Ishan Kishan",2850,105));
		ipl_db.add(new IPL_Player("SRH",44,"Mohammed Shami",430,118));
		ipl_db.add(new IPL_Player("SRH",55,"Harshal Patel",390,112));
		ipl_db.add(new IPL_Player("SRH",2,"Rahul Chahar",180,78));
		ipl_db.add(new IPL_Player("SRH",17,"Adam Zampa",95,26));
		ipl_db.add(new IPL_Player("SRH",23,"Atharva Taide",310,18));

		// =================== GT ===================
		ipl_db.add(new IPL_Player("GT",77,"Shubman Gill",3650,110));
		ipl_db.add(new IPL_Player("GT",10,"Jos Buttler",3900,118));
		ipl_db.add(new IPL_Player("GT",20,"Sai Sudharsan",1650,42));
		ipl_db.add(new IPL_Player("GT",33,"Rahul Tewatia",1100,95));
		ipl_db.add(new IPL_Player("GT",7,"Washington Sundar",980,82));
		ipl_db.add(new IPL_Player("GT",29,"Rashid Khan",520,130));
		ipl_db.add(new IPL_Player("GT",11,"Mohammed Siraj",420,105));
		ipl_db.add(new IPL_Player("GT",99,"Kagiso Rabada",310,82));
		ipl_db.add(new IPL_Player("GT",18,"Prasidh Krishna",120,58));
		ipl_db.add(new IPL_Player("GT",25,"Sherfane Rutherford",890,40));
		ipl_db.add(new IPL_Player("GT",45,"Glenn Phillips",680,30));

		// =================== RR ===================
		ipl_db.add(new IPL_Player("RR",63,"Sanju Samson",4850,170));
		ipl_db.add(new IPL_Player("RR",19,"Yashasvi Jaiswal",2200,62));
		ipl_db.add(new IPL_Player("RR",1,"Riyan Parag",1850,82));
		ipl_db.add(new IPL_Player("RR",99,"Shimron Hetmyer",2100,92));
		ipl_db.add(new IPL_Player("RR",14,"Dhruv Jurel",780,32));
		ipl_db.add(new IPL_Player("RR",56,"Wanindu Hasaranga",720,40));
		ipl_db.add(new IPL_Player("RR",90,"Jofra Archer",210,48));
		ipl_db.add(new IPL_Player("RR",28,"Maheesh Theekshana",120,38));
		ipl_db.add(new IPL_Player("RR",15,"Sandeep Sharma",290,132));
		ipl_db.add(new IPL_Player("RR",21,"Tushar Deshpande",95,42));
		ipl_db.add(new IPL_Player("RR",3,"Akash Madhwal",55,22));
	
		return ipl_db;
	}
	
	


}
