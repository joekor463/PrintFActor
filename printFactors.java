public class printFactors {
    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor ( 25, 15 ));
        //ystem.out.println ("result -" + result);

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) | (second < 10)) return -1;

        int ostatok = 0;
        int[] myArray1 = new int[first];
        int[] myArray2 = new int[second];

        for (int i = 1; i < first; i++) {
            ostatok = first % i;
            if (ostatok == 0) {
                myArray1[i] = first / i;
                //System.out.println ( myArray1[i] );
            }
        }
}
