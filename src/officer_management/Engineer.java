package officer_management;

public class Engineer extends Officer {
    private String specialization;

    public Engineer(String _sex, String _fullName, int _age, String _specialization) {
        super(_sex, _fullName, _age);
        specialization = _specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getOfficerInformation() {
        return super.getOfficerInformation() + ", specialization: " + specialization;
    }
}
