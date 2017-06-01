package com.baidu.hugegraph.dist;

import com.baidu.hugegraph.HugeException;
import com.baidu.hugegraph.server.HugeServer;

/**
 * Created by liningrui on 2017/5/26.
 */
public class HugeGraphServer {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new HugeException("HugeGraphServer can only accept one "
                    + "configuration file.");
        }

        RegisterUtil.registerCore();
        RegisterUtil.registerBackends(args[0]);
        RegisterUtil.registerServer();

        // start Huge Server
        HugeServer.main(args);
    }
}