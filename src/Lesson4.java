
import clientsl4.Individual;
import clientsl4.Phisical;
import clientsl4.Client;

import java.util.Arrays;

import static clientsl4.ClientUtils.deleteDoubles;
import static clientsl4.ClientUtils.filterClientsByGender;
import static clientsl4.Gender.FEMALE;
import static clientsl4.Gender.MALE;

public class Lesson4 {
    public static void main(String[] args) {
        Client[] clients = {
                new Phisical("Беляев Александр Александрович", 36, MALE),
                new Phisical("Щербакова Мария Лукинична", 19, FEMALE),
                new Phisical("Серебрякова Таисия Робертовна", 41, FEMALE),
                new Phisical("Агафонова Вероника Дмитриевна", 22, FEMALE),
                new Phisical("Русаков Максим Константинович", 23, MALE),
                new Phisical("Данилова Варвара Дамировна", 41, FEMALE),
                new Phisical("Алексеев Фёдор Артёмович", 67, MALE),
                new Phisical("Алексеев Фёдор Артёмович", 67, MALE),
                new Phisical("Макаров Павел Робертович", 30, MALE),
                new Phisical("Антонов Григорий Кириллович", 44, MALE),
                new Individual("Антонов Григорий Кириллович", 44, 23332),
                new Individual("Антонов Григорий Кириллович", 44, 23332)
        };

        Client[] outClients = deleteDoubles(clients);

        outClients = filterClientsByGender(MALE, outClients);

        Arrays.sort(outClients);

        for (Client client : outClients) client.print();

    }
}
