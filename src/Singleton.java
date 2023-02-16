///**
// * Created 29/12/21 4:18 PM
// *
// * @author Rohit Rawani
// */
//public class Singleton {
//    public static Singleton instance;
//
//    private Singleton(){
//    }
//
//    public static Singleton getInstance(){
//        if(instance==null){
//                Synchronized(Singleton.class){
//                    if(instance==null){
//                        instance = new Singleton();
//                    }
//            }
//        }
//        return instance;
//    }
//}
//
//    Products (id, name)
//    Sales (id, date, product_id, qty, amt)
//    Expected output:
//        product_id, product_name, qty_sold, amt
//
//
//
//
//
//
//
//select p.id, p.name, sum(s.qty) as qty_sold, sum(s.amt) as amt from Products p left join Sales s on p.id=s.product_id group by s.product_id;
//
//
//
//
