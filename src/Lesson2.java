import java.util.Arrays;

public class Lesson2 {
    private static String[] names = new String[10];
    private static boolean[] sexes = new boolean[10];
    private static int[] ages = new int[10];
    private static int[] indexes = new int[10];
    private static int counter = 0;


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


        for (int i = 0; i < names.length; i++) {
            char sex = 'Ж';
            if (sexes[i]){
                sex = 'М';
            }
            System.out.println(names[i]+" "+sex+" "+ages[i]);

        }

    }

    private static void newClient(String name, boolean sex, int age) {
        if (counter >= 10){

        }
        names[counter] = name;
        sexes[counter] = sex;
        ages[counter] = age;
        indexes[counter] = counter;
        counter++;
    }

    public static void sortClientsAge () {
        for(int i = ages.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( ages[j] > ages[j+1] ){
                    int tmp = ages[j];
                    ages[j] = ages[j+1];
                    ages[j+1] = tmp;
                }
            }
        }

    }


}




