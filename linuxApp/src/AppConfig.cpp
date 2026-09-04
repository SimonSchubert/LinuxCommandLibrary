#include "AppConfig.h"

#include "TomlFile.h"

#include <QDir>

QString AppConfig::path()
{
    const QByteArray xdg = qgetenv("XDG_CONFIG_HOME");
    const QString base = xdg.isEmpty() ? QDir::homePath() + "/.config" : QString::fromUtf8(xdg);
    return base + "/lcl/config.toml";
}

AppConfig::AppConfig(QObject* parent)
    : QObject(parent)
{
    const TomlFile toml = TomlFile::read(path());

    m_followOmarchy = toml.boolean({}, QStringLiteral("follow_omarchy"), m_followOmarchy);
    m_fontFamily = toml.value({}, QStringLiteral("font_family"), m_fontFamily);
    m_fontScale = qBound(0.5, toml.number({}, QStringLiteral("font_scale"), m_fontScale), 4.0);
    m_compactBelow = toml.integer({}, QStringLiteral("compact_below"), m_compactBelow);

    const QString section = toml.value({}, QStringLiteral("start_section")).toLower();
    if (section == QLatin1String("basics"))
        m_startSection = 0;
    else if (section == QLatin1String("tips"))
        m_startSection = 1;
    else if (section == QLatin1String("commands"))
        m_startSection = 2;

    for (const char* key : { "accent", "selection", "muted", "background", "dark_background",
                             "lighter_background", "foreground", "bright_foreground" }) {
        const QString name = QString::fromLatin1(key);
        if (toml.contains(QStringLiteral("colors"), name))
            m_colors.insert(name, toml.value(QStringLiteral("colors"), name));
    }
}
