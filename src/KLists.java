public class KLists {
    public double [] mergeKLists(double [][] outerArray)
    {
        int size = 0;
        for (int i=0; i<outerArray.length; i++)
        {
            size = size + outerArray[i].length;
        }
        double [] output = new double[size];
        int [] idx = new int[outerArray.length];
        for (int i=0; i<outerArray.length-1; i++)
        {
            idx[i] = 0;
        }

        for (int i=0; i<size; i++)
        {
            int min = 0;
            for (int j=0; j<outerArray.length; j++){
                if (outerArray[min][idx[min]] >  outerArray[j][idx[j]]) {
                    min = j;
                }
                while (idx[min]<outerArray[min].length){
                    idx[min]++;
                }
            }
            output[i]=outerArray[min][idx[min]];

        }
        return output;
    }


    public static void main(String [] args)
    {
        double[][]test = {{1.1, 4.4, 5.5},{1.1, 3.3, 4.4},{2.2, 6.6}};
        KLists lists = new KLists();
        lists.mergeKLists(test);
    }
}
