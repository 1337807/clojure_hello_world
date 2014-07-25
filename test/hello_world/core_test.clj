(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest a-test
  (testing "Hello World should print 'Hello World!'"
    (is (= "Hello World!\n" (with-out-str (hello_world))))))
