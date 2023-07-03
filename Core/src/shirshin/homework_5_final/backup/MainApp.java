package shirshin.homework_5_final;

public class MainApp {
    public static void main(String[] args) {

        // Задание №1
        Backup.folderBackup("src/shirshin/homework_5_final");

        // Задание №2
        int[] array = {2, 2, 1, 1, 2, 2, 0, 1, 1};
        for (Integer i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n********************************");

        byte[] bytes = ArrayToBin.compressingIntArray(array);
        for (Byte b : bytes) {
            System.out.print(b + " ");
        }

        System.out.println("\n********************************");

        ArrayToBin.writeArrayToBin(bytes, "src/shirshin/homework_5_final/array.bin");

        byte[] bytes1 = ArrayToBin.readBinToArray("src/shirshin/homework_5_final/array.bin");

        for (Byte b : bytes1) {
            System.out.print(b + " ");
        }
    }
}
