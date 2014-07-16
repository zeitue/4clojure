(fn get-caps[s] 
  (apply str(re-seq #"[A-Z+]" s)))
