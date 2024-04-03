import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



public class Test_Add_Product_To_Cart  extends BaseTest{

@Test
@Order(1)
public void test_Click_createAccount_buton(){
    homePage.click_accountButon();
}
    @Test
    @Order(2)
    public void test_setNameSurname(){
        homePage.setNameSurname("arda demirkaya");
        Assertions.assertEquals("arda demirkaya",homePage.getName() , "name value is not correct!");
    }
    @Test
    @Order(3)
    public void test_email(){
    homePage.setEmail("ardademirkaya1911@gmail.com");
    Assertions.assertEquals("ardademirkaya1911@gmail.com",homePage.getMail(),"email is not correct");// önceden kayıtlı bir mail kullanılır.
    }
    @Test
    @Order(4)
    public void test_password(){
        homePage.setPassword("password");
        Assertions.assertEquals("password", homePage.getPassword(),"password is not correct!");
    }
    @Test
    @Order(5)
    public void test_verifyPassword(){
        homePage.setVerifyPassword("password");
        Assertions.assertEquals("password",homePage.getverifyPassword(),"verify password is not correct");
    }
    @Test
    @Order(6)
    public void test_createAcount(){
        homePage.CreateButton();
        Assertions.assertTrue(homePage.getErrorMessage() ,
                "Hata mesajı görüntülenemedi !");
    }


}
