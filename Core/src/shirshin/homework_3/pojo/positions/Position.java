package shirshin.homework_3.pojo.positions;

/*
 * Описание должности работника
 */
public abstract class Position {

    private String title;

    public Position(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                '}';
    }
}
