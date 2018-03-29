(ns css.main
  (:require [css.macros]
            [css.vars]
            [clojure.pprint]
            [cljss.reagent]
            [cljss.core]
            [cljs.core]))

(defn demo [form]
  (println)
  (clojure.pprint/pprint form)
  (println "1=>")
  (clojure.pprint/pprint (macroexpand-1 form))
  (println "all=>")
  (clojure.pprint/pprint (clojure.walk/macroexpand-all form)))

(defn -main [& args]
  (demo '(css.macros/get-var medium))
  (demo '(css.macros/defstyled a :b {}))
  (demo '(css.macros/defstyled a :b {:width (css.macros/get-var medium)})))
