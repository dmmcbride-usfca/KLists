//public class KLists {
//    public double [] mergeKLists(double [][] outerArray)
//    {
//        int size = 0;
//        for (int i=0; i<outerArray.length; i++)
//        {
//            size = size + outerArray[i].length;
//        }
//
//        double [] outputArray = mergeArrays();
//
//
//        double [] minVals =
//
//        return outputArray;
//    }
//    private double [] mergeArrays(double [][] arr, int i, int j, double [] output)
//    {
//        if (j-i==1)
//        {
//            for
//            return mergeArrays(arr[i],arr[j],output);
//        }
//        double [] out1 = new double[];
//
//        mergeKLists(arr, i, j/2, out1);
//        mergeKLists(arr, j/2+1, j, out2);
//    }
//
//    public double [] mergeArrays(double [] bot, double [] top, double [] target)
//    {
//        int size = bot.length+top.length;
//        double [] target = new double[size];
//        int botI = 0;
//        int topI = 0;
//
//        for (int i=0; i<target.length; i++)
//        {
//            if (botI<bot.length && topI<top.length)
//            {
//                if (bot[botI] < top[topI])
//                {
//                    target[i] = bot[botI];
//                    botI++;
//                }
//                else
//                {
//                    target[i] = top[topI];
//                    topI++;
//                }
//            }
//            else if (botI<bot.length)
//            {
//                target[i] = bot[botI];
//                botI++;
//            }
//            else if (topI<top.length)
//            {
//                target[i] = top[topI];
//                topI++;
//            }
//        }
//        return target;
//    }
//
//    public static void main(String [] args)
//    {
//        double[][]test = {{1.1, 4.4, 5.5},{1.1, 3.3, 4.4},{2.2, 6.6}};
//        KLists lists = new KLists();
//        lists.mergeKLists(test);
//    }
//}
