public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = {2,5,7,8,1,3};

    int n = arr.length;

    for( int i = 0;i<n-1;i++){
        for( int j = 0; j< n-1-i;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }

      for(int x: arr){
      System.out.print(x + " ");
      }
  }
}
