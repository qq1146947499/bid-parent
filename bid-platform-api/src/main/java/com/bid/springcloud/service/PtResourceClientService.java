/*
package com.bid.springcloud.service;*/
/*
@author zhoucong
@date ${date}-${time}

*//*



import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.springframework.cloud.netflix.feign.FeignClient;

//@FeignClient(value = "MICROSERVICECLOUD-PTUSER",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface PtResourceClientService {

    */
/**
     * 查询所有资源
     * @param page
     * @param rows
     * @return
     *//*

    EasyUIDataGrid queryAll(int page, int rows);

    */
/**
     * 查询权限
     * @param id
     * @return
     *//*

    ResponseBase queryByRoleID(Integer id);


    */
/**
     * 更新资源
     * @param ptResource
     * @return
     *//*

    ResponseBase updateResource(PtResource ptResource);

    */
/**
     * 删除资源
     * @param roleId
     * @return
     *//*

    ResponseBase deletePtResource(Integer roleId);
}
*/
