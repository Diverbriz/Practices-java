package ru.mirea.ikbo1120.sheloumov;

import ru.mirea.ikbo1120.sheloumov.Classes.*;

import java.util.ArrayList;
import java.io.File;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer>();
        Integer[] numbers={123,412,111,2,0,3,5};
        ArrayToList.toList(numbers,lst);
        for (Integer i : lst)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] data = {"One","Two","Three","Four"};
        AnyTypeData<String> buffer = new AnyTypeData<String>(data);
        buffer.showArray();

        System.out.println(buffer.getElement(2));


        String path = "File.txt";
        File file = new File(path);
        File[] fileList = file.listFiles();
        for (int i=0; i<5 ; i++)
        {
            System.out.println(fileList[i]);
        }
        /*PhoneNums phoneNums = new PhoneNums();
        System.out.println(phoneNums.ConvertNum("+79175655655"));
        System.out.println(phoneNums.ConvertNum("+104289652211"));
        System.out.println(phoneNums.ConvertNum("89175655655"));*/
    }
}