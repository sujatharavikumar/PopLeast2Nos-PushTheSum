package Ravikumar.Sujatha.HackerRankPopandFindSum;

import java.util.*;

/**
 * Created by sujatharavikumar on 10/24/16.
 */
public class HackerRank {

    static int reductionCost(int[] num) {
        List<Integer> list = new ArrayList<>();
        int num1, num2, total = 0;
        Stack st = new Stack();
        int sum = 0;
        Arrays.sort(num);
        num = reverse(num);
        for (int i=0; i<num.length; i++){
            st.push(num[i]);
        }
        Iterator iterator = st.iterator();
        while (iterator.hasNext() && st.size()>1) {
            num1 = (Integer)st.pop();
            num2 = (Integer)st.pop();
            sum = num1 + num2;
            list.add(sum);
            st.push(sum);
            st.sort(Collections.reverseOrder());

        }

        for(Integer value : list){
            total += value;
        }

        return total;
    }

    public static int[] reverse(int arr[]) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int sum = reductionCost(num);
        System.out.println(sum);
    }

}
