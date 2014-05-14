(defproject cc.artifice/excel "0.2.6"
  :description "A thin Clojure wrapper around a small part of Apache POI for
                reading .xlsx files."
  :url "http://github.com/ontodev/excel"
  :license {:name "Simplified BSD License"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.poi/poi-ooxml "3.9"]]
  :profiles
  {:dev {:dependencies [[midje "1.6.3"]
                        [lazytest "1.2.3"]]
         :plugins [[lein-midje "2.0.1"]
                   [lein-marginalia "0.7.1"]]}})
