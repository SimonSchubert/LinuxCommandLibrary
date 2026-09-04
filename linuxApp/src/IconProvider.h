#pragma once

#include <QQuickImageProvider>
#include <QString>

/**
 * Serves the shared /icons SVGs tinted to an arbitrary colour.
 *
 * The icons are single monochrome paths, so they have to be recoloured to follow the
 * Omarchy palette. Tinting is done here rather than with a QtQuick MultiEffect because
 * shader effects do not run under the software renderer, which is what a VM or a
 * machine without working GPU drivers falls back to.
 *
 * URL form: image://icons/<name>/<rrggbb>, e.g. image://icons/ic_puzzle/7aa2f7
 */
class IconProvider : public QQuickImageProvider {
public:
    IconProvider();

    QImage requestImage(const QString& id, QSize* size, const QSize& requestedSize) override;

private:
    QString m_dir;
};
