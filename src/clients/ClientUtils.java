package clients;

public class ClientUtils {


    public static Client[] sortClientsByAge(Client[] clients) {
        Client[] outClients = clients;
        for (int i = clients.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (clients[j].getAge() > clients[j + 1].getAge()) {
                    Client tmp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = tmp;
                }
            }
        }
        return outClients;
    }

    public static Client[] filterClientsBySex(Gender gender, Client[] clients) {
        Client[] outClients = new Client[clients.length];
        int outCounter = 0;
        for (Client client : clients) {
            if (client.getGender() == gender) {
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
/*        for (int i = 0; i < newLength; i++) {
            newArray[i] = oldArray[i];
        }*/
        return newArray;
    }
}
