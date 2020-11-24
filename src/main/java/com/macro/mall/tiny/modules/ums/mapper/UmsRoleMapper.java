package com.macro.mall.tiny.modules.ums.mapper;

import com.macro.mall.tiny.modules.ums.model.UmsRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户角色表 Mapper 接口
 *
 * @author dongjb
 * @since 2020/11/19
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {

    /**
     * 获取用户所有角色
     * @param adminId 用户标识
     * @return 角色列表
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

}
