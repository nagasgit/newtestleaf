package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class StocksProg_Solutions {

        public int TradeatProfit(int[] input) {
            int leastbuyprice = input[0];
            int newindex = 0;

            for (int i = 0; i <= input.length - 1; i++) {
                if (input[i] < leastbuyprice) {
                    leastbuyprice = input[i];
                    newindex = i;

                }
            }

            int maxsellprice = input[newindex];

            System.out.println(leastbuyprice);
            System.out.println(newindex);

            for (int j = newindex; j <= input.length - 1; j++) {
                if (input[j] > maxsellprice) {
                    maxsellprice = input[j];

                }
            }
            System.out.println(maxsellprice);


            return maxsellprice - leastbuyprice;
        }


        @Test
        public void test1() {
            Assert.assertEquals(5, TradeatProfit(new int[]{7, 1, 5, 3, 6, 4}));
        }

        @Test
        public void test2() {
            Assert.assertEquals(0, TradeatProfit(new int[]{7, 6, 4, 3, 1}));
        }


    }
