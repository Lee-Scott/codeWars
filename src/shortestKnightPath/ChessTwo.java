package shortestKnightPath;

import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
Given two different positions on a chess board, find the least number of moves it would take a knight to get from one to
the other. The positions will be passed as two arguments in algebraic notation. For example, knight("a3", "b5") should
return 1.

The knight is not allowed to move off the board. The board is 8x8.

For information on knight moves, see https://en.wikipedia.org/wiki/Knight_%28chess%29

For information on algebraic notation, see https://en.wikipedia.org/wiki/Algebraic_notation_%28chess%29

(Warning: many of the tests were generated randomly. If any do not work, the test cases will return the input, output,
and expected output; please post them.)
 */

public class ChessTwo{

    public static int knight(String...pos) {
        int[][] ab=Stream.of(pos).map(s->new int[]{"abcdefgh".indexOf(s.charAt(0)),s.charAt(1)-48}).toArray(int[][]::new);
        int[] dxy=IntStream.range(0,2).map(i->Math.abs(ab[0][i]-ab[1][i])).sorted().toArray();
        if(dxy[0]==0&&dxy[1]==1) return 3;
        if(dxy[0]==2&&dxy[1]==2||dxy[0]==1&&dxy[1]==1&&(pos[0]+pos[1]).matches(".*?(a1|h1|a8|h8).*")) return 4;
        int delta=dxy[1]-dxy[0];
        return delta-2*(int)Math.floor(1.0*(delta-dxy[0])/(dxy[0]>delta?3:4));
    }
}