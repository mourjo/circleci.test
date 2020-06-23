;; Version number: <circle-ci-base>.<forked-version>
;;                            0.4.3.0.1.0
;; This is forked off circleci/circleci.test 0.4.3
(defproject mourjo/circleci.test "0.4.3.0.1.0"
  :description "clojure.test compatible test-runner (forked from https://github.com/circleci/circleci.test)"
  :url "https://github.com/mourjo/circleci.test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.xml "0.0.8"]]
  :aliases {"test" ["run" "-m" "circleci.test/dir" :project/test-paths]
            "tests" ["run" "-m" "circleci.test"]
            "retest" ["run" "-m" "circleci.test.retest"]})
