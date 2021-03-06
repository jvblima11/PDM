package com.app.culpadoivo.room;

import android.content.Context;

import androidx.room.Room;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Database {
    private static volatile AppDb database;

    private static AppDb create(Context context){
        return Room.databaseBuilder(context,AppDb.class, "amarelodb")
                .allowMainThreadQueries()
                .build();
    }

    public static synchronized AppDb getDatabase(Context context){
        if(database == null){
                database = create(context);
        }
        return database;
    }
}
