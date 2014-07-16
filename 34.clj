(fn my-range [b e]
  (loop [i b x '()]
  (if (= i e)
    x
    (recur (inc i)
           (concat x [i])))))
