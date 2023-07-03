package shirshin.homework_5_final;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ArrayToBin {

    private final static int capacity = 9;

    /*
     * метод, создает массив целых чисел,
     * заполняет его случайными числами в диапазоне от 0 до 3
     */
    public static int[] fillArray() {
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = new Random().nextInt(4);
        }
        return array;
    }


    /*
     * метод, принимает на вход массив целых чисел
     * с помощью побитовых операций ИЛИ и сдвига влево, получаем нужный результат
     */
    public static byte[] compressingIntArray(int[] array) {
        byte[] bytes = new byte[(int) Math.sqrt(array.length)];
        for (int i = 0; i < array.length; i++) {
            int shift = i % 4 * 2;
            bytes[i / 4] |= (array[i] << shift);
        }
        return bytes;
    }


    /*
    * метод, записывает данные в файл
     */
    public static void writeArrayToBin(byte[] bytes, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(bytes);
            System.out.println("write bin file is done...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /*
    * метод читает данные из файлы, выводит результат в консоль
     */
    public static byte[] readBinToArray(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            System.out.println("read bin file is done...");
            return fis.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
