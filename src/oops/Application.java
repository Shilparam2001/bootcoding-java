package oops;

public class Application {

    public static void main(String[] args) {
        //Creating object: ClassName ObjectName = new ClassName();
//      Marker marker = new Marker();
//
//        //Access members of an object
//
//        //objectName.memberName -- data members
//        marker.brand = "Camlin";
//        marker.type = "WhiteBoard";
//        marker.color = "BLUE";
//        marker.price = 142.34;
//
//        //objectName.memberMethod()
//        marker.refill();
//        marker.write ("I am learning OOPs in Java");
//        marker.print()
//       College college = new College();
//        college.name = "KDK college of engg";
//        college.department = "CSE";
//        college.fees = 56000;
//        college.college();
//        college.print();
//
//        Chess chess= new Chess();
//        chess.players = 2;
//        chess.color = "Black";
//        chess.color = "white";
//        chess.startGame();
//        chess.endGame();
//        chess.print();
//        chess.display ("No one wins!!");
//
//        Cricket cricket = new Cricket();
//           cricket.player = 12;
//          cricket.Scores1 = 56;
//          cricket.Scores2 = 32;
//             cricket.myTeam();
//            cricket.oppositeTeam();
//           cricket.print();

        ComputerTable ct = new ComputerTable();
        ct.legs = 2;
        ct.tableTop = true;
        ct.material = new Material();
        ct.tableType = "Computer";
        ct.createTable();
        ct.move();

        StudyTable st = new StudyTable();
        st.legs = 4;
        st.tableTop = true;
        st.material = new Material();
        st.tableType = "Study";
        st.createTable();
        st.move();

    }
}
