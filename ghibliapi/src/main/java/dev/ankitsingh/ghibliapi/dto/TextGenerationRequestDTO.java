package dev.ankitsingh.ghibliapi.dto;

import lombok.Data;

@Data
public class TextGenerationRequestDTO {

    private String prompt;
    private String style;

    public String getPrompt() {
        return prompt;
    }

    public String getStyle() {
        return style;
    }
}
