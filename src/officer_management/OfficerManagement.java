package officer_management;

import java.util.Vector;

public class OfficerManagement {
    private static final Vector<Officer> officers = new Vector<Officer>();

    public static void addOfficer(Officer _officer) {
        officers.add(_officer);
    }

    public static Vector<Officer> searchByFullName(String searchName) {
        Vector<Officer> searchOfficers = new Vector<>();
        for (Officer officer : officers) {
            if (officer.fullName.equals(searchName)) searchOfficers.add(officer);
        }
        return searchOfficers;
    }

    public static Vector<Officer> getOfficers() {
        return officers;
    }

    public static void getOfficersInformation() {
        if (officers.size() == 0) {
            System.out.println("There is no officer in you Office");
        } else {
            System.out.println("List of officer: ");
            for (Officer officer : officers) {
                System.out.println(officer.getOfficerInformation());
            }
        }
    }

}
