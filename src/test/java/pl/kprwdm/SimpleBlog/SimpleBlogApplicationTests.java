package pl.kprwdm.SimpleBlog;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import pl.kprwdm.SimpleBlog.Controller.AdminController;


@SpringBootTest
class SimpleBlogApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private AdminController adminController;


	@Test
	void TestHtmlEncode() {
		Assert.assertTrue("a" == "a");



	}

}
