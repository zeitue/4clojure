(fn flip-order[f]
  (fn[& args]
    (apply f (reverse args))))
