(ns inclusiv.me.routes.home
  (:require [inclusiv.me.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render "index.html" {:actions [{:cat "Social" :rank "1"
                                          :content "invite someone for coffee"
                                          :author "inclusiv.me"}]}))

(defn about-page []
  (layout/render "about.html"))

(defn contact-page []
  (layout/render "contact.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/contact" [] (contact-page)))
