package com.imooc.order.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderForm2OrderDTO {

    public static OrderDTO convert(OrderForm orderForm){
        OrderDTO orderDTO= new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList =new ArrayList<>();
        try {
            Gson gson =new Gson();
            gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());

        }catch (Exception e){
            log.error("【json转换】错误,string={}",orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);
        return  orderDTO;
    }
}
