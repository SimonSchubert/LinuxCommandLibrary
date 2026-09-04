import QtQuick
import QtQuick.Controls

// Tips are short and vary a lot in length, so they get a reflowing card grid rather
// than a list and a detail pane, which left most of the window empty. Columns are
// filled shortest-first using the shared layer's cheap size estimate, which
// approximates a staggered grid without needing a layout pass to measure.
Flickable {
    id: root

    property int spacing: Omarchy.gap
    property int minColumnWidth: 340
    signal linkActivated(string link)

    readonly property int columnCount: Math.max(1, Math.floor(width / minColumnWidth))

    // A binding rather than an imperative rebuild, so there is nothing to keep in sync.
    // Empty until the width is known: the first pass runs before the layout has sized
    // this item, and assigning every tip to one column then would build each card twice.
    readonly property var buckets: {
        let assigned = []
        let load = []
        for (let c = 0; c < columnCount; c++) {
            assigned.push([])
            load.push(0)
        }
        if (width > 0) {
            for (let i = 0; i < Tips.count(); i++) {
                let shortest = 0
                for (let c = 1; c < columnCount; c++)
                    if (load[c] < load[shortest])
                        shortest = c
                assigned[shortest].push(i)
                load[shortest] += Tips.weightAt(i) + 90
            }
        }
        return assigned
    }

    contentWidth: width
    contentHeight: columns.height
    clip: true
    boundsBehavior: Flickable.StopAtBounds
    ScrollBar.vertical: ScrollBar {}

    Row {
        id: columns
        width: root.width
        spacing: root.spacing

        Repeater {
            model: root.columnCount

            Column {
                required property int index
                width: (root.width - (root.columnCount - 1) * root.spacing) / root.columnCount
                spacing: root.spacing

                Repeater {
                    model: root.buckets[parent.index]

                    ContentCard {
                        required property int modelData
                        width: parent.width
                        title: Tips.titleAt(modelData)
                        blocks: Tips.blocksAt(modelData)
                        onLinkActivated: function(link) { root.linkActivated(link) }
                    }
                }
            }
        }
    }
}
