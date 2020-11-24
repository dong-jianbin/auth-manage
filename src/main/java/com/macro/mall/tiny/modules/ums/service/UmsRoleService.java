package com.macro.mall.tiny.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.model.UmsMenu;
import com.macro.mall.tiny.modules.ums.model.UmsResource;
import com.macro.mall.tiny.modules.ums.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface UmsRoleService extends IService<UmsRole> {
    /**
     * 添加角色
     * @param role 角色对象
     * @return 是否成功
     */
    boolean create(UmsRole role);

    /**
     * 批量删除角色
     * @param ids 角色标识列表
     * @return 是否成功
     */
    boolean delete(List<Long> ids);

    /**
     * 分页获取角色列表
     * @param keyword 查询关键之
     * @param pageSize 页条数
     * @param pageNum 页码
     * @return 角色页对象
     */
    Page<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根据管理员ID获取对应菜单
     * @param adminId 用户标识
     * @return 菜单列表
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 获取角色相关菜单
     * @param roleId 角色标识
     * @return 菜单列表
     */
    List<UmsMenu> listMenu(Long roleId);

    /**
     * 获取角色相关资源
     * @param roleId 角色标识
     * @return 资源列表
     */
    List<UmsResource> listResource(Long roleId);

    /**
     * 给角色分配菜单
     * @param roleId 角色标识
     * @param menuIds 菜单列表
     * @return 是否成功
     */
    @Transactional(rollbackFor = Exception.class)
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * 给角色分配资源
     * @param roleId 角色标识
     * @param resourceIds 资源列表
     * @return 是否成功
     */
    @Transactional(rollbackFor = Exception.class)
    int allocResource(Long roleId, List<Long> resourceIds);
}
