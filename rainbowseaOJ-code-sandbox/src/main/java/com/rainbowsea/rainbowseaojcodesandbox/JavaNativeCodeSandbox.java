package com.rainbowsea.rainbowseaojcodesandbox;


import com.rainbowsea.rainbowseaojcodesandbox.model.ExecuteCodeRequest;
import com.rainbowsea.rainbowseaojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
