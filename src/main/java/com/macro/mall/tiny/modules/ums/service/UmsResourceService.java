package com.macro.mall.tiny.modules.ums.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.model.UmsResource;

/**
 * 后台资源管理Service
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface UmsResourceService extends IService<UmsResource> {
    /**
     * 添加资源
     * @param umsResource 资源对象
     * @return 是否成功
     */
    boolean create(UmsResource umsResource);

    /**
     * 修改资源
     * @param id 资源ID
     * @param umsResource 资源对象
     * @return 是否成功
     */
    boolean update(Long id, UmsResource umsResource);

    /**
     * 删除资源
     * @param id 资源ID
     * @return 是否成功
     */
    boolean delete(Long id);

    /**
     * 分页查询资源
     * @param categoryId 资源类型标识
     * @param nameKeyword 资源名称关键字
     * @param urlKeyword URL关键字
     * @param pageSize 页条数
     * @param pageNum 页码
     * @return 资源页
     */
    Page<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);
}
