(ns learning-clojure.core
  (require [learning-clojure.hobbit :refer :all])
  (:gen-class))


(defn -main
  "prints out the output from symmetrize-body-parts"
  [& args] 
  (println "hobbit part hit: " (hit asym-hobbit-body-parts))
)

