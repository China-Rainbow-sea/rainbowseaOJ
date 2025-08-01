package com.rainbowsea.rainbowseaOJ.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 请求编辑题目
 *
 * @author
 * @from
 */
@Data
public class QuestionEditRequest implements Serializable {
    /**
     * 题目的 id
     */
    private Long id;


    /**
     * 标题
     */
    private String title;


    /**
     * 内容
     */
    private String content;


    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;


    /**
     * 题目答案
     */
    private String answer;


    /**
     * 判题用例（json 数组）
     */
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置（json 对象）
     */
    private JudgeConfig judgeConfig;


    private static final long serialVersionUID = 1L;
}