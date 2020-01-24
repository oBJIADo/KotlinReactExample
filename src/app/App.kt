package app

import app.body.appBody
import app.header.appHeader
import kotlinext.js.require
import kotlinext.js.requireAll
import react.dom.div
import react.dom.render
import kotlin.browser.document

/**
 * Index class. App starting here.
 */
fun main(args: Array<String>) {
    // Need to load all css files into src folder
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("app")) {
        div(classes = "picture__wrapper") {
            appHeader()
            appBody()
        }
    }
}