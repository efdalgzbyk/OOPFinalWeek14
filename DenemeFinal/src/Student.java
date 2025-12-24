public abstract class Student {

    private int id;
    private float mid;
    private float fin;

    Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    public abstract float computeTotalScore();

    public float computeBaseScore(){
        return (float) (mid*0.4 + fin*0.6);
    }

}
