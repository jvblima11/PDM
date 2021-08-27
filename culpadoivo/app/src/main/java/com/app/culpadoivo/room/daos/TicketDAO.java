package com.app.culpadoivo.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.app.culpadoivo.room.entities.Ticket;

import java.util.List;

@Dao


public interface TicketDAO {
    @Insert
    public void inserir(Ticket... tickets);

    @Update
    public void update(Ticket... tickets);

    @Delete
    public void delete(Ticket ticket);

    @Query("SElECT * FROM tickets")
    public List<Ticket>get_tickets();

    @Query("SELECT * FROM tickets WHERE id = :Ticketid")
    public Ticket getTicket(long Ticketid);

}
