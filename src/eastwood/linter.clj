(ns eastwood.linter)

(defprotocol ILint
  (preprocess [linter opts asts])
  (lint [linter opts ast]))

(defprotocol ILintMultiple
  (preprocess-multiple [linter opts asts])
  (lint-multiple [linter opts ast]))
