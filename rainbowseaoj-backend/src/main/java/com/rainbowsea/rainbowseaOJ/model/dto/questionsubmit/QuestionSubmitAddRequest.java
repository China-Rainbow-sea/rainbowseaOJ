package com.rainbowsea.rainbowseaOJ.model.dto.questionsubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * 提交做题内容请求
 *
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;
}