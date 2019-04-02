package com.clouway;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class FrequencyAnalysisForSymbols {
    private String word = "aaAaaasdfaaasdasdasdasd";
    private List<String > symbols = new LinkedList<>();
    private List<String > calculated = new LinkedList<>();
    private List<Integer> freq = new LinkedList<>();

//    public LinkedHashMap getMostCommonWord(String word){
//        LinkedHashMap<Integer,String> dataStorage = new LinkedHashMap<>();
//        List<String > symbols = new LinkedList<>();
//
//        for(int i = 0 ; i < word.length() ; i++){
//            symbols.add((String.valueOf(word.charAt(i))));
//        }
//
//        for(int i = 0 ; i < symbols.size() ; i++){
//            if(!dataStorage.containsValue(symbols.get(i))){
//                dataStorage.put(1,symbols.get(i));
//            } else {
//                dataStorage.replace(1,dataStorage.get(symbols.get(i))+1);
//                System.out.println("reac");
//            }
//        }
//        return dataStorage;
//    }
    //
    public String getMostCommonWord(String word){
        LinkedHashMap<String,Integer> dataStorage = new LinkedHashMap<>();
        List<String > symbols = new LinkedList<>();

        for(int i = 0 ; i < word.length() ; i++){
            symbols.add((String.valueOf(word.charAt(i))));
        }

        for(int i = 0 ; i < symbols.size() ; i++){
            if(!dataStorage.containsKey(symbols.get(i))){
                dataStorage.put(symbols.get(i),1);
            } else {
                dataStorage.replace(symbols.get(i),dataStorage.get(symbols.get(i))+1);
                System.out.println("reac");
            }
        }
        System.out.println(Collections.max(dataStorage.values()));
        return word;
    }

    public String getMostCommonWordWithoutMap(String word) {
        for (int i = 0; i < word.length(); i++) {
            symbols.add((String.valueOf(word.charAt(i))));
        }
        for (int i = 0; i < symbols.size(); i++) {
            if (!calculated.contains(symbols.get(i))) {
                calculated.add(symbols.get(i));
                freq.add(1);
            } else {
                int n = calculated.indexOf(symbols.get(i));
                freq.set(n, freq.get(n) + 1);
            }
        }
        return calculated.get(maxIndex(freq));
    }

    private int maxIndex(List<Integer> list){
        int max = 0;
        int maxIndex = 0;
        for(int i = 0 ; i < list.size() ; i++){
            if(max > list.get(i)){
                max = list.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
