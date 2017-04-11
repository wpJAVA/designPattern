package com.wp.personal.SixCreatedPatterns.FactoryMethodPattern;

/**
 * Client
 *
 * @Desc 客户端——工厂方法模式
 * @Author Wang Peng
 * @Date 2017/4/11 10:17
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();//可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
