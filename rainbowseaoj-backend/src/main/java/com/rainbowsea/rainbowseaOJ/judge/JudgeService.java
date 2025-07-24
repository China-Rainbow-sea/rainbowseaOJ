package com.rainbowsea.rainbowseaOJ.judge;


import com.rainbowsea.rainbowseaOJ.model.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService {


    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
