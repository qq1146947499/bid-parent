/*
package com.bid.springcloud.service;*/
/*
@author zhoucong
@date ${date}-${time}

*//*


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.springframework.cloud.netflix.feign.FeignClient;

//@FeignClient(value = "MICROSERVICECLOUD-PTUSER",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface PtRoleClientService {

    */
/**
     * 查询所有角色
     * @param page
     * @param rows
     * @return
     *//*

    EasyUIDataGrid queryAll(int page, int rows);

    */
/**
     * 查询单个角色
     * @param ptRole
     * @return
     *//*

    ResponseBase queryRole(PtRole ptRole);


    */
/**
     * 更新角色
     * @param ptRole
     * @return
     *//*

    ResponseBase updatePtRole(PtRole ptRole);

    */
/**
     * 插入角色
     * @param ptRole
     * @return
     *//*

    ResponseBase insertRolePermission(PtRole ptRole);
}
*/
