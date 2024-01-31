package org.example.bucketworld;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.tools.FileTransTool;
import org.example.tools.MyException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.util.Arrays;

@SpringBootTest
@ImportResource("classpath:log4j2.properties")
class BucketWorldApplicationTests {
    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);
    @Test
    void contextLoads() throws Exception {
        //文件分块测试块
//        String fileAPath = "C:\\05program\\bucketWorld\\files\\input\\a.txt";
//        String fileBPath = "C:\\05program\\bucketWorld\\files\\input\\b.txt";
//        String fileOutPut = "C:\\05program\\bucketWorld\\files\\output";
//        String fileCPath = "C:\\05program\\bucketWorld\\files\\input\\1.mp4";
//        String fileDPath = "C:\\05program\\bucketWorld\\files\\input\\2.mp4";
//        FileTransTool fileTransTool = new FileTransTool();
//        fileTransTool.mergeFiles(fileCPath,fileDPath,fileOutPut,1024 * 1024 * 50);
        LOGGER.trace("trace level");
        LOGGER.debug("debug level");
        LOGGER.info("info level");
        LOGGER.warn("warn level");
        LOGGER.error("error level");
        LOGGER.fatal("fatal level");


    }

}
