(ns hello                                        
  (:require [io.pedestal.http :as http]          
            [io.pedestal.http.route :as route]))


(defn respond-hello [request]          
  {:status 200 :body "Hello, world!"})
