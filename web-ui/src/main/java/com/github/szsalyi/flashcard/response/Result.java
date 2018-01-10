package com.github.szsalyi.flashcard.response;

import lombok.Data;

@Data
public class Result<T> {

    private T data;

}
