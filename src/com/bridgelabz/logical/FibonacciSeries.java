package com.bridgelabz.logical;


    class GFG {


        static void findSeries(int num,
                               int first, int sec)
        {

            System.out.print(first + " "
                    + sec + " ");
            int counter = 0, sum;

            // find next (num - 2) terms
            // of series as first two
            // terms are already given
            while (counter < num - 2)
            {
                sum = first + sec;
                System.out.print( sum + " ");
                first = sec;
                sec = sum;
                counter++;
            }
        }


        public static void main (String[] args)
        {
            int n = 5, first = 2, sec = 4;

            findSeries(n, first, sec);
        }
    }

