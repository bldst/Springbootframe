package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
public class MySqlGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://175.178.192.115/springboot?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "springboot", "cwlsld")
                //全局配置
                .globalConfig(builder -> {
                    builder.author("caowenlong") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\admin\\IdeaProjects\\Springframework\\src\\main\\java"); // 指定输出目录
                })
                //包配置
                .packageConfig(builder -> {
                    builder.parent("com.example.demo") // 设置父包名
                            .moduleName("domain") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "C:\\Users\\admin\\IdeaProjects\\Springframework\\src\\main\\java\\mapper")); // 设置mapperXml生成路径
                })
                //策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("specifications", "sensitive_types", "sensitive_levels", "sensitive_elements", "sensitive_elements_rules", "detection_strategies", "algorithm_models", "algorithm_labels", "strategys") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}

