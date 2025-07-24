package com.rainbowsea.rainbowseaOJ.judge.codesandbox;

import com.rainbowsea.rainbowseaOJ.judge.codesandbox.model.ExecuteCodeRequest;
import com.rainbowsea.rainbowseaOJ.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;


/**
 * 代码沙箱代理类(做代码沙箱的增强)
 */
@Slf4j
public class CodeSandboxProxy implements CodeSandbox{


    private final CodeSandbox codeSandbox;

    public CodeSandboxProxy(CodeSandbox codeSandbox) {
        this.codeSandbox = codeSandbox;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息:  " + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱响应信息:  " + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
