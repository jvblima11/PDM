package com.app.culpadoivo.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.culpadoivo.room.daos.TicketDAO;
import com.app.culpadoivo.room.entities.Ticket;

@Database(entities = {Ticket.class},version = 1)
public abstract class AppDb extends RoomDatabase {
    public abstract TicketDAO getticketDAO();
}
