/**
 * 
 */
package assignment.Week7;

import java.util.List;
import java.util.ArrayList;

public class QuickSort {
 
    public static int[] Sort(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n : array){
            list.add(n);//put array into arraylist
        }
        list = Sort(list);//overload sort() to sort the list
        for (int i = 0;i < array.length;++i) {
            array[i] = list.get(i);
        }
		return array;//put the things back to array form
    }
 
    public static List<Integer> Sort(List<Integer> list) {//quicksort
        if (list.size() < 2)
            return list;
        // take middle pivot
        int pivot = list.get(list.size() / 2);
        list.remove(list.size() / 2);
        List<Integer> less = new ArrayList<Integer>();//list of lesser than pivot
        List<Integer> greater = new ArrayList<Integer>();//list of greater than pivot
        List<Integer> result = new ArrayList<Integer>();//list of sorting result
        for (Integer n : list)
        {
            if (n > pivot)
                greater.add(n);
            else
                less.add(n);
        }
        result.addAll(Sort(less));
        result.add(pivot);
        result.addAll(Sort(greater));
        return result;
    }
    
    public static void main(String[] args){//test
    	int[] seq = new int[] {30,13,22,90};
    	System.out.print("[ ");
    	for(int i=0;i<seq.length;i++){
    		System.out.print(seq[i]+" ");
    	}
    	System.out.print("]\nQuick Sort :\n[ ");
    	for(int i=0;i<seq.length;i++){
    		System.out.print(Sort(seq)[i]+" ");
    	}
    	System.out.print("]");
    }
}
