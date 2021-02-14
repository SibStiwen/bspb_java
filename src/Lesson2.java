public class Lesson2 {
    private static String[] names = new String[10];
    private static boolean[] sexes = new boolean[10];
    private static int[] ages = new int[10];

    private static String[] outNames = new String[10];
    private static boolean[] outSexes = new boolean[10];
    private static int[] outAges = new int[10];

    private static int counter = 0;
    private static int outCounter =0;

// Заполним массивы данными
    public static void main(String[] args) {
        newClient("Беляев Александр Александрович", true,36);
        newClient("Щербакова Мария Лукинична", false,19);
        newClient("Серебрякова Таисия Робертовна", false,41);
        newClient("Агафонова Вероника Дмитриевна", false,22);
        newClient("Русаков Максим Константинович", true,23);
        newClient("Данилова Варвара Дамировна", false,41);
        newClient("Астафьев Степан Артёмович",true,55);
        newClient("Алексеев Фёдор Артёмович", true,67);
        newClient("Макаров Павел Робертович",true,30);
        newClient("Антонов Григорий Кириллович", true,44);

// Отфильтруем по полу до сортировки, данные выведем в результирующие массивы
        filterClientsByAge(true);

// Отсортируем по возрасту
        sortClientsByAge();

// Выведем, указав пол буквой
        for (int i = 0; i < outCounter; i++) {
            char sex = 'Ж';
            if (outSexes[i]) {
                sex = 'М';
            }
            System.out.printf("%s %s %s %n", outNames[i], sex, outAges[i]);
//            System.out.println(outNames[i]+" "+sex+" "+outAges[i]);

        }

    }

    private static void newClient(String name, boolean sex, int age) {
        names[counter] = name;
        sexes[counter] = sex;
        ages[counter] = age;
        counter++;
    }

    public static void sortClientsByAge() {
        for (int i = outCounter - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (outAges[j] > outAges[j + 1]) {
                    int tmp = outAges[j];
                    outAges[j] = outAges[j + 1];
                    outAges[j + 1] = tmp;
                    boolean tmp2 = outSexes[j];
                    outSexes[j] = outSexes[j + 1];
                    outSexes[j + 1] = tmp2;
                    String tmp3 = outNames[j];
                    outNames[j] = outNames[j + 1];
                    outNames[j + 1] = tmp3;
                }
            }
        }


    }
    public static void filterClientsByAge(boolean isMan) {
        for (int i = 0; i < sexes.length; i++){
            if (sexes[i] == isMan){
                outNames[outCounter] = names[i];
                outSexes[outCounter] = sexes[i];
                outAges[outCounter] = ages[i];
                outCounter++;

            }
        }

    }


}




