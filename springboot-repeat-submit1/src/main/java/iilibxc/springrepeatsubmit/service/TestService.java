package iilibxc.springrepeatsubmit.service;

import iilibxc.springrepeatsubmit.common.ServerResponse;
import iilibxc.springrepeatsubmit.pojo.Mail;

public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

    ServerResponse send(Mail mail);
}
