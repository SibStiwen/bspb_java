import clients.Client;

import static clients.Client.MAN;
import static clients.Client.WOMAN;
import static clients.ClientUtils.*;

public class Lesson3 {

    public static void main(String[] args) {
        Client[] clients = {
                new Client("Беляев Александр Александрович", MAN, 36),
                new Client("Щербакова Мария Лукинична", WOMAN, 19),
                new Client("Серебрякова Таисия Робертовна", WOMAN, 41),
                new Client("Агафонова Вероника Дмитриевна", WOMAN, 22),
                new Client("Русаков Максим Константинович", MAN, 23),
                new Client("Данилова Варвара Дамировна", WOMAN, 41),
                new Client("Алексеев Фёдор Артёмович", MAN, 67),
                new Client("Алексеев Фёдор Артёмович", MAN, 67),
                new Client("Макаров Павел Робертович", MAN, 30),
                new Client("Антонов Григорий Кириллович", MAN, 44),
        };

        Client[] outClients = deleteDoubles(clients);

        outClients = filterClientsBySex(MAN, outClients);

        outClients = sortClientsByAge(outClients);

        for (Client client : outClients) System.out.println(client.toString());

    }
}
