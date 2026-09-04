import QtQuick

// One row of a navigation list: selection tint, elided label, pointer cursor.
Rectangle {
    id: row

    property string label
    property bool selected: false
    signal activated()

    height: Omarchy.rowHeight
    color: selected ? Omarchy.selectedBackground : "transparent"

    Text {
        anchors.verticalCenter: parent.verticalCenter
        anchors.left: parent.left
        anchors.leftMargin: 12
        anchors.right: parent.right
        anchors.rightMargin: 8
        text: row.label
        elide: Text.ElideRight
        color: row.selected ? Omarchy.selectedText : Omarchy.foreground
        font.pixelSize: Omarchy.fontBody
    }

    MouseArea {
        anchors.fill: parent
        cursorShape: Qt.PointingHandCursor
        onClicked: row.activated()
    }
}
