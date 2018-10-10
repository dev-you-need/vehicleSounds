package com.deerslab.transport;

import android.os.Bundle;

/**
 * Created by keeper on 08.02.2016.
 */
public class TransportActivity extends AbstractActivity {

    TransportDatabase database = new TransportDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }

}
