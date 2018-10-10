package com.deerslab.transport;

/**
 * Created by keeper on 07.02.2016.
 */
public class TransportDatabase implements Database {

    int amountPosition = 13;

    @Override
    public int getName(int position){
        switch (position%amountPosition){
            case 0:
                return R.string.bus;
            case 1:
                return R.string.trolleybus;
            case 2:
                return R.string.tram;
            case 3:
                return R.string.metro;
            case 4:
                return R.string.taxi;
            case 5:
                return R.string.suburban_train;
            case 6:
                return R.string.plane;
            case 7:
                return R.string.train;
            case 8:
                return R.string.ferry;
            case 9:
                return R.string.water_taxi;
            case 10:
                return R.string.funicular;
            case 11:
                return R.string.helicopter;
            default:
                return R.string.tuktuk;
        }
    }

    @Override
    public int getPic(int position) {
        switch (position%amountPosition){
            case 0:
                return R.drawable.bus;
            case 1:
                return R.drawable.trolleybus;
            case 2:
                return R.drawable.tram;
            case 3:
                return R.drawable.metro;
            case 4:
                return R.drawable.taxi;
            case 5:
                return R.drawable.suburban_train;
            case 6:
                return R.drawable.plane;
            case 7:
                return R.drawable.train;
            case 8:
                return R.drawable.ferry;
            case 9:
                return R.drawable.water_taxi;
            case 10:
                return R.drawable.funicular;
            case 11:
                return R.drawable.helicopter;
            default:
                return R.drawable.tuktuk;
        }
    }

    @Override
    public int getSound(int position) {
        switch (position%amountPosition){
            case 0:
                return R.raw.bus;
            case 1:
                return R.raw.trolleybus;
            case 2:
                return R.raw.tram;
            case 3:
                return R.raw.metro;
            case 4:
                return R.raw.taxi;
            case 5:
                return R.raw.suburban_train;
            case 6:
                return R.raw.plane;
            case 7:
                return R.raw.train;
            case 8:
                return R.raw.ferry;
            case 9:
                return R.raw.water_taxi;
            case 10:
                return R.raw.funicular;
            case 11:
                return R.raw.helicopter;
            default:
                return R.raw.tuktuk;
        }
    }
}
