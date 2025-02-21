public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move(); // Calls interface method implementation
        King k = new King();
        k.move(); // Calls interface method implementation
        Bishop b = new Bishop();
        b.move();   // Calls interface method implementation
        Knight kn = new Knight();
        kn.move(); // Calls interface method implementation
    }
}

//interface 
interface Chess {
    void move(); // Abstract method
}

class Queen implements Chess {
    public void move() {
        System.out.println("Queen can move any number of squares vertically, horizontally or diagonally");
    }
}

class King implements Chess {
    public void move() {
        System.out.println("King can move only one square in any direction");
    }
}

class Bishop implements Chess {
    public void move() {
        System.out.println("Bishop can move any number of squares diagonally");
    }
}

class Knight implements Chess {
    public void move() {
        System.out.println("Knight can move in L shape");
    }
}

