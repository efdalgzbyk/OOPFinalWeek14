public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{

    protected int numberOfArticles;

    PhDStudent(int id, float mid, float fin, int numberOfConf, int numberOfArticles) {
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float computeTotalScore(){
        return super.computeTotalScore() + this.articleScore();
    }

    @Override
    public float articleScore() {
        return numberOfArticles*8;
    }
}
