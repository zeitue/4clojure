(fn my-split-at [n l]
  (conj [] (into [] (drop-last (- (count l) n) l))
        (into [] (drop n l))))
