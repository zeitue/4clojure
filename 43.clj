(fn rev-inter[l n]
  (let [m (map-indexed #(vector (mod % n) %2) l)]
    (vals (sort (reduce
                 (fn [r x]
                   (let [s (first x), v (last x)]
                     (assoc r s (conj (get r s []) v))))
                 {} m)))))

