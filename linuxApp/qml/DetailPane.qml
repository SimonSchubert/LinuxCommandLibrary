import QtQuick
import QtQuick.Controls

// Right-hand half of a list/detail page: a placeholder until something is selected,
// then that selection's content as cards. Commands and basics differ only in the
// model, the placeholder, and what counts as a selection.
Rectangle {
    id: pane

    property alias model: list.model
    property string placeholder
    property bool hasSelection: false
    signal linkActivated(string link)

    color: Omarchy.darkBackground

    Text {
        anchors.centerIn: parent
        visible: !pane.hasSelection
        text: pane.placeholder
        color: Omarchy.muted
        font.pixelSize: Omarchy.fontBody
    }

    ListView {
        id: list
        anchors.fill: parent
        anchors.margins: Omarchy.gap
        visible: pane.hasSelection
        clip: true
        spacing: Omarchy.gap
        boundsBehavior: Flickable.StopAtBounds
        ScrollBar.vertical: ScrollBar {}

        delegate: ContentCard {
            width: list.width - (Omarchy.gap + 4)
            title: model.title
            blocks: list.model.blocksAt(index)
            onLinkActivated: function(link) { pane.linkActivated(link) }
        }
    }
}
