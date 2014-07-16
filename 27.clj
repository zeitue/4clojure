(fn palindrome[u]
  (= u
     (if (string? u)
       (apply str (reverse u))
       (reverse u))))
