package com.rainbowsea.rainbowseaojcodesandbox;


import com.rainbowsea.rainbowseaojcodesandbox.model.ExecuteCodeRequest;
import com.rainbowsea.rainbowseaojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
