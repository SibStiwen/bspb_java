import java.util.Arrays;

public class Lesson2 {
    public static final boolean MAN = true;
    public static final boolean WOMAN = false;
    public static final int MAX_SIZE = 10;
    public static final int NAME = 0;
    public static final int SEX = 1;
    public static final int AGE = 2;

    private static Object[][] clients = new Object[MAX_SIZE][3];

    private static int counter = 0;

    public static void main(String[] args) {

// Сгенерируем массив с данными
        addClients();

// Фильтрация по полу, данные выведем в результирующий массив, чтобы не портить данные
        Object[][] outClients = filterClientsBySex(WOMAN, clients);

// Сортировка отфильтрованнного массива по возрасту
        outClients = sortClientsByAge(outClients);

// Выводим отфильтрованный и отсортированный массив
        printClients(outClients);

    }


    private static void addClients() {
        addClient("Беляев Александр Александрович", MAN, 36);
        addClient("Щербакова Мария Лукинична", WOMAN, 19);
        addClient("Серебрякова Таисия Робертовна", WOMAN, 41);
        addClient("Агафонова Вероника Дмитриевна", WOMAN, 22);
        addClient("Русаков Максим Константинович", MAN, 23);
        addClient("Данилова Варвара Дамировна", WOMAN, 41);
        addClient("Астафьев Степан Артёмович", MAN, 55);
        addClient("Алексеев Фёдор Артёмович", MAN, 67);
        addClient("Макаров Павел Робертович", MAN, 30);
        addClient("Антонов Григорий Кириллович", MAN, 44);
    }

    private static void addClient(String name, boolean sex, int age) {
        clients[counter][NAME] = name;
        clients[counter][SEX] = sex;
        clients[counter][AGE] = age;
        counter++;
    }

    public static Object[][] sortClientsByAge(Object[][] clients) {
        for (int i = clients.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((int) clients[j][AGE] > (int) clients[j + 1][AGE]) {
                    changeElements(clients, j, NAME);
                    changeElements(clients, j, SEX);
                    changeElements(clients, j, AGE);
                }
            }
        }
        return clients;
    }

    private static void changeElements(Object[][] outClients, int row, int column) {
        Object tmp = outClients[row][column];
        outClients[row][column] = outClients[row + 1][column];
        outClients[row + 1][column] = tmp;
    }

    public static Object[][] filterClientsBySex(boolean sex, Object[][] clients) {
        Object[][] outClients = new Object[MAX_SIZE][3];
        int outCounter = 0;
        for (Object[] client : clients) {
            if ((boolean) client[1] == sex) {
                outClients[outCounter][NAME] = client[NAME]; //name
                outClients[outCounter][SEX] = client[SEX]; //sex
                outClients[outCounter][AGE] = client[AGE]; //age
                outCounter++;
            }
        }
        return Arrays.copyOf(outClients, outCounter);
    }

    private static void printClients(Object[][] outClients) {
        for (Object[] outClient : outClients) {
            char sex = (boolean) outClient[SEX] ? 'М' : 'Ж';
            System.out.printf("%s %s %s \n", outClient[NAME], sex, outClient[AGE]);
        }
    }

}




