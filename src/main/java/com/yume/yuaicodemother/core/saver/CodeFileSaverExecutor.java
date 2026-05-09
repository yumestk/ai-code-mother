package com.yume.yuaicodemother.core.saver;

import com.yume.yuaicodemother.ai.model.HtmlCodeResult;
import com.yume.yuaicodemother.ai.model.MultiFileCodeResult;
import com.yume.yuaicodemother.exception.BusinessException;
import com.yume.yuaicodemother.exception.ErrorCode;
import com.yume.yuaicodemother.model.enums.CodeGenTypeEnum;

import java.io.File;

public class CodeFileSaverExecutor {

    private static final HtmlCodeFileSaverTemplate htmlCodeFileSaverTemplate = new HtmlCodeFileSaverTemplate();

    private static final MultiFileCodeFileSaverTemplate multiFileCodeFileSaverTemplate = new MultiFileCodeFileSaverTemplate();

    public static File executeSaver(Object codeResult, CodeGenTypeEnum codeGenTypeEnum, Long appId) {
        return switch (codeGenTypeEnum) {
            case HTML -> htmlCodeFileSaverTemplate.saveCode((HtmlCodeResult) codeResult, appId);
            case MULTI_FILE -> multiFileCodeFileSaverTemplate.saveCode((MultiFileCodeResult) codeResult, appId);
            default -> throw new BusinessException(ErrorCode.SYSTEM_ERROR, "不支持的代码生成类型: " + codeGenTypeEnum);
        };
    }
}
