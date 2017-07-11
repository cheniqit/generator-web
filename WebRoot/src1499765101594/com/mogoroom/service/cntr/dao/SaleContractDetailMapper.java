package com.mogoroom.service.cntr.dao;

import com.mogoroom.service.cntr.dao.SaleContractDetail;
import com.mogoroom.service.cntr.dao.SaleContractDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleContractDetailMapper {
    long countByExample(SaleContractDetailExample example);

    int deleteByExample(SaleContractDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaleContractDetail record);

    int insertSelective(SaleContractDetail record);

    List<SaleContractDetail> selectByExample(SaleContractDetailExample example);

    SaleContractDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaleContractDetail record, @Param("example") SaleContractDetailExample example);

    int updateByExample(@Param("record") SaleContractDetail record, @Param("example") SaleContractDetailExample example);

    int updateByPrimaryKeySelective(SaleContractDetail record);

    int updateByPrimaryKey(SaleContractDetail record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table cntr_salecontract_detail
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<SaleContractDetail> list);
}