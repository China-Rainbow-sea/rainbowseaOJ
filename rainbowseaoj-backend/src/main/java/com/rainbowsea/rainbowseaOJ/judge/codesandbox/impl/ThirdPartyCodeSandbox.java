package com.rainbowsea.rainbowseaOJ.judge.codesandbox.impl;

import com.rainbowsea.rainbowseaOJ.judge.codesandbox.CodeSandbox;
import com.rainbowsea.rainbowseaOJ.judge.codesandbox.model.ExecuteCodeRequest;
import com.rainbowsea.rainbowseaOJ.judge.codesandbox.model.ExecuteCodeResponse;


/**
 * 第三方代码沙箱(实际调用网上现成的代码沙箱)
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
