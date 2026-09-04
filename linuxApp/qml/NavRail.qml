import QtQuick
import QtQuick.Layouts

// Top-level navigation: a vertical icon rail when there is width for it, the same
// items as a bottom bar when there is not. Mirrors the Android/iOS navigation suite.
Rectangle {
    id: root

    property bool horizontal: false
    property int currentIndex: 0
    signal selected(int index)

    readonly property var entries: [
        { icon: "ic_puzzle", label: "Basics" },
        { icon: "ic_idea", label: "Tips" },
        { icon: "ic_search_40dp", label: "Commands" },
    ]

    color: Omarchy.background

    // Edge separator: right of the rail, top of the bottom bar.
    Rectangle {
        color: Omarchy.selection
        width: root.horizontal ? root.width : 1
        height: root.horizontal ? 1 : root.height
        anchors.right: root.horizontal ? undefined : parent.right
        anchors.top: root.horizontal ? parent.top : undefined
    }

    GridLayout {
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenter: root.horizontal ? parent.verticalCenter : undefined
        anchors.top: root.horizontal ? undefined : parent.top
        anchors.topMargin: root.horizontal ? 0 : 12
        width: root.horizontal ? root.width : undefined
        columns: root.horizontal ? 3 : 1
        rowSpacing: 2
        columnSpacing: 0

        Repeater {
            model: root.entries

            Item {
                id: entry
                required property var modelData
                required property int index

                readonly property bool active: root.currentIndex === entry.index

                Layout.preferredWidth: root.horizontal ? root.width / 3 : root.width
                Layout.preferredHeight: 54

                // Active marker: a bar on the edge the rail is attached to.
                Rectangle {
                    color: entry.active ? Omarchy.accent : "transparent"
                    width: root.horizontal ? parent.width : 2
                    height: root.horizontal ? 2 : parent.height
                    anchors.left: root.horizontal ? undefined : parent.left
                    anchors.bottom: root.horizontal ? parent.bottom : undefined
                }

                Column {
                    anchors.centerIn: parent
                    spacing: 5

                    Image {
                        anchors.horizontalCenter: parent.horizontalCenter
                        // The provider tints the shared monochrome SVGs to the palette.
                        source: "image://icons/" + entry.modelData.icon + "/"
                            + (entry.active ? Omarchy.accent : Omarchy.muted).toString().slice(-6)
                        sourceSize.width: 21
                        sourceSize.height: 21
                        width: 21
                        height: 21
                        smooth: true
                    }

                    Text {
                        anchors.horizontalCenter: parent.horizontalCenter
                        text: entry.modelData.label
                        color: entry.active ? Omarchy.brightForeground : Omarchy.muted
                        font.pixelSize: Omarchy.fontCaption
                    }
                }

                MouseArea {
                    anchors.fill: parent
                    cursorShape: Qt.PointingHandCursor
                    onClicked: root.selected(entry.index)
                }
            }
        }
    }
}
