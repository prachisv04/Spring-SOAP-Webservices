package com.geography.countries.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Culture {
    @Id
    protected String origin;
    protected String book;
    protected String language;
    protected String religion;
}
