package com.macro.mall.tiny.modules.ums.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.dto.UmsMenuNode;
import com.macro.mall.tiny.modules.ums.model.UmsMenu;

import java.util.List;

/**
 * 后台菜单管理Service
 *
 * @author dongjb
 * @date 2020/11/21
 */
public interface UmsMenuService extends IService<UmsMenu> {
    /**
     * 创建后台菜单
     * @param umsMenu 菜单对象
     * @return 是否成功
     */
    boolean create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     * @param id 菜单ID
     * @param umsMenu 菜单对象
     * @return 是否成功
     */
    boolean update(Long id, UmsMenu umsMenu);

    /**
     * 分页查询后台菜单
     * @param parentId 父菜单标识
     * @param pageSize 页条数
     * @param pageNum 页码
     * @return 菜单列表
     */
    Page<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     * @return 子级菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     * @param id 菜单标识
     * @param hidden 显示状态
     * @return 是否成功
     */
    boolean updateHidden(Long id, Integer hidden);
}
