package com.macro.mall.tiny.modules.ums.convert;

import com.macro.mall.tiny.modules.ums.dto.UmsAdminParam;
import com.macro.mall.tiny.modules.ums.model.UmsAdmin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author dongjb
 * @date 2020/11/19
 */
@Mapper
public interface AdminConvert {
    AdminConvert INSTANCE = Mappers.getMapper(AdminConvert.class);

    /**
     * 用户参数对象转换成用户对象
     * @param umsAdminParam 用户参数对象
     * @return 用户对象
     */
    UmsAdmin umsAdmin2UmsAdminParam(UmsAdminParam umsAdminParam);

}
