package company;

public class ObjectSample {
    
    public static void main(String[] args) {
        //インスタンスの作成
        var salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);
 
        
        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        //一行開ける
        System.out.println("");
        
        //インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員",88,"Java");
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        //インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if(projectManager instanceof Engineer) {
            //deveLopSoftwareメソッドを呼び出す
            ((Engineer)projectManager).developSoftware();
        }
        
        //一行開ける
        System.out.println("");
        
        //アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
       ((Workable)sales).work();
       ((Workable)engineer).work();
       ((Workable)projectManager).work();
       ((Workable)parttimeWorker).work();
       
      //キャストがないとどう動くかの確認
       sales.work();
       engineer.work();
       projectManager.work();
       parttimeWorker.work();
        
    }

}
