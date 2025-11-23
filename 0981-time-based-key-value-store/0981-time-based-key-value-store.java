import java.util.*;

class TimeMap {
    private Map<String, List<Integer>> times;
    private Map<String, List<String>> vals;

    public TimeMap() {
        times = new HashMap<>();
        vals = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        times.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        vals.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        if (!times.containsKey(key)) return "";
        List<Integer> tlist = times.get(key);
        List<String> vlist = vals.get(key);
        
        int idx = upperBound(tlist, timestamp); // first index > timestamp
        if (idx == 0) return "";                // no timestamp <= query
        return vlist.get(idx - 1);              // largest timestamp <= query
    }
    
    // returns first index i such that list.get(i) > target
    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size(); // r is exclusive
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
