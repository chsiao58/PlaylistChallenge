package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        Integer downCount = countSelectDown(startIndex,selection);
        Integer upCount = countSelectUp(startIndex,selection);
        if (downCount<=upCount)
            return downCount;
        else
            return upCount;
    }

    private Integer countSelectDown(Integer startIndex, String selection)
    {
        Integer count = 0;
        Integer index = startIndex;
        while(!playList[index].equals(selection)) {
            index++;
            count++;
            if (index >= playList.length)
                index = 0;
        }
        return count;
    }

    private Integer countSelectUp(Integer startIndex, String selection)
    {
        Integer count = 0;
        Integer index = startIndex;
        while(!playList[index].equals(selection)) {
            index--;
            count++;
            if (index < 0)
                index = playList.length-1;
        }
        return count;
    }
}

