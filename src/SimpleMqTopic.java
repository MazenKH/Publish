
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.MQTopic;

import com.ibm.mq.*;            // Include the MQSeries classes for Java package
import com.ibm.mq.*;            // Include the WebSphere MQ classes for Java package 


import com.ibm.mq.MQException;
import com.ibm.mq.constants.CMQC;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import java.io.IOException;

public class SimpleMqTopic
{
	static String hostname = "192.168.0.30";
    static String channel  = "MY.ADMIN.SVRCON";
    static String qManager = "QM_FORMATION";
    static MQQueueManager qMgr;
    
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args){
        MQEnvironment.hostname = hostname;
        MQEnvironment.channel  = channel;
        MQEnvironment.port  = ****; 
        MQEnvironment.userID  = "****"; 
        MQEnvironment.password  = "****"; 
        MQEnvironment.properties.put(MQC.TRANSPORT_PROPERTY,MQC.TRANSPORT_MQSERIES);
        
        try {
			qMgr = new MQQueueManager(qManager);
			System.out.println("SUCCESS");
	        qMgr.disconnect(); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}