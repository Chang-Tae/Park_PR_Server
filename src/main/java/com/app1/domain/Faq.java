package com.app1.domain;

import lombok.Data;

@Data
public class Faq {
    private int fno;
    private String question;
    private String answer;
    private int cnt;
}
