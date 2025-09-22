class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        switch (sb.charAt(0)) {
            case '+':
                return Integer.parseInt(sb.delete(0, 1).toString());
            case '-':
                return -Integer.parseInt(sb.delete(0, 1).toString());
            default:
                return Integer.parseInt(sb.toString());
        }
    }
}
