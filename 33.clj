(fn dup-seq-n [u n]
  (loop [i 0
         x '()]
    (if (= i (count u))
      x
      (recur (+ i 1)
             (concat x (repeat n (nth u i)))))))
