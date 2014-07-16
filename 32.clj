(fn dup-seq [u]
  (loop [i (- (count u) 1)
         x '()]
    (if (= i -1)
      x
      (recur (- i 1)
             (conj x (nth u i) (nth u i))))))
