package main.java.edu.dtl.seer;

import com.amazonaws.Request;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.util.TimingInfo;

/**
 * Created by mh4047 on 3/29/17.
 */
public class LambdaHandler implements RequestHandler<Object,Object>{


    public Object handleRequest(Object input, Context context) {
        return "{'status':'done', 'inputObj':'"+input.toString()+"'}";
    }
}