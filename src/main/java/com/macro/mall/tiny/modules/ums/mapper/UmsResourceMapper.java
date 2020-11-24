package com.macro.mall.tiny.modules.ums.mapper;

import com.macro.mall.tiny.modules.ums.model.UmsResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台资源表 Mapper 接口
 * </p>
 *
 * @author dongjb
 * @since 2020/11/21
 */
public interface UmsResourceMapper extends BaseMapper<UmsResource> {

    /**
     * 获取用户所有可访问资源
     * @param adminId 用户ID
     * @return 资源列表
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取资源
     * @param roleId 角色ID
     * @return 资源列表
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);

}
