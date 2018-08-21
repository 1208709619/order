package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

import java.util.Map;

public class ResultVOUtil {

//    public static ResultVO<Map<String, String>> success(Object object){
//////        ResultVO resultVO =new ResultVO();
//////        resultVO.setCode(0);
//////        resultVO.setMessage("成功");
//////        resultVO.setData(object);
//////        return resultVO;
//////
//////    }

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return resultVO;
    }

}
