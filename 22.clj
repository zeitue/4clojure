(fn my-count[n]
  (loop [i 0 x n]
  (if (= '() x)
    i
    (recur (inc i) (rest x)))))
