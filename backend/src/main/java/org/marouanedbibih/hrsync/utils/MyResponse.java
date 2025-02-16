package org.marouanedbibih.hrsync.utils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyResponse {
    private Object data;
    private Object meta;
    private String message;
}
