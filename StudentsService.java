public class StudentsService {
    //---------------------------------------------------------------------------
    //Task 1
    public void printFullNames(Student[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName());
            System.out.println("------------------");
        }

    }

    //---------------------------------------------------------------------------
    //Task 2
    public void printAllMales(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'm') {
              arr[i].Print();
                System.out.println("-----------------");
            }
        }
    }

    //----------------------------------------------------------------------------
    //Task 3
    public void printAllFemaleStudentsWithMark(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'f' && arr[i].getMark() >= 50.4) {
                arr[i].Print();
                System.out.println("-----------------");
            }
        }
    }

    //--------------------------------------------------------------
    //Task 4
    public void printStudentWithMinMark(Student[] arr) {
        Student s = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMark() < s.getMark()) {
                s = arr[i];
            }
        }
        s.Print();
    }

    //task 5
    //---------------------------------------------------
    public void printBiggestMaleStudent(Student[] arr) {
        int i = 0;
        Student s = new Student();
        for (i = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'm') {
                s = arr[i];
                break;
            }
        }
        for (int j = i; j < arr.length; j++) {
            if (arr[i].getGender() == 'm' && arr[i].getAge() < s.getAge()) {
                s = arr[i];
            }
        }
        s.Print();
    }

    //Task 6
    //----------------------------------------------------------------
    public void sortedByMark(Student[] arr) {
        boolean notArranged = false;
        while (!notArranged) {
            notArranged = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i].getMark() > arr[i + 1].getMark()) {
                    Student temp2 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp2;
                    notArranged = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].Print();
            System.out.println("-----------------");
        }
    }

    //TASK 7
    //-------------------------------------------------------
    public void femaleStudentsSortedByYear(Student[] arr) {
        boolean notArranged = false;
        while (!notArranged) {
            notArranged = true;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i].getAge() < arr[i + 1].getAge()) {
                    Student temp2 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp2;
                    notArranged = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGender() == 'f')
                arr[i].Print();
            System.out.println("-----------------");
        }
    }


}
