package com.macro.mall.tiny.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.macro.mall.tiny.modules.ums.dto.UmsAdminParam;
import com.macro.mall.tiny.modules.ums.dto.UpdateAdminPasswordParam;
import com.macro.mall.tiny.modules.ums.model.UmsAdmin;
import com.macro.mall.tiny.modules.ums.model.UmsResource;
import com.macro.mall.tiny.modules.ums.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台管理员管理Service
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface UmsAdminService extends IService<UmsAdmin> {
    /**
     * 根据用户名获取后台管理员
     * @param username 用户名称
     * @return 管理员对象
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param umsAdminParam  用户登录参数对象
     * @return 管理员对象
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     * @return 新的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户名或昵称分页查询用户
     * @param keyword 查询字符串
     * @param pageSize 每页条数
     * @param pageNum 页码
     * @return 管理员对象列表
     */
    Page<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     * @param id id
     * @param admin 管理员对象
     * @return 是否成功
     */
    boolean update(Long id, UmsAdmin admin);

    /**
     * 删除指定用户
     * @param id 管理员id
     * @return 是否成功
     */
    boolean delete(Long id);

    /**
     * 修改用户角色关系
     * @param adminId 管理员id
     * @param roleIds 角色列表
     * @return 是否成功
     */
    @Transactional(rollbackFor = Exception.class)
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对于角色
     * @param adminId 管理员id
     * @return 角色列表
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 获取指定用户的可访问资源
     * @param adminId 管理员id
     * @return 可访问资源列表
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 修改密码
     * @param updatePasswordParam 修改用户名密码参数对象
     * @return 是否成功
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * 获取用户信息
     * @param username 用户名称
     * @return SpringSecurity需要的用户详情
     */
    UserDetails loadUserByUsername(String username);
}
