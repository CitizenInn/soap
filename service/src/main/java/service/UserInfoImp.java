package service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://www.example.org/contract/UserInfo", 
            portName="UserInfoPort",
            serviceName="UserInfoService", 
            endpointInterface="service.UserInfo")
public class UserInfoImp implements UserInfo {

    public String checkAvailability() {
        return "service is up";
    }
}


