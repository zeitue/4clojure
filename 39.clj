(fn two-seq [i o]
  (loop [m (if (<= (count i) (count o))
             (count i)
             (count o))
         n 0
         x '()]
    (if (= m n)
      x
      (recur m
       (inc n)
       (concat x
               [(nth i n)]
               [(nth o n)])))))
