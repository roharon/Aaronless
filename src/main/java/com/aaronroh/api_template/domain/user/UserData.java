package com.aaronroh.api_template.domain.user;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserData {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(length=50)
    private String nickname;
}
