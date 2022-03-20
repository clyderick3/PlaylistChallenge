package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    //song si
    public Integer selection(Integer startIndex, String selection){
        //Each song is ordered sequentially = [s0, s1, ...];
        int forward = 0;
        int backward = 0;
        for (int i = startIndex; i < playList.length ; i ++){
            if (!playList[i].equals(selection)){
                forward++;
            }
        }


        return null;
    }
}
