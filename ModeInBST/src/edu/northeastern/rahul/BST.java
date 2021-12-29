package edu.northeastern.rahul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BST  {
    public Node root;


    public String findMaxOccuringValueInATree(){
        ArrayList<Integer> list = new ArrayList<>();
        getList(root, list);
        Map<Integer,Integer> countBST = new HashMap<Integer, Integer>();
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
            return (Integer.toString(nodeValue)+ " occurred "+ Integer.toString(occurringTime)+" times.");
    }

    private void  getList(Node node, ArrayList<Integer> list){

        if(node != null){
            getList(node.left, list);
            list.add(node.data);
            getList(node.right, list);
        }
    }

    private Map<Integer, Integer> countOccurrence(ArrayList<Integer> list, Map<Integer,Integer> countBST){
        for (int i = 0; i < list.size() ; i++) {
            if(countBST.containsKey(list.get(i))){
                countBST.put(list.get(i),countBST.get(list.get(i))+1);
            }else{
                countBST.put(list.get(i), 1);
            }
        }
        return countBST;
    }
}
