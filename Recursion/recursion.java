package Recursion;
class ReverseArray{
    public static void main(String[] args) {
        int[] arr = {12,34,56,78};
        
        name(arr, 0, 3);
        for(int i : arr)
            System.out.println(i);

    }
    public static void name(int[] arr, int l, int r) {
        if(l>=r) return;
        swap(arr, l, r);
        name(arr, l+1, r-1);
    }
    public static void swap(int[] arr, int l, int r) {
        int temp;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;    
    }
}