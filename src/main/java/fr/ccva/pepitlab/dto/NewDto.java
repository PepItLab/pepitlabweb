package fr.ccva.pepitlab.dto;

import fr.ccva.pepitlab.model.New;

public class NewDto {

    private String title;
    private String content;

    public NewDto(New n) {
        this.title = n.getTitle();
        this.content = n.getContent();
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
}
