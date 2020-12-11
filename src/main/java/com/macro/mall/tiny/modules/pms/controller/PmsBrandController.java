package com.macro.mall.tiny.modules.pms.controller;

import com.macro.mall.tiny.modules.pms.model.PmsBrand;
import com.macro.mall.tiny.modules.pms.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
* <p>
* 品牌表 前端控制器
* </p>
*
* @author dongjb
* @since 2020-12-10
*/

@Api(tags = "pms_brand" , description = "品牌表")
@AllArgsConstructor
@RestController
@RequestMapping("pms_brand")
public class PmsBrandController {

    private final PmsBrandService pmsBrandService;

    @ApiOperation("获取列表")
    @GetMapping
    public List<PmsBrand> listAll() {
        return pmsBrandService.list();
    }

    @ApiOperation("获取单个数据")
    @GetMapping("{id}")
    public PmsBrand selectById(@PathVariable Integer id) {
        return pmsBrandService.getById(id);
    }

    @ApiOperation("创建")
    @PostMapping
    public void insert(@RequestBody PmsBrand pmsBrand) {
        pmsBrandService.save(pmsBrand);
    }

    @ApiOperation("编辑")
    @PutMapping
    public void updateById(@RequestBody PmsBrand pmsBrand) {
        pmsBrandService.updateById(pmsBrand);
    }

    @ApiOperation("删除")
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        pmsBrandService.removeById(id);
    }
}
