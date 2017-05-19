(ns learning-clojure.core
  (require [learning-clojure.hobbit :refer :all]
           [learning-clojure.chapter3 :refer :all])
  (:gen-class))


(defn -main
  "output answers from textbook problems"
  [& args]
  (println "chapter 3, problem 3: " (add100 100))
  (def dec9 (dec-maker 9))
  (println "chapter 3, problem 4: " (dec9 10))
  (println "chapter 3, problem 5: " (mapset inc [1 1 2 2]))
  (println "chapter 3, problem 6: " (sbp-reduce asym-body-parts))
)

