package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.paddingRight
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Text


@Composable
@Suppress("FunctionName")
fun Label(text: String, width: Int = 100) {
    org.jetbrains.compose.web.dom.Label(attrs = {
        style {
            paddingRight(10.px)
            width(width.px)
        }
    }) {
        Text(text)
    }
}