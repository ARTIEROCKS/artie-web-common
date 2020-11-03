package artie.common.web.dto;

public class Solution {

    private String id;
    private String description;
    private String screenShot;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getScreenShot() {
        return screenShot;
    }
    public void setScreenShot(String screenShot) {
        this.screenShot = screenShot;
    }

    /**
     * Default constructor
     */
    public Solution(){}

    /**
     * Parameterized constructor
     * @param id
     * @param description
     * @param screenShot
     */
    public Solution(String id, String description, String screenShot) {
        this.id = id;
        this.description = description;
        this.screenShot = screenShot;
    }
}
