(ns inclusiv.me.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[inclusiv.me started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[inclusiv.me has shut down successfully]=-"))
   :middleware identity})
