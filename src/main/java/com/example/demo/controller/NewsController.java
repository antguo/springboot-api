package com.example.demo.controller;

import com.example.demo.common.support.config.UrlConfig;
import com.example.demo.model.News;
import com.example.demo.service.AllInOneService;
import com.example.demo.utils.NEXTJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "新闻")
@RequestMapping(path = UrlConfig.RESTFUL)
public class NewsController {
    @Autowired
    private AllInOneService allInOneService;
    @ApiOperation(value = "根据类型获取新闻")
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public NEXTJSONResult news(String typeId){
        List<News> newsList = allInOneService.queryAllNewsByTypeId(typeId);
        return NEXTJSONResult.ok(newsList);
    }

    @ApiOperation(value = "获取新闻详情")
    @RequestMapping(value = "/detail/{newsId}", method = RequestMethod.GET)
    public NEXTJSONResult detail(@PathVariable String newsId) {
        News news = allInOneService.queryNewsDetail(newsId);
        return NEXTJSONResult.ok(news);
    }
}
