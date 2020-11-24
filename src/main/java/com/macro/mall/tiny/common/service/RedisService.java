package com.macro.mall.tiny.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * redis操作Service
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface RedisService {

    /**
     * 保存属性
     * @param key key
     * @param value value
     * @param time time
     */
    void set(String key, Object value, long time);

    /**
     * 保存属性
     * @param key key
     * @param value value
     */
    void set(String key, Object value);

    /**
     * 获取属性
     * @param key key
     * @return Object
     */
    Object get(String key);

    /**
     * 删除属性
     * @param key key
     */
    void del(String key);

    /**
     * 批量删除属性
     * @param keys key列表
     */
    void del(List<String> keys);

    /**
     * 设置过期时间
     * @param key key
     * @param time 持续时长
     * @return 是否成功
     */
    Boolean expire(String key, long time);

    /**
     * 获取过期时间
     * @param key key
     * @return 过期时间
     */
    Long getExpire(String key);

    /**
     * 判断是否有该属性
     * @param key key
     * @return 有无
     */
    Boolean hasKey(String key);

    /**
     * 按delta递增
     * @param key key
     * @param delta 递增步值
     * @return 成功失败
     */
    Long incr(String key, long delta);

    /**
     * 按delta递减
     * @param key key
     * @param delta 递减步值
     * @return 成功失败
     */
    Long decr(String key, long delta);

    /**
     * 获取Hash结构中的属性
     * @param key key
     * @param hashKey hashKey
     * @return 返回对象
     */
    Object hGet(String key, String hashKey);

    /**
     * 向Hash结构中放入一个属性
     * @param key key
     * @param hashKey hashKey
     * @param value 值
     * @param time 过期时间
     * @return 是否成功
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * 向Hash结构中放入一个属性
     * @param key key
     * @param hashKey hashKey
     * @param value 属性对象
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * 直接获取整个Hash结构
     * @param key key
     * @return map
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * 直接设置整个Hash结构
     * @param key key
     * @param map map
     * @param time 过期时间
     * @return 是否成功
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * 直接设置整个Hash结构
     * @param key key
     * @param map map
     */
    void hSetAll(String key, Map<String, ?> map);

    /**
     * 删除Hash结构中的属性
     * @param key key
     * @param hashKey 属性列表
     */
    void hDel(String key, Object... hashKey);

    /**
     * 判断Hash结构中是否有该属性
     * @param key key
     * @param hashKey hashKey
     * @return 是否存在
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * Hash结构中属性递增
     * @param key key
     * @param hashKey hashKey
     * @param delta 递增步值
     * @return 是否成功
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * Hash结构中属性递减
     * @param key key
     * @param hashKey hashKey
     * @param delta 递减步值
     * @return 是否成功
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * 获取Set结构
     * @param key key
     * @return set
     */
    Set<Object> sMembers(String key);

    /**
     * 向Set结构中添加属性
     * @param key key
     * @param values 对象列表
     * @return 是否成功
     */
    Long sAdd(String key, Object... values);

    /**
     * 向Set结构中添加属性
     * @param key key
     * @param time 过期时间
     * @param values 对象列表
     * @return 是否成功
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * 是否为Set中的属性
     * @param key key
     * @param value value
     * @return 是否成功
     */
    Boolean sIsMember(String key, Object value);

    /**
     * 获取Set结构的长度
     * @param key key
     * @return 长度
     */
    Long sSize(String key);

    /**
     * 删除Set结构中的属性
     * @param key key
     * @param values values
     * @return 是否成功
     */
    Long sRemove(String key, Object... values);

    /**
     * 获取List结构中的属性
     * @param key key
     * @param start 开始位置
     * @param end 结束位置
     * @return list
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * 获取List结构的长度
     * @param key key
     * @return 长度
     */
    Long lSize(String key);

    /**
     * 根据索引获取List中的属性
     * @param key key
     * @param index 位置
     * @return 对象
     */
    Object lIndex(String key, long index);

    /**
     * 向List结构中添加属性
     * @param key key
     * @param value value
     * @return 是否成功
     */
    Long lPush(String key, Object value);

    /**
     * 向List结构中添加属性
     * @param key key
     * @param value value
     * @param time 过期时间
     * @return 是否成功
     */
    Long lPush(String key, Object value, long time);

    /**
     * 向List结构中批量添加属性
     * @param key key
     * @param values 属性列表
     * @return 是否成功
     */
    Long lPushAll(String key, Object... values);

    /**
     * 向List结构中批量添加属性
     * @param key key
     * @param time 过期时间
     * @param values 对象列表
     * @return 是否成功
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * 从List结构中移除属性
     * @param key key
     * @param count 数量
     * @param value 属性
     * @return 是否成功
     */
    Long lRemove(String key, long count, Object value);
}