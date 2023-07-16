package day15;

public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            int result = ecm(i,j);
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("データ型が一致してない");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("コマンド引数がない");
        }catch(ArithmeticException e){
            System.out.println("0で割る");
        }catch(EcDef e){
            System.out.println(e.getMessage());
        }

    }

    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("分子や分母が負数になってる");
        }
        return i / j;
    }
}
