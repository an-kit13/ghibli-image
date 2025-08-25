package dev.ankitsingh.ghibliapi.dto;

import java.util.List;

public class TextToImageRequestDTO {

    private List<TextPrompt> text_prompts;
    private double cfg_scale = 7;
    private int height = 512;
    private int width = 768;
    private int samples = 1;
    private int steps = 30;
    private String style_preset;

    //Inner class for text_prompts
    public static class TextPrompt {
        private String text;
        public TextPrompt(String text) {
            this.text = text;
        }
        public String getText() {
            return text;
        }
        public void setText() {
            this.text = text;
        }
    }

    //Constructor
    public TextToImageRequestDTO(String text, String style) {
        this.text_prompts = List.of((new TextPrompt(text)));
        this.style_preset = style;
    }

    //Getters for JSON Serialization
    public List<TextPrompt> getText_prompts() {
        return text_prompts;
    }

    public double getCfg_scale() {
        return cfg_scale;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSamples() {
        return samples;
    }

    public int getSteps() {
        return steps;
    }

    public String getStyle_preset() {
        return style_preset;
    }

}
