// Chapter 1 exercise - Mixed Messages
// Work out and test your own solution here.
class MixedMessages {
    public static void main(String [] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            
                if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                x = x - 1;
                }
                }
                y = y + 2;
            System.out.print(x + "" + y +" ");
            x = x + 1;
        }
    }
}

// y = x - y;       =      00 11 21 32 42

// y = y + x;       =      00 11 23 36 410

// y = y + 2;
// if( y > 4 ) {    =      02 14 25 36 47
// y = y - 1;
// }

// x = x + 1;
// y = y + x;       =      11 34 59

// if ( y < 5 ) {
// x = x + 1;
// if ( y < 3 ) {
// x = x - 1;
// }
// }
// y = y + 2;       =       02 14 36 48
