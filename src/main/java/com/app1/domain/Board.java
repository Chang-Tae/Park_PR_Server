package com.app1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    private int bno;
    private String title;
    private String content;
    private String resdate;
    private int visited;
}