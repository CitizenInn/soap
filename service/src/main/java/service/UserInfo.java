package service;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface UserInfo {
   public String checkAvailability();
}
