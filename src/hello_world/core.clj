(ns hello_world.core)

(defn -main
  []
  (println "Mainlining Clojure"))

(defn hello-world
  []
  (println "Hello World!"))

(def objects '(whiskey-bottle bucket frog chain))

(def game-map (hash-map
   'living-room '((you are in the living room
                   of a wizards house - there is a wizard
                   snoring loudly on the couch -)
                  (west door garden)
                  (upstairs stairway attic))
   'garden '((you are in a beautiful garden -
              there is a well in front of you -)
             (east door living-room))
   'attic '((you are in the attic of the
             wizards house - there is a giant
             welding torch in the corner -)
            (downstairs stairway living-room))))

(def object-locations (hash-map
                        'whiskey-bottle 'living-room
                        'bucket 'living-room
                        'chain 'garden
                        'frog 'garden))

(def location 'living-room)

(defn describe-location [location game-map]
  (first (location game-map)))

(describe-location 'living-room game-map)

(defn describe-path [path]
  `(there is a ~(second path) going ~(first path) from here -))

(defn spel-print [list] (map (fn [x] (symbol (name x))) list))

(spel-print (describe-path '(west door garden)))
