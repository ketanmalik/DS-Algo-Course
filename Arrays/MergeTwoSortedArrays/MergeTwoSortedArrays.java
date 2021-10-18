package MergeTwoSortedArrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,3,5,7,9};
        int[] a2 = new int[]{2,4,6,8};

        System.out.println(Arrays.toString(joinArrs(a1, a2)));
    }

    public static int[] joinArrs(int[] a1, int[] a2) {
        if(a1.length == 0) return a2;
        if(a2.length == 0) return a1;

        int[] res = new int[a1.length + a2.length];
        int ptr1 = 0, ptr2  = 0, idx = 0;

        while(ptr1 < a1.length && ptr2 < a2.length) {
            if(a1[ptr1] < a2[ptr2]) {
                res[idx++] = a1[ptr1++];
            } else {
                res[idx++] = a2[ptr2++];
            }
        }

        if(ptr1 < a1.length) {
            while(ptr1 < a1.length) {
             res[idx++] = a1[ptr1++];
            }
        }

        if(ptr2 < a2.length) {
            res[idx++] = a2[ptr2++];
        }

        return res;
    }
}
