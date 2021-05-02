package ds;

public class SearchRotatedArray {
    public static void main(String[] args) {
       int arr[] = {7, 8,9, 10, 1, 2, 3,4,5, 6};
        int element =3;
     int index =  search(arr,element,0, arr.length-1);
     System.out.println(index);
    }

    private static int search(int[] arr, int element, int l, int r) {
        if(r<=l)
            return -1;
        if(element == arr[l])
            return l;
        if (element ==arr[r])
            return r;

         int mid = (l+r)/2;
        if (element ==arr[mid])
            return mid;


         if(arr[mid]>arr[l]  && (element>=arr[l] && element <= arr[mid] ))
         {
             return search(arr,element,l,mid-1);
         }else
             return  search(arr,element,mid+1,r);



    }
}
