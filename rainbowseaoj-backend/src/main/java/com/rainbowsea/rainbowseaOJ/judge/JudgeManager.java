package com.rainbowsea.rainbowseaOJ.judge;

import com.rainbowsea.rainbowseaOJ.judge.strategy.DefaultJudgeStrategy;
import com.rainbowsea.rainbowseaOJ.judge.strategy.JavaLanguageJudgeStrategy;
import com.rainbowsea.rainbowseaOJ.judge.strategy.JudgeContext;
import com.rainbowsea.rainbowseaOJ.judge.strategy.JudgeStrategy;
import com.rainbowsea.rainbowseaOJ.model.dto.questionsubmit.JudgeInfo;
import com.rainbowsea.rainbowseaOJ.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
