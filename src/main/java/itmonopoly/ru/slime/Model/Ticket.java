package itmonopoly.ru.slime.Model;

public class Ticket {

    private String  textVievFirst;
    private String  textVievSecond;
    private String  calendar;
    private String  picturesName;
    private Boolean like;

    // Constructor that is used to create an instance of the Movie object
    public Ticket(String textVievFirst, String textVievSecond, String calendar, String picturesName, Boolean like) {
            this.textVievFirst = textVievFirst;
            this.textVievSecond = textVievSecond;
            this.calendar = calendar;
            this.picturesName = picturesName;
            this.like = like;
    }

    public String getTextVievFirst() {
            return textVievFirst;
    }

    public void setTextVievFirst(String textVievFirst) {
            this.textVievFirst = textVievFirst;
    }

    public String getTextVievSecond() {
            return textVievSecond;
    }

    public void setTextVievSecond(String textVievSecond) {
            this.textVievSecond = textVievSecond;
    }

    public String getСalendar() {
            return calendar;
    }

    public void setСalendar(String calendar) {
            this.calendar = calendar;
    }

    public String getPictureName() {
            return calendar;
    }

    public void setPictureName(String picturesName) {
            this.picturesName = picturesName;
    }

    public boolean getLike() {
            return like;
    }

    public void setLike(Boolean like) {
            this.like = like;
    }
}
