public class MyMain {
    
    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] mylist = new int[arr.length];
        int start = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                mylist[i] = arr[start];
                start++;
            }
            if (i % 2 == 1){
                mylist[i] = arr[arr.length/2 + start - 1];
            }

        }
        return mylist;
    }
    
    
    public static boolean ifrepeat(int[] arr,int random,int time,int[] random_list,int zerotime){



        int num = 0;
        for (int random_repeat = 0; random_repeat < random_list.length; random_repeat++){

            if (random_list[random_repeat] == random && random != 0){
                num++;
            }
            
        }
        if (num > 0 ){
            return true;
        }
        else{
            random_list[time] = random;
            return false;
        }
    }
    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        int zerotime = 0;
        int[] extra_list = new int[arr.length];
        int[] mylist = new int[arr.length];
        int random_num = 0;
        for (int i = 0; i < arr.length; i++){
            random_num = (int) (Math.random() * arr.length);
            while(ifrepeat(arr,random_num,i,extra_list,zerotime)) {
                random_num = (int) (Math.random() * arr.length);
            }
            mylist[i] = arr[random_num];
        }
        return mylist;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        int[] list = {1,2,3,4,5,21,22,23,24,25};
        System.out.print(selectionShuffle(list));
    }
}
