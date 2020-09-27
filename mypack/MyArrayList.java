package mypack;


public class MyArrayList {
    private String[] myArray;
    private int size = 0;
    public void Insert(String x) {
        if (size == 0) {
            size++;
            myArray = new String[size];
            myArray[size - 1] = x;
        } else {
            size++;
            String[] newArray = new String[size];
            for (int i = 0; i < size - 1; i++) {
                newArray[i] = myArray[i];
            }
            newArray[size - 1] = x;
            myArray = newArray;
        }
    }
    public int getSize() {
        // updateSize();
        return myArray.length;
    }
    public String getData(int index) {
        return myArray[index];
    }
    public void changeData(int index, String data) {
        myArray[index] = data;
    }
    public void deleteData(int index) {
        size--;
        String[] newArray = new String[size];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newArray[i] = myArray[i];

            } else {
                newArray[i] = myArray[i + 1];
            }
        }
        myArray = newArray;
    }
    public void showArray() {
        String txt = "";
        if (size != 0) {
            for (int i = 0; i < size; i ++) {
                txt += myArray[i] + ", ";
            }
            txt = txt.substring(0, txt.length() - 2);
        }
        System.out.println("[" + txt + "]");
    }
    public void clear() {
        myArray = new String[0];
        size = 0;
    }
}