#include "IconProvider.h"

#include <QFile>
#include <QPainter>
#include <QSvgRenderer>

IconProvider::IconProvider()
    : QQuickImageProvider(QQuickImageProvider::Image)
{
    const QByteArray dir = qgetenv("LCL_ICONS_DIR");
    m_dir = dir.isEmpty() ? QStringLiteral("/usr/share/lcl/icons") : QString::fromUtf8(dir);
}

QImage IconProvider::requestImage(const QString& id, QSize* size, const QSize& requestedSize)
{
    const int slash = id.lastIndexOf('/');
    const QString name = slash > 0 ? id.left(slash) : id;
    const QColor tint = slash > 0 ? QColor('#' + id.mid(slash + 1)) : QColor();

    const QSize target = requestedSize.isValid() && !requestedSize.isEmpty()
        ? requestedSize
        : QSize(24, 24);
    if (size)
        *size = target;

    QImage image(target, QImage::Format_ARGB32_Premultiplied);
    image.fill(Qt::transparent);

    // Shared icons come from /icons; anything the mobile apps define in code rather
    // than as an SVG (the back arrow) is bundled with this app instead.
    QFile file(m_dir + "/" + name + ".svg");
    if (!file.open(QIODevice::ReadOnly)) {
        file.setFileName(":/icons/" + name + ".svg");
        if (!file.open(QIODevice::ReadOnly))
            return image;
    }

    QSvgRenderer renderer(file.readAll());
    if (!renderer.isValid())
        return image;

    QPainter painter(&image);
    painter.setRenderHint(QPainter::Antialiasing, true);
    renderer.render(&painter);

    // Recolour by compositing over the rendered alpha. Painting the fill through the
    // mask works whatever the source declares; only 78 of the 188 shared icons carry
    // the hardcoded white fill that a text substitution would have relied on.
    if (tint.isValid()) {
        painter.setCompositionMode(QPainter::CompositionMode_SourceIn);
        painter.fillRect(image.rect(), tint);
    }

    return image;
}
