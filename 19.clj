(fn my-last[x] (loop [ x x result []]
        (if (empty? x)
            (first result)
            (recur (rest x) 
                   (cons (first x) result)))))
