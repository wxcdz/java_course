package cn.dz;


public class Return {

    // 无参数无返回值的方法(如果方法没有返回值，不能不写，必须写void，表示没有返回值)
    public void f1() {
        System.out.println("无参数无返回值的方法");
    }

    /**
     * 有参数无返回值的方法
     * 参数列表由零组到多组“参数类型+形参名”组合而成，多组参数之间以英文逗号（,）隔开，形参类型和形参名之间以英文空格隔开
     */
    public void f2(int a, String b, int c) {
        System.out.println(a + "-->" + b + "-->" + c);
    }

    // 有返回值无参数的方法（返回值可以是任意的类型,在函数里面必须有return关键字返回对应的类型）
    public int f3() {
        System.out.println("有返回值无参数的方法");
        return 2;
    }

    // 有返回值有参数的方法
    public int f4(int a, int b) {
        return a * b;
    }

    // return在无返回值方法的特殊使用
    public void f5(int a) {
        if (a > 10) {
            return;//表示结束所在方法 （f5方法）的执行,下方的输出语句不会执行
        }
        System.out.println(a);
    }

}
