package com.clouway;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        String word = "aaAaaasdfaaasdasdasdasd";
//        List<String > symbols = new LinkedList<>();
//        List<String > calculated = new LinkedList<>();
//        List<Integer> freq = new LinkedList<>();
//        for(int i = 0 ; i < word.length() ; i++){
//            symbols.add((String.valueOf(word.charAt(i))));
//        }
//
//        System.out.println("All characters: "+symbols+" equal="+symbols.size());
//
//
//        for(int i = 0 ; i < symbols.size() ; i++){
//            if(!calculated.contains(symbols.get(i))){
//                calculated.add(symbols.get(i));
//                freq.add(1);
//            } else{
//                int n = calculated.indexOf(symbols.get(i));
//                freq.set(n,freq.get(n)+1);
//            }
//        }
//
//        System.out.println(calculated);
//        System.out.println(freq);
//

        LinkedHashMap<String,Integer> dataStorage = new LinkedHashMap<>();

        String word = "aasdASDasdffc";
        List<String > symbols = new LinkedList<>();

        for(int i = 0 ; i < word.length() ; i++){
            symbols.add((String.valueOf(word.charAt(i))));
        }

        for(int i = 0 ; i < symbols.size() ; i++){
            if(!dataStorage.containsKey(symbols.get(i))){
                dataStorage.put(symbols.get(i),1);
            } else {
                dataStorage.replace(symbols.get(i),dataStorage.get(symbols.get(i))+1);
            }
        }
        System.out.println(dataStorage);
        int num = Collections.max(dataStorage.values());
        System.out.println("Max "+Collections.max(dataStorage.values()));

        System.out.println("Entry set "+dataStorage.values());







/*garbage

        LinkedHashMap<Integer,String> dataStorageProper = new LinkedHashMap<>();
        String word = "asdASDasdffc";
        List<String > symbols = new LinkedList<>();

        for(int i = 0 ; i < word.length() ; i++){
            symbols.add((String.valueOf(word.charAt(i))));
        }

        for(int i = 0 ; i < symbols.size() ; i++){
            if(!dataStorageProper.containsValue(symbols.get(i))){
                dataStorageProper.putIfAbsent(1,symbols.get(i));
            }
            else {
                System.out.println("else");
            }
        }

        System.out.println(dataStorageProper);*/


//        FrequencyAnalysisForSymbols freq = new FrequencyAnalysisForSymbols();
//
//        System.out.println(freq.getMostCommonWord("aaaaaaasdasdasd"));






        /*List<Integer> integers = new LinkedList<>();
        for(int i = 0 ; i < 41 ; i++){
            integers.add(i);
        }
        PageBean pageBean = new PageBean(integers,5);

        Scanner scan = new Scanner(System.in);

        boolean whilespin = true;
        while(whilespin)
        {
            String nextLine = scan.nextLine();
            if(nextLine.equals("next")){
                System.out.println(pageBean.next());
                System.out.println(pageBean.getCurrentPageNumber());
            }
            if(nextLine.equals("prev")){
                System.out.println(pageBean.previous());
                System.out.println(pageBean.getCurrentPageNumber());
            }
            if(nextLine.equals("end")){
                if(scan!=null)
                scan.close();

                whilespin = false;
            }
        }

//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.next());
//        System.out.println(pageBean.getCurrentPageNumber());
//
//        System.out.println(pageBean.previous());
//        System.out.println(pageBean.getCurrentPageNumber());*/

    }
}
