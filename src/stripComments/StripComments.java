package stripComments;



public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String commentS = "";

        for (String helper : commentSymbols) {
            commentS += helper;
        }

        commentS = String.format("[ ]*([%s].*)?$",commentS);

        String helperTwo = "";
        for (String t : text.split("\n")) {
            helperTwo += t.replaceAll(commentS, "") + "\n";
        }

        return helperTwo.substring(0, helperTwo.length() - 1);
    }

}
