public class Main {

    public static void main (String[] args){


        int[] my_list =  {3,22,1,13,4,6,16,5};
        int i =0;
//Задача1
        for (i=0;i<my_list.length;i++){
            if (my_list[i] %2 > 0 )
                ;
            else System.out.print(my_list[i] + " ");
        }
        System.out.println();

//Задача2
        for (i=0;i<my_list.length;i++){
            if (my_list[i] > 9 & my_list[i] < 100)
                System.out.print(my_list[i] + " ");
        }
        System.out.println();

//Задача3
        int k=0;
        for (i=0;i<my_list.length-1;i++){
          if (my_list[i+1] > k)
              k = my_list[i+1];
        }
        System.out.println(k);

//Задача4
        k=my_list[0];
        for (i=0;i<my_list.length-1;i++){
                k = k + my_list[i+1];
        }
        System.out.println(k);
    }

}