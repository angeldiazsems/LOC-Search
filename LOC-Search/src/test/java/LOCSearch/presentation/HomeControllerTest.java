package LOCSearch.presentation;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    HomeController homeController;
    @BeforeEach
    private void setup(){
        homeController = new HomeController();
    }
    @Test
    void whenHome_thenReturnRedirect() {
        //given
        String expected = "redirect:swagger-ui.html";
        //when
        String actual = homeController.home();
        //then
        assertEquals(expected, actual);
    }



}
