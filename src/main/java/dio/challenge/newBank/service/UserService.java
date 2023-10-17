package dio.challenge.newBank.service;

import dio.challenge.newBank.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user) throws Exception;
}
