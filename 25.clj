(fn find-odd[x]
  (let [b '()]
    (remove nil?
            (for [i x]
              (if (odd? i) i)))))
