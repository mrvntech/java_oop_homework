package officer_management;

public class Employee extends Officer {
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public Employee(String _sex, String _fullName, int _age, String _job) {
        super(_sex, _fullName, _age);
        job = _job;
    }

    @Override
    public String getOfficerInformation() {
        return super.getOfficerInformation()+ ", job: " + job;
    }
}
