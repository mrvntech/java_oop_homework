package officer_management;

import java.util.Scanner;

public class Main {
    static enum ACTION {
        ADD_OFFICER,
        SEARCH_OFFICER,
        GET_ALL_OFFICER,
        EXIT;

        private int value;

        public static ACTION getAction(int input) {
            switch (input) {
                case 1 -> {
                    return ACTION.ADD_OFFICER;
                }
                case 2 -> {
                    return ACTION.SEARCH_OFFICER;
                }
                case 3 -> {
                    return ACTION.GET_ALL_OFFICER;
                }
                case 4 -> {
                    return ACTION.EXIT;
                }
                default -> {
                    return null;
                }
            }
        }
    }

    static enum JOB_TITLE {
        EMPLOYEE,
        WORKER,
        ENGINEER;

        private int value;

        public static JOB_TITLE getJobTitle(int input) {
            switch (input) {
                case 1 -> {
                    return EMPLOYEE;
                }
                case 2 -> {
                    return WORKER;
                }
                case 3 -> {
                    return ENGINEER;
                }
                default -> {
                    return null;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Officer Management Program");
        System.out.println("Enter 1 to add a officer");
        System.out.println("Enter 2 to search officer");
        System.out.println("Enter 3 to get all officer");
        System.out.println("Enter 4 to exit the program");
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            System.out.print("Enter your input: ");
            int input = 0;
            ACTION action;
            action = null;
            try {
                input = scanner.nextInt();
                if (input != 1 && input != 2 && input != 3 && input != 4)
                    throw new Exception("Please enter 1 or 2 or 3");
            } catch (Exception error) {
                System.out.println(error.toString());
            }

            scanner.nextLine();
            switch (ACTION.getAction(input)) {
                case ADD_OFFICER -> {
                    JOB_TITLE userJobTitle = null;
                    System.out.println("Please enter officer job title");
                    System.out.println("Enter 1 to add a worker, 2 to add a employee, 3 to add a engineer and 4 to come back");
                    input = scanner.nextInt();
                    scanner.nextLine();

                    switch (JOB_TITLE.getJobTitle(input)) {
                        case WORKER -> {
                            System.out.println("Please worker information");
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Sex: ");
                            String sex = scanner.nextLine();
                            System.out.print("Age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Rank: ");
                            int rank = scanner.nextInt();
                            scanner.nextLine();
                            Officer worker = new Worker(sex, name, age, rank);
                            OfficerManagement.addOfficer(worker);
                            System.out.println(worker.getOfficerInformation());
                        }
                        case EMPLOYEE -> {
                            System.out.println("Please employee information");
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Sex: ");
                            String sex = scanner.nextLine();
                            System.out.print("Age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Job: ");
                            String job = scanner.nextLine();
                            Employee employee = new Employee(sex, name, age, job);
                            OfficerManagement.addOfficer(employee);
                            System.out.println(employee.getOfficerInformation());
                        }
                        case ENGINEER -> {
                            System.out.println("Please engineer information");
                            System.out.print("Name: ");
                            String name = scanner.nextLine();
                            System.out.print("Sex: ");
                            String sex = scanner.nextLine();
                            System.out.print("Age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Specialization: ");
                            String specialization = scanner.nextLine();
                            Engineer engineer = new Engineer(sex, name, age, specialization);
                            OfficerManagement.addOfficer(engineer);
                            System.out.println(engineer.getOfficerInformation());
                        }
                        case null -> {
                            System.out.println("you are not enter input");
                        }
                    }
                }
                case SEARCH_OFFICER -> {
                    System.out.println("Please enter officer name to search.");
                    System.out.print("Name: ");
                    String name;
                    try {
                        name = scanner.nextLine();
                        System.out.println(name);
                    } catch (Exception error) {
                        System.out.println(error.toString());
                    }
                }
                case GET_ALL_OFFICER -> {
                    OfficerManagement.getOfficersInformation();
                }
                case EXIT -> {
                    isProgramRunning = false;
                    System.out.println("We will exit the program. Have a nice day.");
                }
                case null -> {
                    break;
                }
            }
        }
    }
}
