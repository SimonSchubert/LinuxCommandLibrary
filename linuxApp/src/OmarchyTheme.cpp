#include "OmarchyTheme.h"

#include "AppConfig.h"
#include "TomlFile.h"

#include <QDir>
#include <QFileInfo>

namespace {

// Omarchy 4 first, then the Omarchy 3 location, then an explicit override for testing.
QStringList candidateDirs()
{
    QStringList dirs;
    const QByteArray override = qgetenv("LCL_OMARCHY_THEME");
    if (!override.isEmpty())
        dirs << QString::fromUtf8(override);
    const QString home = QDir::homePath();
    dirs << home + "/.local/state/omarchy/current/theme";
    dirs << home + "/.config/omarchy/current/theme";
    return dirs;
}

/** Blend a shell.toml colour with its "-alpha" companion over a background. */
QColor withAlpha(const QColor& colour, double alpha, const QColor& over)
{
    if (!colour.isValid())
        return over;
    const double a = qBound(0.0, alpha, 1.0);
    return QColor::fromRgbF(
        colour.redF() * a + over.redF() * (1 - a),
        colour.greenF() * a + over.greenF() * (1 - a),
        colour.blueF() * a + over.blueF() * (1 - a));
}

} // namespace

QString OmarchyTheme::themeDir()
{
    for (const QString& dir : candidateDirs()) {
        if (QFileInfo::exists(dir + "/colors.toml"))
            return dir;
    }
    return QString();
}

OmarchyTheme::OmarchyTheme(const AppConfig* config, QObject* parent)
    : QObject(parent)
    , m_config(config)
{
    m_settle.setSingleShot(true);
    m_settle.setInterval(150);
    connect(&m_settle, &QTimer::timeout, this, &OmarchyTheme::reload);

    reload();

    // The theme directory is replaced wholesale by omarchy-theme-set, so watch the
    // parent too: watching only the file loses the watch when it is replaced.
    connect(&m_watcher, &QFileSystemWatcher::fileChanged, &m_settle, qOverload<>(&QTimer::start));
    connect(&m_watcher, &QFileSystemWatcher::directoryChanged, &m_settle, qOverload<>(&QTimer::start));
}

void OmarchyTheme::reload()
{
    const QString dir = m_config->followOmarchy() ? themeDir() : QString();
    const TomlFile colors = TomlFile::read(dir.isEmpty() ? QString() : dir + "/colors.toml");
    const TomlFile shell = TomlFile::read(dir.isEmpty() ? QString() : dir + "/shell.toml");

    if (!dir.isEmpty()) {
        const QString parent = QFileInfo(dir).dir().absolutePath();
        for (const QString& path : { dir + "/colors.toml", dir, parent }) {
            if (!m_watcher.files().contains(path) && !m_watcher.directories().contains(path))
                m_watcher.addPath(path);
        }
    }

    m_background = colorOf(colors, "background", "#1a1b26");
    m_darkBackground = colorOf(colors, "dark_background", "#13141c");
    m_lighterBackground = colorOf(colors, "lighter_background", "#24283b");
    m_foreground = colorOf(colors, "foreground", "#a9b1d6");
    m_brightForeground = colorOf(colors, "bright_foreground", "#c0caf5");
    m_accent = colorOf(colors, "accent", "#7aa2f7");
    m_selection = colorOf(colors, "selection", "#292e42");
    m_muted = colorOf(colors, "muted", "#414868");

    // Selection follows the shell's menu surface when shell.toml is present, so a
    // highlighted row matches the launcher; otherwise the palette's own selection.
    const QString menu = QStringLiteral("menu");
    const QColor menuSelected(shell.value(menu, QStringLiteral("selected-background")));
    m_selectedBackground = menuSelected.isValid()
        ? withAlpha(menuSelected, shell.number(menu, QStringLiteral("selected-background-alpha"), 0.08), m_background)
        : m_selection;
    const QColor menuSelectedText(shell.value(menu, QStringLiteral("selected-text")));
    m_selectedText = menuSelectedText.isValid() ? menuSelectedText : m_brightForeground;

    const QString controls = QStringLiteral("controls");
    const QColor focus(shell.value(controls, QStringLiteral("focus-border")));
    m_focusBorder = focus.isValid()
        ? withAlpha(focus, shell.number(controls, QStringLiteral("focus-border-alpha"), 0.25), m_background)
        : m_accent;

    // [font] base-size is the rem root of the shell's type scale; the documented
    // ratios put body at the base, subtitle ~1.083 and heading ~1.333.
    const QString font = QStringLiteral("font");
    const double base = shell.number(font, QStringLiteral("base-size"), 12.0);
    const double scale = m_config->fontScale();
    const auto token = [&](const char* key, double ratio) {
        const double px = shell.number(font, QString::fromLatin1(key), base * ratio);
        return qMax(1, qRound(px * scale));
    };
    m_fontCaption = token("caption", 0.833);
    m_fontBody = token("body", 1.0);
    m_fontSubtitle = token("subtitle", 1.083);
    m_fontHeading = token("heading", 1.333);

    // [spacing] scale multiplies the shell's own proportions; apply it to this app's
    // base metrics rather than adopting the shell's absolute paddings, which are sized
    // for panels rather than a dense reference list.
    const double spacing = shell.number(QStringLiteral("spacing"), QStringLiteral("scale"), 1.0);
    m_gap = qMax(1, qRound(8 * spacing));
    m_pad = qMax(1, qRound(10 * spacing));
    m_rowHeight = qMax(12, qRound(28 * spacing * scale));

    emit changed();
}

QColor OmarchyTheme::colorOf(const TomlFile& colors, const char* key, const char* fallback) const
{
    const QString name = QString::fromLatin1(key);
    // An explicit override in the user's config wins over the theme.
    const QColor overridden(m_config->colorOverrides().value(name));
    if (overridden.isValid())
        return overridden;
    const QColor parsed(colors.value(QString(), name));
    return parsed.isValid() ? parsed : QColor(QString::fromLatin1(fallback));
}
