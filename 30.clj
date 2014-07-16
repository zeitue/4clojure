(fn remove-dupes [u]
  (loop [n (- (count u) 1) x '()]
    (if (= n -1)
      x
      (recur (- n 1)
             (if (= (first x)
                    (nth u n))
                    x
                    (conj x (nth u n)))))))
