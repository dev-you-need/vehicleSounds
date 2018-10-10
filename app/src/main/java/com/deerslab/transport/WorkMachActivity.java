package com.deerslab.transport;

import android.os.Bundle;

/**
 * Created by keeper on 08.02.2016.
 */
public class WorkMachActivity extends AbstractActivity {

    WorkMachDatabase database = new WorkMachDatabase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.database = database;
        super.onCreate(savedInstanceState);
    }

}
