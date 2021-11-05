import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

/*  Escriu tots els nombres del 1 fins al N.

Input Format

Dóna un nombre N fins on iterar.

Constraints

Suposem N més gran o igual que 1

Output Format

Imprimeix un nombre en cada fila fins al N inclòs.

Sample Input 0

5
Sample Output 0

1
2
3
4
5
 */








public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int i = 1;

        while (i <= n) {System.out.println(i);
            i++;
        }


    }
}
