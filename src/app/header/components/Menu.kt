package app.header.components

import app.functional.defaultButton
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.li
import react.dom.ul

class Menu : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div(classes = "header_menu__wrapper noselect__wrapper") {
            ul {
                li { defaultButton("How it Works") }
                li { defaultButton("About") }
                li { defaultButton("Testimorials") }
                li { defaultButton("Contact") }
            }
        }
    }
}

fun RBuilder.menu() = child(Menu::class) {}