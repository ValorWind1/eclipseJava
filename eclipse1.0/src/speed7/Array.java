package speed7;

class Array {
    
	public static void main(String[] args) {
        String[] hellos = new String[3];
        hellos[0] = "hi";
        hellos[1] = "hello";
        hellos[2] = "hey";
        System.out.println(hellos[1]);
        try {
            System.out.println(hellos[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("out of bounds");
        }
        System.out.println("it goes beyond");
    }
}