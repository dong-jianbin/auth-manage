package com.macro.mall.tiny.modules.ums.dto;

import com.macro.mall.tiny.modules.ums.model.UmsMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台菜单节点封装
 *
 * @author dongjb
 * @date 2020/11/21
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    private static final long serialVersionUID = 2354191138144599453L;

    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
