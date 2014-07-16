(fn impose-seq [s l]
  (loop [x (conj '() (first l))
         e (rest l)
         i 0]
    (if (= i (count e))
      x
      (recur (concat x [s] [(nth e i)])
             e
             (inc i)))))
