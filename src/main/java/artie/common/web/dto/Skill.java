package artie.common.web.dto;

public class Skill {
    private String name;
    private double score;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * Default constructor
     */
    public Skill(){}

    /**
     * Parameterized constructor
     * @param name
     * @param score
     */
    public Skill(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
