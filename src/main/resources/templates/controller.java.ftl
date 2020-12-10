package ${package.Controller};

<#--import com.baomidou.mybatisplus.extension.plugins.pagination.Page;-->
import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
<#--import ${svoPackage}.${entity}Svo;-->
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
* <p>
* ${table.comment!} 前端控制器
* </p>
*
* @author ${author}
* @since ${date}
*/

@Api(tags = "${table.name!}" , description = "${table.comment!}")
@AllArgsConstructor
@RestController
@RequestMapping("${table.name}")
<#if kotlin>
    class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
    <#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
public class ${table.controllerName} {
    </#if>
    <#assign serviceNameLow = table.serviceName?uncap_first>
    <#assign entityLow = entity?uncap_first>

    private final ${table.serviceName} ${serviceNameLow};

    @ApiOperation("获取列表")
    @GetMapping
    public List<${entity}> listAll() {
        return ${serviceNameLow}.list();
    }

    @ApiOperation("获取单个数据")
    @GetMapping("{id}")
    public ${entity} selectById(@PathVariable Integer id) {
        return ${serviceNameLow}.getById(id);
    }

    @ApiOperation("创建")
    @PostMapping
    public void insert(@RequestBody ${entity} ${entityLow}) {
        ${serviceNameLow}.save(${entityLow});
    }

    @ApiOperation("编辑")
    @PutMapping
    public void updateById(@RequestBody ${entity} ${entityLow}) {
        ${serviceNameLow}.updateById(${entityLow});
    }

    @ApiOperation("删除")
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        ${serviceNameLow}.removeById(id);
    }
}
</#if>
