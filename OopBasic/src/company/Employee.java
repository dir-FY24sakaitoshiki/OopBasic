package company;

public class Employee {
    //フィールド
    String name;
    String department;
    String position;
    int employeeId;
    
    //コンストラクター
    public Employee(String name,String department,String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    
    //報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職:" + position + "名前:" + name);
            
        }
    
    public void report() {
        report(1);
    }
    //.report()というメソッドは引数を指定することなく、１回目の報告メソッドを呼び出すことができる。このように、オーバーレイとはよく入力される引数を省略し、利便性を高めるためのメソッドの用い方である。
    }

