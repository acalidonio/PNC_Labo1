package com.acalidonio.pnc_labo1.domain.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    private String name;
    private List<String> types;
    private List<String> weaknesses;
    private List<String> regions;
    private List<String> zoneType;
}
