import QtQuick
import QtQuick.Controls
import QtQuick.Layouts
import QtQuick.Window

ApplicationWindow {
    id: window
    // Deliberately assigned once rather than bound: a binding on width/height wins
    // over the compositor, so the window would ignore every resize. Under a tiling
    // WM like Hyprland that means never adopting the size it is actually given.
    Component.onCompleted: {
        width = Math.min(1200, Screen.desktopAvailableWidth)
        height = Math.min(760, Screen.desktopAvailableHeight)
        applyRoute()
    }
    visible: true
    title: "Linux Command Library"
    color: Omarchy.darkBackground

    // Rail beside the content when there is width for it, bottom bar when there is not.
    readonly property bool wide: width >= Config.compactBelow

    // 0 Basics, 1 Tips, 2 Commands, matching the mobile navigation order.
    property int section: Config.startSection
    property string selectedCommand: ""
    property string selectedCategory: ""

    readonly property bool drilled: section === 0 ? selectedCategory !== ""
        : section === 2 ? selectedCommand !== ""
        : false

    readonly property string screenTitle: {
        if (!wide && drilled)
            return section === 2 ? selectedCommand : selectedCategory
        return section === 0 ? "Basics" : section === 1 ? "Tips" : "Commands"
    }

    function showMan(command) {
        section = 2
        selectedCommand = command
        Sections.command = command
    }

    function goBack() {
        if (section === 0) selectedCategory = ""
        else if (section === 2) selectedCommand = ""
    }

    // Every content surface now goes through the shared renderer, so there is one
    // encoding for a man page reference rather than one per source.
    function openLink(link) {
        if (link.startsWith("man:"))
            showMan(link.substring(4))
    }

    function applyRoute() {
        if (InitialRoute === "")
            return
        if (InitialRoute === "tips") {
            section = 1
        } else if (InitialRoute.startsWith("basic:")) {
            section = 0
            selectedCategory = InitialRoute.substring(6)
            Groups.categoryId = selectedCategory
        } else {
            showMan(InitialRoute)
        }
    }

    // Built on first visit: the card grid instantiates a Text per content block, which
    // is ~180 Markdown documents for a page the user may never open.
    Component {
        id: tipsPage

        Rectangle {
            color: Omarchy.darkBackground

            TipsPage {
                anchors.fill: parent
                anchors.margins: 8
                onLinkActivated: function(link) { window.openLink(link) }
            }
        }
    }

    ColumnLayout {
        anchors.fill: parent
        spacing: 0

        RowLayout {
            Layout.fillWidth: true
            Layout.fillHeight: true
            spacing: 0

            NavRail {
                Layout.preferredWidth: 74
                Layout.fillHeight: true
                visible: window.wide
                currentIndex: window.section
                onSelected: function(index) { window.section = index }
            }

            ColumnLayout {
                Layout.fillWidth: true
                Layout.fillHeight: true
                spacing: 0

                // Screen header
                Rectangle {
                    id: headerBar
                    Layout.fillWidth: true
                    Layout.preferredHeight: 42
                    color: Omarchy.darkBackground

                    // Only the compact layout can drill in; the wide layout keeps the
                    // list beside the detail, so there is nothing to go back from.
                    readonly property bool showBack: !window.wide && window.drilled

                    Row {
                        anchors.verticalCenter: parent.verticalCenter
                        anchors.left: parent.left
                        anchors.leftMargin: headerBar.showBack ? 4 : 12
                        anchors.right: parent.right
                        anchors.rightMargin: 12
                        spacing: 4

                        Item {
                            width: 32
                            height: 32
                            anchors.verticalCenter: parent.verticalCenter
                            visible: headerBar.showBack

                            Image {
                                anchors.centerIn: parent
                                source: "image://icons/ic_arrow_back/"
                                    + Omarchy.brightForeground.toString().slice(-6)
                                sourceSize.width: 19
                                sourceSize.height: 19
                                width: 19
                                height: 19
                                smooth: true
                            }

                            MouseArea {
                                anchors.fill: parent
                                cursorShape: Qt.PointingHandCursor
                                onClicked: window.goBack()
                            }
                        }

                        Text {
                            anchors.verticalCenter: parent.verticalCenter
                            width: parent.width - (headerBar.showBack ? 36 : 0)
                            text: window.screenTitle
                            elide: Text.ElideRight
                            color: Omarchy.brightForeground
                            font.pixelSize: Omarchy.fontHeading
                            font.bold: true
                        }
                    }

                    Rectangle {
                        anchors.bottom: parent.bottom
                        width: parent.width
                        height: 1
                        color: Omarchy.selection
                    }
                }

                StackLayout {
                    Layout.fillWidth: true
                    Layout.fillHeight: true
                    currentIndex: window.section

                    // ---------------- Basics ----------------
                    RowLayout {
                        spacing: 0

                        Rectangle {
                            Layout.preferredWidth: 260
                            Layout.fillWidth: !window.wide
                            Layout.fillHeight: true
                            visible: window.wide || !window.drilled
                            color: Omarchy.darkBackground

                            ListView {
                                id: categoryList
                                anchors.fill: parent
                                model: Categories
                                clip: true
                                boundsBehavior: Flickable.StopAtBounds
                                ScrollBar.vertical: ScrollBar {}

                                delegate: SelectableRow {
                                    width: categoryList.width
                                    height: Omarchy.rowHeight + 6
                                    label: model.title
                                    selected: model.categoryId === window.selectedCategory
                                    onActivated: {
                                        window.selectedCategory = model.categoryId
                                        Groups.categoryId = model.categoryId
                                    }
                                }
                            }
                        }

                        Rectangle {
                            Layout.fillHeight: true
                            Layout.preferredWidth: 1
                            color: Omarchy.selection
                            visible: window.wide
                        }

                        DetailPane {
                            Layout.fillWidth: true
                            Layout.fillHeight: true
                            visible: window.wide || window.drilled
                            model: Groups
                            placeholder: "Select a category"
                            hasSelection: window.selectedCategory !== ""
                            onLinkActivated: function(link) { window.openLink(link) }
                        }
                    }

                    // ---------------- Tips ----------------
                    Loader {
                        active: window.section === 1
                        sourceComponent: tipsPage
                    }

                    // ---------------- Commands ----------------
                    RowLayout {
                        spacing: 0

                        ColumnLayout {
                            Layout.preferredWidth: 260
                            Layout.fillWidth: !window.wide
                            Layout.fillHeight: true
                            visible: window.wide || !window.drilled
                            spacing: 0

                            Rectangle {
                                Layout.fillWidth: true
                                Layout.preferredHeight: 40
                                color: Omarchy.darkBackground

                                TextField {
                                    id: search
                                    anchors.fill: parent
                                    anchors.margins: 5
                                    anchors.leftMargin: 8
                                    placeholderText: "Search commands"
                                    placeholderTextColor: Omarchy.muted
                                    color: Omarchy.brightForeground
                                    font.pixelSize: Omarchy.fontBody
                                    background: Rectangle {
                                        color: Omarchy.background
                                        border.color: search.activeFocus
                                            ? Omarchy.focusBorder : Omarchy.selection
                                        border.width: 1
                                    }
                                    // Debounce lives here rather than in a ViewModel, but
                                    // the interval matches SearchViewModel's so the two
                                    // frontends feel the same.
                                    onTextChanged: debounce.restart()
                                    Timer {
                                        id: debounce
                                        interval: 80
                                        onTriggered: Commands.query = search.text
                                    }
                                }
                            }

                            ListView {
                                id: commandList
                                Layout.fillWidth: true
                                Layout.fillHeight: true
                                model: Commands
                                clip: true
                                boundsBehavior: Flickable.StopAtBounds
                                ScrollBar.vertical: ScrollBar {}

                                delegate: SelectableRow {
                                    width: commandList.width
                                    height: Omarchy.rowHeight
                                    label: model.name
                                    selected: model.name === window.selectedCommand
                                    onActivated: window.showMan(model.name)
                                }
                            }
                        }

                        Rectangle {
                            Layout.fillHeight: true
                            Layout.preferredWidth: 1
                            color: Omarchy.selection
                            visible: window.wide
                        }

                        DetailPane {
                            Layout.fillWidth: true
                            Layout.fillHeight: true
                            visible: window.wide || window.drilled
                            model: Sections
                            placeholder: "Select a command"
                            hasSelection: window.selectedCommand !== ""
                            onLinkActivated: function(link) { window.openLink(link) }
                        }
                    }
                }
            }
        }

        NavRail {
            Layout.fillWidth: true
            Layout.preferredHeight: 56
            visible: !window.wide
            horizontal: true
            currentIndex: window.section
            onSelected: function(index) { window.section = index }
        }
    }
}
