package edu.knoldus.operation;

import java.util.ArrayList;
import java.util.ListIterator;

public class SumListElements {
    public ArrayList<Integer> sumList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        if(list1.size() <= list2.size())
        {
            return addListElement(list2, list1);
        }
        return addListElement(list1, list2);
    }
    private ArrayList addListElement(ArrayList<Integer> largerList, ArrayList<Integer> smallerList){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < smallerList.size(); i++)
        {
            result.add(smallerList.get(i) + largerList.get(i));
        }
        if(largerList.size() > smallerList.size())
        {
            ListIterator largerListItr = largerList.listIterator(smallerList.size());
            while (largerListItr.hasNext()){
                result.add((int)largerListItr.next());
            }

        }
        return result;
    }
}
