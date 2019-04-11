package com.luckyframe.project.testexecution.taskCaseLog.mapper;

import java.util.List;

import com.luckyframe.project.testexecution.taskCaseLog.domain.TaskCaseLog;	

/**
 * 用例日志明细 数据层
 * 
 * @author luckyframe
 * @date 2019-04-08
 */
public interface TaskCaseLogMapper 
{
	/**
     * 查询用例日志明细信息
     * 
     * @param logId 用例日志明细ID
     * @return 用例日志明细信息
     */
	public TaskCaseLog selectTaskCaseLogById(Integer logId);
	
	/**
     * 查询用例日志明细列表
     * 
     * @param taskCaseLog 用例日志明细信息
     * @return 用例日志明细集合
     */
	public List<TaskCaseLog> selectTaskCaseLogList(TaskCaseLog taskCaseLog);
	
	/**
     * 新增用例日志明细
     * 
     * @param taskCaseLog 用例日志明细信息
     * @return 结果
     */
	public int insertTaskCaseLog(TaskCaseLog taskCaseLog);
	
	/**
     * 修改用例日志明细
     * 
     * @param taskCaseLog 用例日志明细信息
     * @return 结果
     */
	public int updateTaskCaseLog(TaskCaseLog taskCaseLog);
	
	/**
     * 删除用例日志明细
     * 
     * @param logId 用例日志明细ID
     * @return 结果
     */
	public int deleteTaskCaseLogById(Integer logId);
	
	/**
     * 批量删除用例日志明细
     * 
     * @param logIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTaskCaseLogByIds(String[] logIds);
	
}