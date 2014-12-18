(defproject com.mdrogalis/onyx-sql "0.4.1"
  :description "Onyx plugin for JDBC-backed SQL databases"
  :url "https://github.com/MichaelDrogalis/onyx-sql"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [com.mchange/c3p0 "0.9.2.1"]
                 [com.mdrogalis/onyx "0.5.0-SNAPSHOT"]
                 [honeysql "0.4.3"]]
  :profiles {:dev {:dependencies [[midje "1.6.2" :exclusions [joda-time]]
                                  [org.hornetq/hornetq-core-client "2.4.0.Final"]
                                  [mysql/mysql-connector-java "5.1.25"]
                                  [com.stuartsierra/component "0.2.1"]]
                   :plugins [[lein-midje "3.1.3"]]}})
