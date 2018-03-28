package com.rain.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 这里可以使用basePackages替换value
 *  basePackages采用字符串的形式设置基础包，缺点在于置换包名时
 *  原来的配置会失效
 * @author rain
 * created on 2018/3/28
 */
@Component
public class CdPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CdPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        this.compactDisc.play();
    }
}