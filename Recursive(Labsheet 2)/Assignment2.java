public class Assignment2 {
    private static void makeComb(char [] arr,String comb,int index){
        System.out.println(comb);

        for(int i=index;i<arr.length;i++){
            makeComb(arr, comb+arr[i], i+1);
        }
    }

    public static void main(String[] args) {
        char [] arr={'a','b','c'};
        makeComb(arr,"",0);
    }
}
