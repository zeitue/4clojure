(fn rotate-seq [n l]
  (loop [i n s l]
    (if (= i 0)
      s
      (if (< 0 n)
        (recur (dec i)
               (concat (rest s) [(first s)]))
        (recur (inc i)
               (conj (drop-last s) (last s)))))))
