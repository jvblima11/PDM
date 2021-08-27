package com.app.culpadoivo.room.entities;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(tableName = "Tickets")
public class Ticket {
    @PrimaryKey(autoGenerate = true)
    private long id;

    private String destination,origin;
    private double price;
}
