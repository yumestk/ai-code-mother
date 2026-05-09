package com.yume.yuaicodemother.ai.model;


import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

/**
 * 多文件代码的结果
 */
@Description("生成多个代码文件的结果")
@Data
public class MultiFileCodeResult {

    /**
     * html 代码
     */
    @Description("html 代码")
    private String htmlCode;

    /**
     * css 代码
     */
    @Description("css 代码")
    private String cssCode;

    /**
     * JavaScript 代码
     */
    @Description("JavaScript 代码")
    private String jsCode;

    /**
     * 描述
     */
    @Description("生成代码的描述")
    private String description;
}
