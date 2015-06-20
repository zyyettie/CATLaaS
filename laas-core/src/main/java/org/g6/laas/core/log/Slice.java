package org.g6.laas.core.log;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.g6.laas.core.field.Field;
import org.g6.laas.core.file.ILogFile;
import org.g6.laas.core.format.InputFormat;

import java.util.Collection;

/*
this class existing for consideration sometimes we need read multiple lines that is as slice
including [start, end) content
 */

@Data
@NoArgsConstructor
public abstract class Slice {
    private ILogFile file;
    private String content;
    private int start;
    private int end;
    InputFormat format;
    boolean splitable;

    public Slice(ILogFile file, String content, int start, int end, InputFormat format) {
        this.file = file;
        this.content = content;
        this.start = start;
        this.end = end;
        this.format = format;
        if (format != null)
            setSplitable(true);
    }

    public abstract Collection<Field> split();

}
