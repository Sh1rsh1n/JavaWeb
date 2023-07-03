package shirshin.homework_5_final;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Backup {

    // формируем путь к папке backup, путем конкатенации названий корневого каталога, разделителя ОС и названия папки
    private final static Path backupPath = Path.of("src/shirshin/homework_5_final/backup");

    /*
    * @param source - путь до директории из которой нужно скопировать файлы
    * @param target - путь до директории в которую копируем файлы
    * метод, делает копию всех файлов из указанной директории в директорию C:\backup
     */
    public static void folderBackup(String source) {

        // если директория несуществует, то создаем ее
        if (Files.notExists(backupPath)) {
            try {
                Files.createDirectory(backupPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        List<Path> pathsList;

        // обходим директорию и помещаем результат в поток данных
        try (Stream<Path> pathStream = Files.walk(Paths.get(source), 1, FileVisitOption.FOLLOW_LINKS)) {

            // в потоке фильтруем полученные данные и оставляем только файлы, помещаем их в список
            pathsList = pathStream.filter(path -> !Files.isDirectory(path)).collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int fileCounter = 0;

        // проходим по всем элементам списка, проверяем существует ли файл в конечном каталоге,
        // если файла нет, копируем его в указаную папку
        for (Path path : pathsList) {
            try {
                if (!Files.exists(Path.of(backupPath.toAbsolutePath() + FileSystems.getDefault().getSeparator() + path.getFileName().toString()))) {
                    Files.copy(path, Paths.get(backupPath.toAbsolutePath() + FileSystems.getDefault().getSeparator() + path.getFileName().toString()));
                    fileCounter++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("============================================================================");
        System.out.printf("Copy is %d files from '%s' to '%s' is done!\n", fileCounter, source, backupPath.toAbsolutePath());
        System.out.println("============================================================================");
    }
}
