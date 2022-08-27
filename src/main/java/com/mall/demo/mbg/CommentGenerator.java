package com.mall.demo.mbg;

import com.github.pagehelper.util.StringUtil;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * 自定义注解生成器
 * @author: create by hongxin.xu
 * @date: 2022/8/8
 **/
public class CommentGenerator extends DefaultCommentGenerator {


    private boolean addRemarkComments = false;

    /**
     * 设置用户配置的参数
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }


    /**
     * 给字段添加注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        if(addRemarkComments&&StringUtility.stringHasValue(remarks)){
            addFieldJavaDoc(field,remarks);
        }
    }

    private void addFieldJavaDoc(Field field,String remarks){
        field.addJavaDocLine("/**");
        String[] remarkLines = remarks.split(System.getProperty("line.separator"));
        for(String remarkLine:remarkLines){
            field.addJavaDocLine("* "+remarkLine);
        }
        addJavadocTag(field,false);
        field.addJavaDocLine("*/");
    }

}
