import java.util.HashSet;
import java.util.Set;

class Task929UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> original = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.replaceAll(".", "");
            original.add(local + rest);
        }

        return original.size();
    }
}

