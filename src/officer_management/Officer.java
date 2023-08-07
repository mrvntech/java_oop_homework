package officer_management;

abstract public class Officer {
    public Officer(String _sex, String _fullName, int _age) {
        sex = _sex;
        fullName = _fullName;
        age = _age;
    }

    protected String fullName;
    protected int age;
    protected String sex;

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSex() {
        return sex;
    }

    public String getOfficerInformation(){
        return "name: "+ fullName + ", age: " + age + ", sex: "+ sex;
    }

    public boolean equal(String fullName){
        return this.fullName.equals(fullName);
    }
}
