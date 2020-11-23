import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\PC\\Desktop\\StudentsInformation.txt");//creating an instance for file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = br.readLine()) != null) {

            sb.append(line);
            sb.append("\n");
        }
        fr.close();

        String[] arr = sb.toString().split("\n");
        Student[] studentArray = new Student[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] student = arr[i].split(",");
            studentArray[i] = new Student();
            studentArray[i].setFromArray(student);
        }

        StudentsService test = new StudentsService();
        test.printFullNames(studentArray);
        System.out.println("----------------------------------");
        test.printStudentWithMinMark(studentArray);
        test.printAllMales(studentArray);

    }
}
