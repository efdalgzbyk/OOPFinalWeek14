public class BachelourStudent extends Student implements ProjectScoreBehaviour{

    BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projectScore() {
        return 20;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore();
    }
}
