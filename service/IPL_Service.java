package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.IPL_Player;

public class IPL_Service {

    private List<IPL_Player> ipl_db = null;
    private IPLDao ipldao = null;

    public List<IPL_Player> getAllPlayers() {
        ipldao = new IPLDao();
        ipl_db = ipldao.getAllPlayer();
        return ipl_db;
    }

    public List<IPL_Player> getPlayerbyTeam(String team_name) {

        ipl_db = getAllPlayers();

        List<IPL_Player> teamPlayers = new ArrayList<>();

        for (IPL_Player player : ipl_db) {
            if (player.getTeam_name().equalsIgnoreCase(team_name)) {
                teamPlayers.add(player);
            }
        }

        return teamPlayers;
    }
}