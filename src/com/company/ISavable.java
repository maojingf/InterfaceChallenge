package com.company;

import java.util.List;

/**
 * Created by martin on 2016/12/19.
 */
public interface ISavable {
    List<String> write();
    void read(List<String> saveValues);

}
