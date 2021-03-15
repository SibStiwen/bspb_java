package clientsl6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClientUtils {

    public static List<Client> filterClientsByGender(Gender gender, List<Client> clients) {
        List<Client> outClients = new ArrayList<>();
        for (Client client : clients) {
            if (isSearchedGender(client, gender)) {
                outClients.add(client);
            }
        }
        return outClients;
    }

    public static List<Client> deleteDoubles(List<Client> clients) {
        Set<Client> setClients = new LinkedHashSet<>(clients);
        List<Client> outClients = new ArrayList<>(setClients);
        return outClients;
    }

    private static boolean isSearchedGender(Client client, Gender gender) {
        if (client instanceof Phisical) {
            Phisical pclient = (Phisical) client;
            return pclient.getGender() == gender;
        }
        return true;
    }
}
