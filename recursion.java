public class Recursion {
    

    public String displayString(String str, int n) {
        if (str == null || n <= 0)
            return "";
        else {
            n--;
            return str + displayString(str, n);
        }
    }

    public String getMultiChar(char ch, int n) {

        if (n == 0)
            return ch + "";
        return ch + getMultiChar(ch, n - 1);
    }

    public long getPowerOfTen(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 10 * getPowerOfTen(n - 1);
        }
    }

    public int factorial(int n) {
        {
            if (n == 1)
                return 1;
            return n * factorial(n - 1);
        }
    }

    public int numberOfGloves(int peopleOfPlanetU101InARoom) {
        int gloves;

        gloves = peopleOfPlanetU101InARoom * 3;

        return gloves;

    }

    public long getPowerOfTenLoop(int n) {
        long power = 1;
        for (int i = 0; i < n; i++) {

            power = power * 10;

        }
        return power;
    }


    public int getNumberOfZerosLoop(int n) {
        String str = Integer.toString(n);
        char[] numArray = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == '0') {
                counter++;
            }
        }
        return counter;
    }

    public int getNumberOfZerosRecursion(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 10) {
            return 0;
        } else {
            int count = getNumberOfZerosRecursion(n / 10);
            if (n % 10 == 0)
                ++count;
            return count;
        }
    }
}





