package com.rainbowsea.rainbowseaOJ.model.vo;

import cn.hutool.json.JSONUtil;
import com.rainbowsea.rainbowseaOJ.model.dto.question.JudgeConfig;
import com.rainbowsea.rainbowseaOJ.model.entity.Question;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 题目VO(脱敏)视图
 *
 * @author
 * @from
 */
@Data
public class QuestionVO implements Serializable {
    /**
     * id
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
     * 标签列表
     */
    private List<String> tags;

    /**
     * 题目提交数
     */
    private Integer submitNum;

    /**
     * 题目通过数
     */
    private Integer acceptedNum;

    /**
     * 判题配置（json 对象）
     */
    private JudgeConfig judgeConfig;

    /**
     * 点赞数
     */
    private Integer thumbNum;

    /**
     * 收藏数
     */
    private Integer favourNum;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建题目人的信息
     */
    private UserVO userVO;

    /**
     * 包装类转对象
     *
     * @param questionVO
     * @return
     */
    public static Question voToObj(QuestionVO questionVO) {
        if (questionVO == null) {
            return null;
        }
        Question question = new Question();
        BeanUtils.copyProperties(questionVO, question);
        // 这里标签questionVo当中的 tags是一个List<String> 类型用于前端展示，而后端存储的 Question对象
        // 当中的tags是一个 String类型 需要额外转换一下
        List<String> tagList = questionVO.getTags();
        if (tagList != null) {
            question.setTags(JSONUtil.toJsonStr(tagList));
        }
        // 同理这里标签questionVo当中的JudgeConfig 属性 是一个JudgeConfig 类型用于前端展示，
        // 而后端存储的 Question对象当中的 judgeConfig是 String类型需要额外转换一下
        JudgeConfig voJudgeConfig = questionVO.getJudgeConfig();
        if (voJudgeConfig != null) {
            question.setJudgeConfig(JSONUtil.toJsonStr(voJudgeConfig));
        }
        return question;
    }

    /**
     * 对象转包装类
     *
     * @param question
     * @return
     */
    public static QuestionVO objToVo(Question question) {
        if (question == null) {
            return null;
        }
        QuestionVO questionVO = new QuestionVO();
        BeanUtils.copyProperties(question, questionVO);
        //因为存于数据库当中的 Question 对象当中的 tags 是字符串，
        // 而展示给前端的 Question 当中的 tags 是一个List<String> JSON 对象，
        // 所以需要将字符串 转换为 JSON 对象，用于前端展示
        List<String> tagList = JSONUtil.toList(question.getTags(), String.class);

        questionVO.setTags(tagList);
        String judgeConfigStr = question.getJudgeConfig();
        // 同理
        questionVO.setJudgeConfig(JSONUtil.toBean(judgeConfigStr, JudgeConfig.class));
        return questionVO;
    }
}
