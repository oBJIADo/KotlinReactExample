package app.header

import app.header.components.contacts
import app.header.components.logo
import app.header.components.menu
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

interface HeaderState : RState {

}

class Header : RComponent<RProps, RState>() {
    override fun RState.init() {

    }

    override fun RBuilder.render() {
        div(classes = "header__wrapper") {
            logo()
            menu()
            contacts()
        }
    }
}

fun RBuilder.appHeader() = child(Header::class) {}