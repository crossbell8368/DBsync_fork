package com.todoPang.DBsync.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ChallengeObject")
public class Challenge {

    @Id
    @Column(name = "chlg_id")
    private int chlg_id;

    @Column(name = "chlg_type")
    private int chlg_type;

    @Column(name = "chlg_title")
    private String chlg_title;

    @Column(name = "chlg_desc")
    private String chlg_desc;

    @Column(name = "chlg_goal")
    private int chlg_goal;

    @Column(name = "chlg_reward")
    private int chlg_reward;

    @Column(name = "chlg_step")
    private int chlg_step;
}
