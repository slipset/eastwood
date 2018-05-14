(ns eastwood.linter)

(defprotocol ILint
  (pre-process [linter opts asts])
  (lint [linter opts ast]))
