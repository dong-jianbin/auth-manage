package com.macro.mall.tiny.modules.ums.service;

import com.macro.mall.tiny.modules.ums.model.UmsAdmin;
import com.macro.mall.tiny.modules.ums.model.UmsResource;

import java.util.List;

/**
 * 后台用户缓存管理Service
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface UmsAdminCacheService {
    /**
     * 删除后台用户缓存
     * @param adminId 用户id
     */
    void delAdmin(Long adminId);

    /**
     * 删除后台用户资源列表缓存
     * @param adminId 用户id
     */
    void delResourceList(Long adminId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     * @param roleId 角色id
     */
    void delResourceListByRole(Long roleId);

    /**
     * 当角色相关资源信息改变时删除相关后台用户缓存
     * @param roleIds 角色id列表
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * 当资源信息改变时，删除资源项目后台用户缓存
     * @param resourceId 资源id
     */
    void delResourceListByResource(Long resourceId);

    /**
     * 获取缓存后台用户信息
     * @param username 用户名称
     * @return 用户对象
     */
    UmsAdmin getAdmin(String username);

    /**
     * 设置缓存后台用户信息
     * @param admin 用户对象
     */
    void setAdmin(UmsAdmin admin);

    /**
     * 获取缓存后台用户资源列表
     * @param adminId 用户id
     * @return 资源列表
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 设置后台后台用户资源列表
     * @param adminId 用户id
     * @param resourceList 资源列表
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
