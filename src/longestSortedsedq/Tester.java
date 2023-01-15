package longestSortedsedq;

import ArrayListArray.MyArrayList;

public class Tester {
    public static int longest(MyArrayList<Integer> a){
        int l =1;
        int ans =1;
        for (int i = 1; i < a.getSize(); i++) {
           if(a.get_elem(i-1)<a.get_elem(i)){
               l++;
               ans=Math.max(ans,l);
           }else{
               l=1;
           }
        }
        ans = Math.max(ans,l);
        return ans;
    }

    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();
        a.insert(0,1);
        a.insert(1,3);
        a.insert(2,5);
        a.insert(3,2);
        a.insert(4,9);
        a.insert(5,7);
        a.insert(6,-3);
        a.insert(7,0);
        a.insert(8,42);
        a.insert(9,3008);
        a.insert(10,17);
        System.out.println(longest(a));

    }

}
