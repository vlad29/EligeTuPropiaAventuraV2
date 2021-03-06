package com.joelcastro.eligetupropiaaventura.daos.fake;

import com.joelcastro.eligetupropiaaventura.daos.AdventureHistoryDAO;
import com.joelcastro.eligetupropiaaventura.models.AdventureNode;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by joel on 14/10/14.
 */
@EBean
public class AdventureHistoryFakeDAO implements AdventureHistoryDAO {
    @Override
    public void addAdventureNodeToHistory(String player, int idNode, String nameAdventure,String status) {

    }

    @Override
    public void changeStatus(String player, String nameAdventure) {

    }

    @Override
    public String checkStatus(String player, String nameAdventure) {
        //return "Searching";
        return "Found";
    }

    @Override
    public List<AdventureNode> getNodesFromAdventure(String player, String nameAdventure) {
        AdventureNodeFakeDAO nodeDAO = new AdventureNodeFakeDAO();

        List<AdventureNode> list = new ArrayList<AdventureNode>();
        if(nameAdventure.equals("Aventura Inicial")){
            list.add(nodeDAO.getNodeFromId(1));
            list.add(nodeDAO.getNodeFromId(6));
            list.add(nodeDAO.getNodeFromId(7));
        } else if(nameAdventure.equals("Aventura Inicial 2")){
            list.add(nodeDAO.getNodeFromId(2));
            list.add(nodeDAO.getNodeFromId(8));
            list.add(nodeDAO.getNodeFromId(9));
        }

        return list;
    }
}
