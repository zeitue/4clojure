(fn drop-n [l n]
  (loop [i 0
         x '()
         r (range (dec n) (count l) n)]
    (if (= i (count l))
      x
      (if (= i (first r))
        (recur (inc i)
               x
               (rest r))
        (recur (inc i)
               (concat x [(nth l i)])
               r)))))
