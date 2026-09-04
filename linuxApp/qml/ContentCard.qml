import QtQuick
import QtQuick.Layouts

// One titled piece of content: a command section, a basics group, or a tip. Blocks are
// rendered individually rather than as one Markdown document so command lines can sit
// in their own inset, the way the mobile apps present them.
Rectangle {
    id: card

    property string title
    property var blocks: []
    signal linkActivated(string link)

    color: Omarchy.background
    border.color: Omarchy.selection
    border.width: 1
    implicitHeight: body.implicitHeight + 2 * Omarchy.pad

    ColumnLayout {
        id: body
        x: Omarchy.pad
        y: Omarchy.pad
        width: card.width - 2 * Omarchy.pad
        spacing: Omarchy.gap - 2

        Text {
            Layout.fillWidth: true
            text: card.title
            color: Omarchy.brightForeground
            font.pixelSize: Omarchy.fontSubtitle
            font.bold: true
            wrapMode: Text.WordWrap
        }

        Repeater {
            model: card.blocks

            Rectangle {
                id: block
                required property var modelData

                readonly property bool code: modelData.kind === "code"

                Layout.fillWidth: true
                implicitHeight: blockText.implicitHeight + (code ? 10 : 0)
                color: code ? Omarchy.lighterBackground : "transparent"
                border.width: code ? 1 : 0
                border.color: Omarchy.selection

                Text {
                    id: blockText
                    x: block.code ? 7 : 0
                    y: block.code ? 5 : 0
                    width: block.width - 2 * x
                    text: block.modelData.text
                    textFormat: Text.MarkdownText
                    wrapMode: Text.WordWrap
                    color: block.modelData.kind === "quote" ? Omarchy.muted : Omarchy.foreground
                    font.pixelSize: Omarchy.fontBody
                    onLinkActivated: function(link) { card.linkActivated(link) }
                }
            }
        }
    }
}
