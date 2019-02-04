(defproject cc.artifice/excel "0.2.9"
  :description "A thin Clojure wrapper around a small part of Apache POI for
                reading .xlsx files."
  :url "http://github.com/ontodev/excel"
  :license {:name "Simplified BSD License"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.poi/poi "3.17"]
                 [org.apache.poi/poi-ooxml-schemas "3.17"]
                 [org.apache.poi/poi-scratchpad "3.17"]
                 [org.apache.poi/poi-ooxml "3.17"]]
  :global-vars {*warn-on-reflection* true}
  :profiles
  {:dev {:dependencies [[midje "1.9.6" :exclusions [org.clojure/clojure commons-codec]]
                        [lazytest "1.2.3"]]
         :plugins [[lein-midje "3.2.1"]
                   [lein-marginalia "0.8.0" :exclusions [org.clojure/clojure]]]}})
