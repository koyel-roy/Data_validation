package demo.rest.datavalidation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import demo.rest.datavalidation.controller.UserController;
import demo.rest.datavalidation.models.User;

public interface UserRepository extends CrudRepository<User, Long> {


@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest{

    @MockBean
    private UserRepository userRepository;

    @Autowired
    UserController userController;

    @Autowired
    private MockMvc mockMvc;
}


    
}
    

