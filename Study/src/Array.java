public class Array {

    public static void main(String[] arg)
    {
        int [] array ;

        array = new int[5];

        double [] array1;
        array1 = new double[100];

        array[0] = 100;
        array[1] = 76;
        array[2] = 92;
        array[3] = 95;
        array[4] = 14;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        for(int i = 0 ; i < array.length ; ++i)
        {
            System.out.println("점수 "+i+" :  "+array[i]);
        }

        int i = 0;
        while (i < array.length)
        {
            System.out.println("점수 "+i+" : "+array[i]);
            ++i;
        }



    }
}
