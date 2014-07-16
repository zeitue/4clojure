(fn find-max [u & us]
  (loop [i 0 m u]
    (if (= i (count us))
      m
      (recur (inc i)
             (if (< m (nth us i))
               (nth us i)
               m)))))
