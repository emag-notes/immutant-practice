(ns hello-immutant.core
  (:require [immutant.web :as web])
  (:gen-class))

(defn app [request]
  {:status 200
   :body "Hello, Immutant!"})

(defn -main []
  (web/run app))
