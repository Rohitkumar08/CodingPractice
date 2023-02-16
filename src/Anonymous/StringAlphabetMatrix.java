package Anonymous;

/**
 * Created 31/10/21 9:54 PM
 *
 * @author Rohit Rawani
 */
public class StringAlphabetMatrix {
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int[] current = new int[]{0, 0}, next;

        for (int idx = 0; idx < target.length(); idx++) {
            next = getCoordinate(target.charAt(idx));
            if (current[1] < next[1]) {
                // If going right, always go up/down first and then go right. This will cover corner case of 'z' being the source.
                append(sb, Math.abs(current[0] - next[0]), current[0] < next[0] ? 'D' : 'U');
                append(sb, next[1] - current[1], 'R');
            } else {
                // If going left, always go left first and then go up/down. This will cover corner case of 'z' being the destination.
                append(sb, current[1] - next[1], 'L');
                append(sb, Math.abs(current[0] - next[0]), current[0] < next[0] ? 'D' : 'U');
            }

            sb.append('!');
            current = next;
        }

        return sb.toString();
    }

    private int[] getCoordinate(char ch) {
        return new int[]{(ch - 'a') / 5, (ch - 'a') % 5};
    }

    private void append(StringBuilder sb, int steps, char ch) {
        for (int count = 0; count < steps; count++) {
            sb.append(ch);
        }
    }

    public static void main(String[] args) {
        StringAlphabetMatrix sax = new StringAlphabetMatrix();
        System.out.println(sax.alphabetBoardPath("leet"));
    }
}
