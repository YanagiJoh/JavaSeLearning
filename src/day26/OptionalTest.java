package day26;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test1() {

        Girl girl = new Girl();
        girl = null;
        Optional<Girl> optionalGirl = Optional.of(girl);
        System.out.println(optionalGirl);

    }

    @Test
    public void test2() {

        Girl girl = new Girl();
        girl = null;
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
        Girl girl1 = optionalGirl.orElse(new Girl("Alice"));
        System.out.println(girl1);

    }

    public String getGirlName(Boy boy) {
        if (boy != null) {
            Girl girl = boy.getGirl();
            if (girl != null) {
                return girl.getName();
            }
        }
        return null;
    }

    @Test
    public void test3() {

        Boy boy = new Boy();
        boy = null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);

    }

    public String getGirlName2(Boy boy) {

        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("July")));
        Girl girl = boy1.getGirl();
        Optional<Girl> girlOptional1 = Optional.ofNullable(girl);
        Girl girl1 = girlOptional1.orElse(new Girl("Anna"));
        return girl1.getName();

    }

    @Test
    public void test4() {

        Boy boy = null;
        //boy = new Boy();
        //boy = new Boy(new Girl("Julia"));
        String girlName = getGirlName2(boy);
        System.out.println(girlName);

    }

    @Test
    public void test5() {

        String str = "hello";
        str = null;
        Optional<String> op1 = Optional.of(str);
        String str1 = op1.get();
        System.out.println(str1);

    }

    @Test
    public void test6() {

        Optional<Object> op1 = Optional.empty();
        if (!op1.isPresent()) {
            System.out.println("データは空");
        }

        System.out.println(op1);
        System.out.println(op1.isPresent());
    }
}
