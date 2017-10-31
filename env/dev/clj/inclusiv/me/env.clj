(ns inclusiv.me.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [inclusiv.me.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[inclusiv.me started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[inclusiv.me has shut down successfully]=-"))
   :middleware wrap-dev})
