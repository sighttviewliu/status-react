(ns status-im.ui.components.styles
  (:require [status-im.ui.components.colors :as colors]))

(def color-blue4-transparent "rgba(67, 96, 223, 0.10)") ;;secondary button background
(def color-blue6 "#3745AF") ;;advanced button background
(def color-gray3 "#00000040") ;; actions-list-view
(def color-gray5 "#d9dae1") ;; chat-separator-item
(def color-gray7 "#9fa3b4") ;; icons gray
(def color-gray9 "#E9EBEC") ;; asset-icon
(def color-dark "#49545d") ;; icons dark
(def color-white-transparent-1 "#f1f1f11a") ;; separator
(def color-white-transparent-3 "#FFFFFF1A") ;; asset-container
(def color-white-transparent-4 "#FFFFFF33") ;; border-color-high
(def color-white-transparent-5 "#FFFFFF8C") ;; wallet-value
(def color-light-blue "#628fe3") ;; online-color
(def color-light-blue-transparent "#628fe333") ;; action-button-icon-container
(def color-dark-blue-2 "#1f253f") ; status-bar-transaction
(def color-light-gray "#EEF2F5") ; action-button-icon-container-disabled
(def color-light-gray3 "#e8ebec") ; tabs-container
(def color-light-gray6 "#BAC1C6") ; browser-icon
(def color-red "red") ;not-sent-text
(def color-red-2 "#d84b4b") ; icon-red-color
(def color-green-4 "#0dcd8d") ; network-icon
(def separator-color "#0000001f") ; actions-separator


(def text1-color :black)
(def text2-color :gray);color-gray)
(def text4-color colors/gray) ;color-gray4)
(def icon-dark-color color-dark)
(def icon-gray-color color-gray7)
(def icon-red-color color-red-2)
(def online-color color-light-blue)
(def chat-background color-light-gray)

(def default-chat-color :purpule);color-purple)

(defn random-chat-color []
  (rand-nth colors/chat-colors))

;;rgb 237 241 243

(def flex
  {:flex 1})

(def create-icon
  {:font-size 20
   :height    22
   :color     :white})

(def icon-back
  {:width  8
   :height 14})

(def icon-default
  {:width  24
   :height 24})

(def icon-add
  {:width           24
   :height          24
   :color           colors/blue})

(def icon-add-illuminated
  {:width           24
   :height          24
   :color           colors/blue
   :container-style {:background-color (colors/alpha colors/blue 0.12)
                     :border-radius    32
                     :width            32
                     :height           32
                     :display          :flex
                     :justify-content  :center
                     :align-items      :center}})

(def icon-ok
  {:width  18
   :height 14})

(def icon-qr
  {:width  23
   :height 22})

(def button-input-container
  {:flex           1
   :flex-direction :row})

(def button-input
  {:flex           1
   :flex-direction :column})

(def modal
  {:position :absolute
   :left     0
   :top      0
   :right    0
   :bottom   0})

(def main-container
  {:background-color colors/white
   :flex             1})

(def border-radius 8)
