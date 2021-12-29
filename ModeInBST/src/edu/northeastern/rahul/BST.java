package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BST  {
    public Node root;


    public String findMaxOccurringValueInATree(){
        ArrayList<Integer> list = new ArrayList<>();
        getList(root, list);
        Map<Integer,Integer> countBST = new HashMap<>();
        countOccurrence(list, countBST);

        int nodeValue = 0;
        int occurringTime = 0;

        for(int i : countBST.keySet())
        {
            if(countBST.get(i) > occurringTime)
            {
                nodeValue = i;
                occurringTime = countBST.get(i);
            }
        }
            return (nodeValue + " occurred "+ occurringTime +" times.");
    }

    private void  getList(Node node, ArrayList<Integer> list){

        if(node != null){
            getList(node.left, list);
            list.add(node.data);
            getList(node.right, list);
        }
    }

    private Map<Integer, Integer> countOccurrence(ArrayList<Integer> list, Map<Integer,Integer> countBST){
        for (Integer integer : list) {
            if (countBST.containsKey(integer)) {
                countBST.put(integer, countBST.get(integer) + 1);
            } else {
                countBST.put(integer, 1);
            }
        }
        return countBST;
    }
}
