package com.leon.ssm.quartz;

/**
 * Quartz实例-task类
 * 
 * @ClassName: QuartzTask
 * @author: wangang
 * @date: Apr 6, 2019 9:10:34 PM
 */
public class QuartzTask {
	public void task() {
		System.out.println("QuartzTask.task定时任务启动...");
		System.out.println("QuartzTask.task定时任务完成...");
	}
}
