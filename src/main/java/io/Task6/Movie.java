package io.Task6;

import java.io.Serializable;

public class Movie implements Serializable {

    private long ID;
    private String title;
    private String type;
    private String director;
    private int yearOfIssue;

    public Movie(long ID, String title, String type, String director, int yearOfIssue) {
        this.ID = ID;
        this.title = title;
        this.type = type;
        this.director = director;
        this.yearOfIssue = yearOfIssue;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
