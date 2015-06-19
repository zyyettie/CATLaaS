package org.g6.laas.core.log;

import org.g6.laas.core.field.Field;
import org.g6.laas.core.file.ILogFile;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: zhouzhan
 * Date: 6/18/15
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class LogLine extends Line {
    public LogLine() {
    }

    public LogLine(ILogFile file, String content, int lineNumber) {
        super(file, content, lineNumber);
    }

    @Override
    public Collection<Field> split() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}