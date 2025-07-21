package com.rainbowsea.rainbowseaOJ.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rainbowsea.rainbowseaOJ.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.rainbowsea.rainbowseaOJ.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.rainbowsea.rainbowseaOJ.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rainbowsea.rainbowseaOJ.model.entity.User;
import com.rainbowsea.rainbowseaOJ.model.vo.QuestionSubmitVO;

/**
* @author huo
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2025-07-21 12:25:19
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
