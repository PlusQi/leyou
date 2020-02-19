package com.leyou.item.api;


import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.*;


@RequestMapping("brand")
public interface BrandApi {

    /**
     * 根据多个id查询分类名称
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id")Long id);

}
