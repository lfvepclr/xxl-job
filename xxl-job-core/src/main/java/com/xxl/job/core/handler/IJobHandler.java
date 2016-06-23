package com.xxl.job.core.handler;

import com.xxl.job.core.util.CallBack;

/**
 * remote job handler
 *
 * @author xuxueli 2015-12-19 19:06:38
 */
public abstract class IJobHandler {

    /**
     * job handler <br><br>
     * the return Object will be and stored
     *
     * @param params
     * @return
     * @throws Exception
     */
    public abstract CallBack execute(String... params) throws Exception;


}
