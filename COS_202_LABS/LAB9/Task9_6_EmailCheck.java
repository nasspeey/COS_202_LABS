public class Task9_6_EmailCheck {
    static boolean isValidEmail(String email) {
        if (email.contains(" ")) return false;
        int at = email.indexOf('@');
        if (at <= 0) return false;                         // no @, or nothing before it
        if (email.indexOf('@', at + 1) != -1) return false; // more than one @
        int dot = email.indexOf('.', at + 1);               // a dot AFTER the @
        return dot > at + 1 && dot < email.length() - 1;    // text between @ and dot, and text after dot
    }

    public static void main(String[] args) {
        String[] tests = {"anass@example.com", "no-at-sign.com", "two@@example.com", "a@b@c.com",
                          "space in@mail.com", "user@nodot", "@example.com", "user@.com", "user@site."};
        for (String t : tests)
            System.out.println(String.format("%-22s", t) + " -> " + (isValidEmail(t) ? "valid" : "INVALID"));
    }
}
