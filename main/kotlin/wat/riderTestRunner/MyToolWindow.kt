package wat.riderTestRunner
import com.intellij.openapi.wm.ToolWindow

import javax.swing.JLabel
import javax.swing.JPanel

class MyToolWindow(toolWindow: ToolWindow) {
    val content: JPanel = JPanel()

    init {
        val jLabel = JLabel()
        jLabel.text = "Hello World";
        content.add(jLabel)
    }
}