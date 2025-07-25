package com.rainbowsea.rainbowseaOJ.model.dto.question;

import com.rainbowsea.rainbowseaOJ.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题目请求
 *
 * @author
 * @from
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {
    /**
     * 题目id
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
     * 该用户 id
     */
    private Long userId;


    private static final long serialVersionUID = 1L;
}