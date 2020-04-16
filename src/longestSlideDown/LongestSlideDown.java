package longestSlideDown;
/*
Lyrics...
Pyramids are amazing! Both in architectural and mathematical sense. If you have a computer, you can mess with pyramids
even if you are not in Egypt at the time. For example, let's consider the following problem. Imagine that you have a pyramid built of numbers, like this one here:

   /3/
  \7\ 4
 2 \4\ 6
8 5 \9\ 3
Here comes the task...
Let's say that the 'slide down' is the maximum sum of consecutive numbers from the top to the bottom of the pyramid. As
you can see, the longest 'slide down' is 3 + 7 + 4 + 9 = 23

Your task is to write a function longestSlideDown (in ruby: longest_slide_down) that takes a pyramid representation as
argument and returns its' largest 'slide down'. For example,

longestSlideDown [[3], [7, 4], [2, 4, 6], [8, 5, 9, 3]] => 23
By the way...
My tests include some extraordinarily high pyramids so as you can guess, brute-force method is a bad idea unless you
have a few centuries to waste. You must come up with something more clever than that.

(c) This task is a lyrical version of the Problem 18 and/or Problem 67 on ProjectEuler.
 */

/*

 Starting from the leafs the tree colapses untill we reach [0][0]
   3
  7 4
 2 4 6
8 5 9 3

Goes to:
    3
   7 4
 10 13 12

Goes to:
     3
   20 17

Goes to:
    23

 */

public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {

        for(int x =  pyramid.length - 2; x >= 0; x--){ // for each column. at
            for(int y = pyramid[x].length - 1; y >= 0; y--){ // for each row

                // finds the bigger leaf and adds it to the tree
                pyramid[x][y] += Math.max(pyramid[x + 1][y], pyramid[x + 1][y + 1]);
            }
        }
        //[0][0] we have fully traversed the tree
        return pyramid[0][0];
    }
}
