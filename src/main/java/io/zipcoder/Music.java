package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    //song si
    public Integer selection(Integer startIndex, String selection){
        //Each song is ordered sequentially = [s0, s1, ...];
        int forward = forwardCount(startIndex, selection);
        int backward = backwardCount(startIndex, selection);

        return Math.min(forward, backward);
    }

    public Integer forwardCount(Integer startIndex, String selection) {
        int forward = 0;
        for (int i = startIndex; i < playList.length ; i ++) {
            if (!playList[i].equals(selection)) {
                forward++;
            }
            else {
                break;
            }
        }
        return forward;
    }

    public Integer backwardCount (Integer startIndex, String selection) {
        int backward = 0;
        for (int i =  startIndex; i >=0 ; i--) {
            if (!playList[i].equals(selection)) {
                backward++;
            }
            else {
                return backward;
            }
        }
        for (int i = playList.length - 1; i > 0; i--) {
            if (!playList[i].equals(selection)){
                backward++;
            }
            else {
                return backward;
            }
        }

        return backward;
    }
    }
