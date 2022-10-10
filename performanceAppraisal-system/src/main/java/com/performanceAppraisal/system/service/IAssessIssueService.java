package com.performanceAppraisal.system.service;

import java.util.List;
import com.performanceAppraisal.system.domain.AssessIssue;

/**
 * 考核发布Service接口
 * 
 * @author wind
 * @date 2022-04-17
 */
public interface IAssessIssueService 
{
    /**
     * 查询考核发布
     * 
     * @param id 考核发布主键
     * @return 考核发布
     */
    public AssessIssue selectAssessIssueById(Long id);

    /**
     * 查询考核发布列表
     * 
     * @param assessIssue 考核发布
     * @return 考核发布集合
     */
    public List<AssessIssue> selectAssessIssueList(AssessIssue assessIssue);

    /**
     * 新增考核发布
     * 
     * @param assessIssue 考核发布
     * @return 结果
     */
    public int insertAssessIssue(AssessIssue assessIssue);

    /**
     * 修改考核发布
     * 
     * @param assessIssue 考核发布
     * @return 结果
     */
    public int updateAssessIssue(AssessIssue assessIssue);

    /**
     * 批量删除考核发布
     * 
     * @param ids 需要删除的考核发布主键集合
     * @return 结果
     */
    public int deleteAssessIssueByIds(Long[] ids);

    /**
     * 删除考核发布信息
     * 
     * @param id 考核发布主键
     * @return 结果
     */
    public int deleteAssessIssueById(Long id);

}
