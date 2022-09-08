public class main {
    public static void main(String[] args){
        int list[]={1,2,3,4,5,6,7};
        double harmonicAverage = 0;
        for (double i : list) {
            harmonicAverage += (1 / i);
        }

        harmonicAverage = list.length / harmonicAverage;
        System.out.println("Harmonic average of the numbers in the array : " + (harmonicAverage));
    }
}
