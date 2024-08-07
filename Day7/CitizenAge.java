package Day7;

public class CitizenAge {
    public static void main(String[] args) {
            String [] arr = {"7868190130M7522","5303914400F9211","9273338290F4010"};
          System.out.println(  age(arr));
    }

    public static int age(String[] arr) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            String ans = arr[i].substring(11, 13);
            if(Integer.parseInt(ans)>40){
              count++;
            }
        }
        return count;

    }
}
