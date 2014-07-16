(fn flatten-1-layer[u]
  (mapcat  #(if (sequential? %)
              (flatten-1-layer %)
              [%])
           u))
