public class Main {
    public static void main(String[] args) {
        int bufer;                                      // переменная для временного хранения элементов массива
        int[] array = new int[23];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);      // заполняеи массив случайными числами от 0 до 10
            System.out.print(array[i] + " ");
        }
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            bufer = array[i];                           // инвертируем массив методом "трех стаканов"
            array[i] = array[j];
            array[j] = bufer;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
