package me.cjd.sqlbuilder.test;

import me.cjd.sqlbuilder.core.SqlBuilder;
import me.cjd.sqlbuilder.engine.SqlBeetlEngine;
import me.cjd.sqlbuilder.engine.SqlFreemarkerEngine;
import me.cjd.sqlbuilder.model.SqlBuilderPara;

public class Tester {
	
	public static void main(String[] args) {
		
		// 设置 全局模板引擎
		SqlBuilder.setEngine(new SqlBeetlEngine());
		
		// Beetl
		String sql1 = SqlBuilder.render("test.findSqlOfBeetl", new SqlBuilderPara("name", "颖"));
		
		System.out.println("Beetl渲染：" + sql1);
		
		// Freemarker
		// 设置 单独模板引擎
		String sql2 = SqlBuilder.render(new SqlFreemarkerEngine(), "test.findSqlOfFreemarker", new SqlBuilderPara("order", "DESC"));
		
		System.out.println("Freemarker渲染：" + sql2);
		
	}
	
}