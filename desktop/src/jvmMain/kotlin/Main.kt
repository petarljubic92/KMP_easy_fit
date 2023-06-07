import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.easy.fit.common.App


fun main() = application {
    Window(onCloseRequest = {
        this.exitApplication()
    }) {
        App()
    }
}
