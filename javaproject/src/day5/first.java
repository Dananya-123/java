package day3;

public class first {
 
	    // Dimensions of the box
	    double width;
	    double height;
	    double depth;

	    // Parameterized constructor
	    first(double w, double h, double d) {
	        width = w;
	        height = h;
	        depth = d;
	    }

	    // Method to calculate volume
	    double getVolume() {
	        return width * height * depth;
	    }

	    public static void main(String[] args) {
	        // Create object of Box class with given dimensions
	        first myfirst = new first(5.0, 10, 3.0);

	        // Call getVolume and display result
	        double volume = myfirst.getVolume();
	        System.out.println("Volume of the box = " + volume);
	    }
	}
