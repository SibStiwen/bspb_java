package clientsl4;

public class ClientUtils {


    public static void sortClientsByAge(Client[] clients) {
        for (int i = clients.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (clients[j].getAge() > clients[j + 1].getAge()) {
                    Client tmp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = tmp;
                }
            }
        }
    }

    public static Client[] filterClientsByGender(Gender gender, Client[] clients) {
        Client[] outClients = new Client[clients.length];
        int outCounter = 0;
        for (Client client : clients) {
            if (genderFilter(client, gender)) {
                outClients[outCounter] = client;
                outCounter++;
            }
        }
        return slice(outClients, outCounter);
    }

    public static Client[] deleteDoubles(Client[] clients) {
        Client[] outClients = new Client[clients.length];
        int outCounter = 0;

        for (Client client : clients) {
            boolean exist = false;
            for (int i = 0; i < outCounter; i++) {
                if (outClients[i].equals(client)) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                outClients[outCounter] = client;
                outCounter++;
            }
        }
        return slice(outClients, outCounter);
    }

    public static Client[] slice(Client[] oldArray, int newLength) {
        Client[] newArray = new Client[newLength];
        if (newLength >= 0) System.arraycopy(oldArray, 0, newArray, 0, newLength);
        return newArray;
    }

    private static boolean genderFilter (Client client, Gender gender){
        if (client instanceof Phisical) {
            Phisical pclient = (Phisical) client;
            return pclient.getGender() == gender;
        }
        return true;
    }
}
