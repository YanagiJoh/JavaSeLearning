package day25;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {

    @Test
    public void test1() {

        Class clazz = Person1.class;

        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println();

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    @Test
    public void test2() {

        Class clazz = Person1.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            Annotation[] annos = m.getAnnotations();
            for (Annotation a : annos) {
                System.out.print(a + "\t");
            }

            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            System.out.print(m.getReturnType().getName() + "\t");

            System.out.print(m.getName() + "(");

            Class[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                    } else {
                        System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                    }
                }
            }
            System.out.print(")");

            Class[] exceptionTypes = m.getExceptionTypes();
//            if (!(exceptionTypes == null && exceptionTypes.length == 0)) {
//                System.out.print("throws ");
//                for (int i = 0; i < exceptionTypes.length; i++) {
//                    if (i == exceptionTypes.length - 1) {
//                        System.out.print(exceptionTypes[i].getName());
//                    } else {
//                        System.out.print(exceptionTypes[i].getName() + ",");
//                    }
//                }
//            }

            if (exceptionTypes.length > 0) {
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                    } else {
                        System.out.print(exceptionTypes[i].getName() + ",");
                    }
                }
            }

            System.out.println();
        }

    }

}
