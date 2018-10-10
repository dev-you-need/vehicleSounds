package com.deerslab.transport;

/**
 * Created by keeper on 08.02.2016.
 */
public class WorkMachDatabase implements Database {

    int amountPosition = 13;

    @Override
    public int getName(int position){
        switch (position%amountPosition){
            case 0:
                return R.string.ambulance;
            case 1:
                return R.string.fire_truck;
            case 2:
                return R.string.police;
            case 3:
                return R.string.tow_truck;
            case 4:
                return R.string.snowplow_truck;
            case 5:
                return R.string.garbage_truck;
            case 6:
                return R.string.street_flusher;
            case 7:
                return R.string.concrete_mixer;
            case 8:
                return R.string.excavator;
            case 9:
                return R.string.bulldozer;
            case 10:
                return R.string.autocrane;
            case 11:
                return R.string.dump_truck;
            default:
                return R.string.tractor;
        }
    }

    @Override
    public int getPic(int position) {
        switch (position%amountPosition){
            case 0:
                return R.drawable.ambulance;
            case 1:
                return R.drawable.fire_truck;
            case 2:
                return R.drawable.police;
            case 3:
                return R.drawable.tow_truck;
            case 4:
                return R.drawable.snowplow_truck;
            case 5:
                return R.drawable.garbage_truck;
            case 6:
                return R.drawable.street_flusher;
            case 7:
                return R.drawable.concrete_mixer;
            case 8:
                return R.drawable.excavator;
            case 9:
                return R.drawable.bulldozer;
            case 10:
                return R.drawable.autocrane;
            case 11:
                return R.drawable.dump_truck;
            default:
                return R.drawable.tractor;
        }
    }

    @Override
    public int getSound(int position) {
        switch (position%amountPosition){
            case 0:
                return R.raw.ambulance;
            case 1:
                return R.raw.fire_truck;
            case 2:
                return R.raw.police;
            case 3:
                return R.raw.tow_truck;
            case 4:
                return R.raw.snowplow_truck;
            case 5:
                return R.raw.garbage_truck;
            case 6:
                return R.raw.street_flusher;
            case 7:
                return R.raw.concrete_mixer;
            case 8:
                return R.raw.excavator;
            case 9:
                return R.raw.bulldozer;
            case 10:
                return R.raw.autocrane;
            case 11:
                return R.raw.dump_truck;
            default:
                return R.raw.tractor;
        }
    }
}
