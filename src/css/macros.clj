(ns css.macros)

(defmacro get-var [sym]
  (var-get (ns-resolve 'css.vars (symbol sym))))

(defmacro defstyled [sym element styles]
  (let [expanded (clojure.walk/macroexpand-all styles)]
    `(cljss.reagent/defstyled ~sym ~element ~expanded)))
