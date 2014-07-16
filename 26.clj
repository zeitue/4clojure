(fn fibonacci[n]
  (letfn [
          (rfib [a b]
                 (lazy-seq
                  (cons a(rfib b (+ a b)))))]
    (take n (rfib 1 1))))
