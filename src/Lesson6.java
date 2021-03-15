import clientsl6.Client;
import clientsl6.Individual;
import clientsl6.Phisical;

import java.util.Arrays;
import java.util.List;

import static clientsl6.ClientUtils.deleteDoubles;
import static clientsl6.ClientUtils.filterClientsByGender;
import static clientsl6.Gender.FEMALE;
import static clientsl6.Gender.MALE;

public class Lesson6 {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
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
        );


        List<Client> outClients = deleteDoubles(clients);

        outClients = filterClientsByGender(MALE, outClients);


        outClients.sort((o1, o2) -> {
            if (o1.getAge() > o2.getAge()) return 1;
            if (o1.getAge() == o2.getAge()) return 0;
            else return -1;
        });

        for (Client client : outClients) client.print();

    }
}
