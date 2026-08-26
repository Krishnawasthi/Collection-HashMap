# Java HashMap Interview Questions

1. What is `HashMap` in Java?
2. Why do we use `HashMap`?
3. What is the difference between `HashMap` and `HashSet`?
4. What is the difference between `HashMap` and `LinkedHashMap`?
5. What is the difference between `HashMap` and `TreeMap`?
6. Can `HashMap` have duplicate keys?
7. Can `HashMap` have duplicate values?
8. Can `HashMap` contain `null` keys and `null` values?
9. What happens when you insert the same key twice?
10. What is the return type of `put()`, `get()`, `containsKey()`, and `remove()`?
11. How does `HashMap` work internally?
12. What is a bucket in `HashMap`?
13. What is a hash collision?
14. How does `HashMap` handle collisions?
15. What is the role of `hashCode()` in `HashMap`?
16. What is the role of `equals()` in `HashMap`?
17. Why should `equals()` and `hashCode()` be overridden together?
18. What happens if two different keys have the same `hashCode()`?
19. What happens if `equals()` returns `true` but the hash codes are different?
20. Can a mutable object be used as a key in `HashMap`? What problems can occur?
21. What is the default capacity of `HashMap`?
22. What is the default load factor?
23. What is the relationship between capacity, load factor, and threshold?
24. What is resizing in `HashMap`?
25. What is rehashing?
26. Why is `HashMap` capacity generally maintained as a power of two?
27. What does `(n - 1) & hash` mean?
28. What changed in `HashMap` after Java 8?
29. What is treeification?
30. What are `TREEIFY_THRESHOLD`, `UNTREEIFY_THRESHOLD`, and `MIN_TREEIFY_CAPACITY`?
31. What is the time complexity of `put()`, `get()`, and `remove()` in `HashMap`?
32. What is the worst-case performance of `HashMap` before and after Java 8?
33. Is `HashMap` thread-safe? If not, what problems can occur?
34. What is the difference between `HashMap` and `ConcurrentHashMap`?
35. What is the difference between `HashMap` and `Collections.synchronizedMap()`?
36. What is `ConcurrentModificationException` and why can it occur with `HashMap`?
37. How would you optimize a `HashMap` if you know it will contain millions of entries?
38. How would you design a good custom class to be used as a `HashMap` key?
39. How would you troubleshoot poor `HashMap` performance caused by excessive collisions?
40. Explain the complete internal working of `HashMap` from `put(key, value)` to storing the entry in a bucket.
