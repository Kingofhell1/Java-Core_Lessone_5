import java.io.File;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        BackupUtility backUp = new BackupUtility();
        String sourceDir = "./source";  // директория, из которой нужно создать резервную копию
        String backupDir = "./backup";  // путь к директории, в которой будет создана резервная копия
        try {
            backUp.backupFiles(sourceDir, backupDir);
            System.out.println("Резервная копия успешно создана.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании резервной копии: " + e.getMessage());
        }

        TreeUpdate tree = new TreeUpdate();
        tree.print(new File("."), "", true);
    }
}