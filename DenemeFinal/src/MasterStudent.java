public class MasterStudent extends Student implements ConferenceScoreBehaviour{

    protected int numberOfConf;

    MasterStudent(int id, float mid, float fin,int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    @Override
    public float conferenceScore() {
        return numberOfConf*5;
    }

    @Override
    public float computeTotalScore() {
        return 0;
    }

}
