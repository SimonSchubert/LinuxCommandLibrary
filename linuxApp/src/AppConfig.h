#pragma once

#include <QHash>
#include <QObject>
#include <QString>

/**
 * User settings from $XDG_CONFIG_HOME/lcl/config.toml (default ~/.config/lcl/config.toml).
 *
 * Deliberately does not duplicate the palette: colours come from the active Omarchy
 * theme so switching themes restyles the app for free. This file is for what Omarchy
 * has no opinion on — type scale, the layout breakpoint, which section opens first —
 * plus an escape hatch to pin colours or stop following the theme entirely.
 *
 * Every key is optional and the file need not exist.
 */
class AppConfig : public QObject {
    Q_OBJECT
    Q_PROPERTY(int compactBelow MEMBER m_compactBelow CONSTANT)
    Q_PROPERTY(int startSection MEMBER m_startSection CONSTANT)

public:
    explicit AppConfig(QObject* parent = nullptr);

    bool followOmarchy() const { return m_followOmarchy; }
    QString fontFamily() const { return m_fontFamily; }
    qreal fontScale() const { return m_fontScale; }
    /** Explicit colour overrides, applied on top of the theme. Keys match colors.toml. */
    QHash<QString, QString> colorOverrides() const { return m_colors; }

    static QString path();

private:
    bool m_followOmarchy = true;
    QString m_fontFamily = QStringLiteral("monospace");
    qreal m_fontScale = 1.0;
    int m_compactBelow = 700;
    // 0 Basics, 1 Tips, 2 Commands.
    int m_startSection = 2;
    QHash<QString, QString> m_colors;
};
