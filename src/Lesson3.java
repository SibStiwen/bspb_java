import clients.Client;


import static clients.ClientUtils.*;
import static clients.Gender.MALE;
import static clients.Gender.FEMALE;

public class Lesson3 {

    public static void main(String[] args) {
        Client[] clients = {
                new Client("Беляев Александр Александрович", MALE, 36),
                new Client("Щербакова Мария Лукинична", FEMALE, 19),
                new Client("Серебрякова Таисия Робертовна", FEMALE, 41),
                new Client("Агафонова Вероника Дмитриевна", FEMALE, 22),
                new Client("Русаков Максим Константинович", MALE, 23),
                new Client("Данилова Варвара Дамировна", FEMALE, 41),
                new Client("Алексеев Фёдор Артёмович", MALE, 67),
                new Client("Алексеев Фёдор Артёмович", MALE, 67),
                new Client("Макаров Павел Робертович", MALE, 30),
                new Client("Антонов Григорий Кириллович", MALE, 44),
        };

        Client[] outClients = deleteDoubles(clients);

        outClients = filterClientsBySex(MALE, outClients);

        outClients = sortClientsByAge(outClients);

        for (Client client : outClients) System.out.println(client.toString());

    }
}
