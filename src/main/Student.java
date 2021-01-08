public class Student {
    private String name;
//    private int roll;
    private int mathScore;
    private int englishScore;
    private int csScore;
    private final static int COURSE_LIST_SIZE = 3;


    public Student(String name) { 
        this.name = name;
    }

    public Student(String name, int mathScore, int englishScore, int csScore){
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.csScore = csScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getCsScore() {
        return csScore;
    }

    public void setCsScore(int csScore) {
        this.csScore = csScore;
    }

    public int getTotalScore() {
        return this.csScore + this.mathScore + this.englishScore;
    }

    public double getAvgScore(){
        double totalScore = getTotalScore();
        return totalScore/ COURSE_LIST_SIZE;
    }
    public int getTotalScore(int csScore, int mathScore, int englishScore) {
        return csScore + mathScore + englishScore;
    }
    public double getAvgScore(int csScore, int mathScore, int englishScore){
        double totalScore = csScore + mathScore + englishScore;
        return totalScore/ COURSE_LIST_SIZE;
    }
}
