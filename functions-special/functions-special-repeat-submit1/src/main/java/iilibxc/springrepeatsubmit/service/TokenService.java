package iilibxc.springrepeatsubmit.service;

import iilibxc.springrepeatsubmit.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;

public interface TokenService {

    ServerResponse createToken();

    void checkToken(HttpServletRequest request);

}
