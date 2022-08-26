public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("================= Задание 1 ==============");
        int[] integer = new int[]{1, 2, 3};
        double[] drob = {1.57, 7.654, 9.986};
        String[] str = new String[4];
        str[0] = "осень";
        str[1] = "зима";
        str[2] = "весна";
        str[3] = "лето";
        // Задание 2
        System.out.println("================= Задание 2 ==============");
        System.out.print("Целочисленный массив integer: ");
        for (int i = 0; i < integer.length; i++) {
            if (i < integer.length - 1) {
                System.out.print(integer[i] + ", ");
            } else {
                System.out.println(integer[i]);
            }
        }
        System.out.print("Дробный массив drob: ");
        for (int i = 0; i < drob.length; i++) {
            if (i < drob.length - 1) {
                System.out.print(drob[i] + ", ");
            } else {
                System.out.println(drob[i]);
            }
        }
        System.out.print("Строковый массив str: ");
        for (int i = 0; i < str.length; i++) {
            if (i < str.length - 1) {
                System.out.print(str[i] + ", ");
            } else {
                System.out.println(str[i]);
            }
        }
        // Задание 3
        System.out.println("================= Задание 3 ==============");
        System.out.print("Целочисленный массив integer: ");
        int i = integer.length-1;
        while (i >= 0) {
            if (i == 0)
            {
                System.out.println(integer[i]);
            }else
            {
                System.out.print(integer[i] + ", ");
            }
            i--;
        }
        System.out.print("Дробный массив drob: ");
        i = drob.length-1;
        while (i >= 0) {
            if (i == 0)
            {
                System.out.println(drob[i]);
            }else
            {
                System.out.print(drob[i] + ", ");
            }
            i--;
        }
        System.out.print("Строковый массив str: ");
        i = str.length-1;
        while (i >= 0) {
            if (i == 0)
            {
                System.out.println(str[i]);
            }else
            {
                System.out.print(str[i] + ", ");
            }
            i--;
        }
        // Задание 4
        System.out.println("================= Задание 4 ==============");
        System.out.print("Преобразованный целочисленный массив integer: ");
        for (int j = 0; j < integer.length; j++)
        {
            if (integer[j] % 2 != 0)
            {
            integer[j] = integer[j] + 1;
            }
            System.out.print(integer[j] + " ");
        }
    }
}
