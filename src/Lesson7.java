import clientsl6.Client;
import clientsl6.Individual;
import clientsl6.Phisical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static clientsl6.ClientUtils.deleteDoubles;
import static clientsl6.ClientUtils.isSearchedGender;
import static clientsl6.Gender.FEMALE;
import static clientsl6.Gender.MALE;

public class Lesson7 {
    public static void main(String[] args) {
        Stream<Client> clients = Stream.of(
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

        List<Client> outClients = clients.distinct()
                .filter(client -> isSearchedGender(client, MALE))
                .sorted(Comparator.comparingInt(Client::getAge))
                .collect(Collectors.toList());
        outClients.forEach(Client::print);
    }
}
