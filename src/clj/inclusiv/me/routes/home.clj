(ns inclusiv.me.routes.home
  (:require [inclusiv.me.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]
            [inclusiv.me.db.core :as db]))

(defn home-page []
  (let [dbactions (db/get-actions)]
    (layout/render "index.html"
                   {:actions dbactions})
    )
  )

(defn about-page []
  (layout/render "about.html"))

(defn contact-page []
  (layout/render "contact.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/contact" [] (contact-page)))
