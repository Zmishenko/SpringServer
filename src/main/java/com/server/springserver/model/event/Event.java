package com.server.springserver.model.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "reason")
    private String reason;

    @Column(name = "dateFrom")
    private String dateFrom;

    @Column(name = "dateTo")
    private String dateTo;

    @Column(name = "grpupsNum")
    private String grpupsNum;

    @Column(name = "predmet")
    private String predmet;
}
