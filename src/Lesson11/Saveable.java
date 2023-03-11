package Lesson11;

import java.util.Map;

public interface Saveable {
    void saveToMap(Map<String, Object> map);
    void loadFromMap(Map<String, Object> map);
}
