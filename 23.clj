(fn rev-seq[n]
  (loop [x n r '()]
    (if (= x '())
      r
      (recur (rest x)
             (conj r
                   (first x))))))
