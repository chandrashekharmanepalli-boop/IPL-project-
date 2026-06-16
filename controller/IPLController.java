package com.tka.controller;

import java.util.List;

import com.tka.entity.IPL_Player;
import com.tka.service.IPL_Service;

public class IPLController {
	public static void main(String[] args) {
		
		IPL_Service iplservice= new IPL_Service();
		List<IPL_Player> all_Players = iplservice.getAllPlayers();
		all_Players.forEach(p-> System.out.println(p.getPlayer_name()));
		}


}
