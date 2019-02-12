package com.iboruk.qalight;

import com.iboruk.qalight.currency.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.iboruk.qalight.currency.Bitcoin;
import com.sun.istack.internal.localization.NullLocalizable;
import org.apache.log4j.Logger;

public class MainClass {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MainClass");

//        LibCalc.elementsOfArray(array);
//        LibCalc.sumIntInt(5, 6);
//        LibCalc.sumStrStr("Hello ", "World!");
//        LibCalc.sumIntStr(5, "12");
//       System.out.println(LibCalc.sumIntStr(5, "Vasya"));  //9999
//        LibCalc.multiplicationIntInt(5, 2);
//        System.out.println(LibCalc.divisionIntInteger(10, null));
//        System.out.println(LibCalc.divisionIntInteger(10, 5));
//        LibCalc.divisionIntInteger(10, 5);
//        System.out.println(LibCalc.divisionDouble(10.8, 0.0));
//        System.out.println(LibCalc.division(-10.8, 0d));

//        int[][] myFirstMatrix = WorkWithArray.createMatrix(7, 5, 34);

        //int[][] mySecondMatrix= WorkWithArray.fillDiagonal(myFirstMatrix, 8);
//        int[][] myFirstMatrix = WorkWithArray.fillMatrix(34);
//        System.out.println(myFirstMatrix.toString());
//        System.out.println(Arrays.deepToString(myFirstMatrix));

//        try {
//            System.out.println(LibCalc.sum(5, 5)); // 99999
//        } catch(NumberFormatException e) {
//
//        } catch (NullPointerException e) {
//
//        }
//
//     ---------------------- Work With Array -------------------------


//        WorkWithArray.reversArray(new int[]{2, 3, 4, 5});
//        WorkWithArray.createMatrix(4,6,7);
//        WorkWithArray.printMatrix(WorkWithArray.createMatrix(4,6,7));
//        WorkWithArray.printMatrix(WorkWithArray.fillRightDiagonal(2,3,7, 9));
        WorkWithArray.printMatrix(WorkWithArray.fillLeftDiagonal(3,3,7, 5));




//      ---------------------- Work With List  -------------------------
//        List<List<String>> ourList = new ArrayList<>();
//        WorkWithList workWithList = new WorkWithList();
//
//        logger.info(ourList.size());
//
//        workWithList.addNewList(ourList);
//
//        ourList = workWithList.addValueToListList(0,"test01",ourList);
//        workWithList.addNewList(ourList);
//        ourList = workWithList.addValueToListList(1,"test11",ourList);
//        ourList = workWithList.addValueToListList(1,"test12",ourList);
//        ourList = workWithList.addValueToListList(0,"test02",ourList);
//
//        workWithList.addNewList(ourList);
//        workWithList.addValueToListList(2,"test21", ourList);
//        workWithList.addValueToListList(1,"test13", ourList);

//      ---------------------- Work With Currency  -------------------------
//        Bitcoin bit = new Bitcoin(8000);
//        bit.setMarga(100);
//        bit.exchangeCurrencyToGrn(1);
   }
}
