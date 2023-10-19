package controller;

public class ManagerController {

    private final ManagerService service = new ManagerServiceImpl();
    private final Scanner scanner = new Scanner(System.in);


    public void systemStart() throws Exception {

        int command = 0;
        String strCommand = null;

        do {

            System.out.print("==================================================\n");
            System.out.print("=            학생관리 프로그램 v 1.0                  =\n");
            System.out.print("==================================================\n");
            System.out.print("1. 학생등록 \n");
            System.out.print("2. 학생조회 \n");
            System.out.print("3. 학생수정 \n");
            System.out.print("4. 학생삭제 \n");
            System.out.print("0. 종료 \n");
            System.out.print("명령어를 입력해 주세요. : ");


            command = Integer.parseInt(scanner.nextLine());

            switch(command) {
                case 1 :
                    systemRegistStudent();
                    break;
                case 2 :
                    systemSearchStudent();
                    break;
                case 3 :
                    systemModifyStudent();
                    break;
                case 4 :
                    systemDeleteStudent();
                    break;
                case 0 :
                    System.out.print("정말 종료 하시겠습니까? (Y/N) : ");
                    strCommand = scanner.nextLine();
                    if(strCommand.equals("Y")) {
                        command = -1;
                    }
                    break;
                default :
                    System.out.println("[" + command + "]는 잘못된 명령어 입니다.");
            }

        } while( command >= 0 );

        this.systemClose();
        System.out.println("프로그램 종료.");

    }

    private void systemSearchStudent() throws Exception{
        System.out.print("조회하실 학생이름을 입력해 주세요 (미입력시 전체조회) : ");

        //Scanner scanner = new Scanner(System.in);
        String searchTxt = scanner.nextLine();
        List<Student> list = null;

        if(searchTxt.trim().equals("")) {
            list = service.searchStudents(null);
        } else {
            Student student = new Student();
            student.setName(searchTxt);
            list = service.searchStudents(student);
        }

        printListTitle();
        printListStudent(list);

    }

    private void systemRegistStudent() throws Exception {

        String name, grade;
        int score = 0;

        //Scanner scanner = new Scanner(System.in);
        System.out.print("학생이름 : ");
        name = scanner.nextLine();
        System.out.print("학년 : ");
        grade = scanner.nextLine();
        System.out.print("점수 : ");
        score = Integer.parseInt(scanner.nextLine());

        Student std = service.registerStudent(new Student(name, grade, score));

        System.out.println("등록완료");
        printListTitle();
        printListStudent(List.of(std));

    }

    private void systemModifyStudent() throws Exception {

        System.out.print("수정하실 학생번호를 입력해 주세요 : ");
        int stdNo = Integer.parseInt(scanner.nextLine());

        Student student = new Student();
        student.setStdNo(stdNo);

        List<Student> students = service.searchStudents(student);

        if(students != null && students.size() > 0) {

            printListTitle();
            printListStudent(students);

            System.out.print("위 학생을 수정하시겠습니까? (Y/N) : ");
            String command = scanner.nextLine();

            if(command.trim().equals("Y")) {
                String name, grade;
                int score;

                System.out.print("학생이름 : ");
                name = scanner.nextLine();
                System.out.print("학년 : ");
                grade = scanner.nextLine();
                System.out.print("점수 : ");
                score = Integer.parseInt(scanner.nextLine());

                student.setName(name);
                student.setGrade(grade);
                student.setScore(score);

                service.modifyStudent(student);
                System.out.println("학생정보를 수정하였습니다.");

                printListTitle();
                printListStudent(student);

            } else {
                System.out.print("수정이 취소되었습니다.\n");
            }
        } else {
            System.out.println("학생번호가 " + stdNo + "인 학생은 존재하지 않습니다.");
        }

    }

    private void systemDeleteStudent() throws Exception {

        //Scanner scanner = new Scanner(System.in);

        System.out.print("삭제하실 학생번호를 입력해 주세요 : ");
        int stdNo = Integer.parseInt(scanner.nextLine());

        Student student = new Student();
        student.setStdNo(stdNo);

        List<Student> students = service.searchStudents(student);


        if(students != null && students.size() > 0) {

            printListTitle();
            printListStudent(students);

            System.out.print("위 학생을 삭제하시겠습니까? (Y/N) : ");
            String command = scanner.nextLine();

            if(command.trim().equals("Y")) {
                service.deleteStudent(stdNo);
                System.out.println("학생을 삭제하였습니다.");
            } else {
                System.out.println("삭제가 취소되었습니다.");
            }
        } else {
            System.out.println("학생번호가 " + stdNo + "인 학생은 존재하지 않습니다.");
        }

    }

    //-- 자원반납
    public void systemClose() throws Exception {
        scanner.close();
        service.closeService();
    }




    //---------------------------------
    //-- 데이터 출력단
    //---------------------------------
    private void printListTitle() {
        System.out.println("\n----------------------------------------------------------");
        System.out.println("학생코드 | 이름 | 학년 | 점수 |    등록일    |    수정일   ");
        System.out.println("----------------------------------------------------------");
    }

    private void printListStudent(List<Student> studentList) {
        String format = "%d   %s   %s학년    %s         %s        %s ";
        for(Student student : studentList) {
            String list = String.format(format,
                    student.getStdNo(),
                    student.getName(),
                    student.getGrade(),
                    student.getScore(),
                    student.getInsertDt(),
                    student.getUpdateDt()
            );
            System.out.println(list);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println(studentList.size() + "명이 조회되었습니다.\n");
    }

    //-- 오버로딩된 printListStudent(List<Student>) 메서드를 활용
    private void printListStudent(Student student) {
        this.printListStudent(List.of(student));
    }



}
