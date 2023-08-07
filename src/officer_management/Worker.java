package officer_management;

public class Worker extends Officer {
    private int rank;

    public Worker(String _sex, String _fullName, int _age, int _rank) {
        super(_sex, _fullName, _age);
        rank = _rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String getOfficerInformation() {
        return super.getOfficerInformation() + ", rank: " + rank;
    }
}
