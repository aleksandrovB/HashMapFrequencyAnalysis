package com.clouway;

import java.util.LinkedList;
import java.util.List;

public class PageBean<T> {
    private List<T> list;
    private int pageSize;
    private int elementsPassedByNext;

    private int currentPage = 0;
    private int currentId = 0;


    public PageBean(List<T> list, int PageSize) {
        this.list = list;
        this.pageSize = PageSize;
    }

    public List<T> next(){
        System.out.print("Next page: ");
        List<T> next = new LinkedList<>();
        int i = 0;
            while (i < pageSize) {
                if(list.size() > currentId) {
                    next.add(list.get(currentId));
                    if (currentId < list.size() - 1) {
                        currentId++;
                        elementsPassedByNext++;
                    } else {
                        currentId++;
                        currentPage++;
                        elementsPassedByNext = i+1;
                        return next;
                    }
                    i++;
                } else{
                    System.err.print("No next page!");
                    return null;
                }
            }
        currentPage++;
        elementsPassedByNext = i+1;
        return next;
    }

    public List<T> previous() {
        System.out.print("Previous page: ");
        List<T> prev = new LinkedList<>();
        int pages = pageSize;
        int pageSize2 = elementsPassedByNext;
        if(currentId-elementsPassedByNext > 0)
        {
            while (pages!=0){
            //    System.out.print(currentId+" ");
            prev.add(list.get(currentId - (pages + elementsPassedByNext)));
            pages--;
            }
            currentId -= elementsPassedByNext;
        }else{
            System.err.println("There is no previous page");
            return null;
            //throw new IndexOutOfBoundsException("There is no previous page!");
        }
        currentPage--;
        return prev;
    }

    public boolean hasNext() {
        System.out.println(currentId+" > "+list.size());
        return currentId < list.size() - 1;
    }

    public boolean hasPrevious() {
        return currentId-pageSize > 0;
    }
    public List<T> firstPage() {
        currentId=0;
        currentPage=1;
        return next();
    }

    public List<T> lastPage() {
        if(list.size()%pageSize!=0) {
            currentId = (list.size() / pageSize) * pageSize;
        }else {
            currentId = (list.size() / pageSize) * pageSize-pageSize;
        }
        return next();
    }

    public int getCurrentPageNumber() {
        return currentPage;
    }
}
