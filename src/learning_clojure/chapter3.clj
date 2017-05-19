(ns learning-clojure.chapter3)

(defn add100 
  "adds 100 to a number"
  [number]
  (+ number 100)
)


(defn dec-maker
  "creates a custom decrementor"
  [dec-by]
  #(- % dec-by)
)

(defn mapset
  "uses map function to create a set"
  [f args] 
  (set (map f args))
)


(def asym-body-parts [{:name "head" :size 3}
                     {:name "1-eye" :size 1}
                     {:name "1-ear" :size 1}
                     {:name "mouth" :size 1}
                     {:name "nose" :size 1}
                     {:name "neck" :size 2}
                     {:name "1-shoulder" :size 3}
                     {:name "1-upper-arm" :size 3}
                     {:name "chest" :size 10}
                     {:name "back" :size 10}
                     {:name "1-forearm" :size 3}
                     {:name "abdomen" :size 6}
                     {:name "1-kidney" :size 1}
                     {:name "1-hand" :size 2}
                     {:name "1-knee" :size 2}
                     {:name "1-thigh" :size 4}
                     {:name "1-lower-leg" :size 3}
                     {:name "1-achilles" :size 1}
                     {:name "1-foot" :size 2}]
)

(defn match-part-2
  "helper function for symmetrize-body-parts"
  [part]
  {:name (clojure.string/replace (:name part) #"^1-" "2-")
   :size (:size part)}
)

(defn match-part-3
  [part]
  {:name (clojure.string/replace (:name part) #"^1-" "3-")
   :size (:size part)}
)

(defn match-part-4
  [part]
  {:name (clojure.string/replace (:name part) #"^1-" "4-")
   :size (:size part)}
)

(defn match-part-5
  [part]
  {:name (clojure.string/replace (:name part) #"^1-" "5-")
   :size (:size part)}
)



(defn sbp-reduce 
  "same as prev. implementation of sbp, but for 5 body parts"
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts 
                  (set [part 
                        (match-part-2 part) 
                        (match-part-3 part) 
                        (match-part-4 part) 
                        (match-part-5 part) 
                       ]
                  )
            ) 
          )
          []
          asym-body-parts
  )
) 


