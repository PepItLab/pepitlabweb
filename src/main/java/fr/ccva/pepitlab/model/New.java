package fr.ccva.pepitlab.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "new")
@NamedQueries({
        @NamedQuery(name = "new.listToDisplay", query = "SELECT n FROM New n WHERE n.startDate <= :startDate AND n.endDate >= :endDate")
})
public class New {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    //Date à partir de laquelle on affiche l'actualité
    @Column(name = "startDate", nullable = false)
    private Date startDate;

    @Column(name = "endDate", nullable = false)
    private Date endDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
