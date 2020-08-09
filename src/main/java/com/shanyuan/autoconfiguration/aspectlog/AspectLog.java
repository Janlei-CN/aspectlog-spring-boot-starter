package com.shanyuan.autoconfiguration.aspectlog;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * class_name: ScheduleManage
 * describe:   用于控制定时任务的开启与关闭
 * 对应切面
 * creat_user: wenl
 * creat_time:  2018/11/10 18:45
 **/

@Target(ElementType.METHOD)@ Retention(RetentionPolicy.RUNTIME)
public@ interface AspectLog {}