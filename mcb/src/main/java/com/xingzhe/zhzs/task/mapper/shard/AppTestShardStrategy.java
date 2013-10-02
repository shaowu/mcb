package com.xingzhe.zhzs.task.mapper.shard;

import com.google.code.shardbatis.strategy.ShardStrategy;

/**
 * 分表 
 * @author LuTang
 *
 */
public interface AppTestShardStrategy extends ShardStrategy {
	 /**
     * 得到实际表名
     * @param baseTableName 逻辑表名,一般是没有前缀或者是后缀的表名
     * @param params mybatis执行某个statement时使用的参数
     * @param mapperId mybatis配置的statement id
     * @return
     */
    String getTargetTableName(String baseTableName,Object params,String mapperId);
}
