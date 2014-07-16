(fn my-nth[s n]
  (first 
   ((apply comp 
           (repeat n rest)) s)))
