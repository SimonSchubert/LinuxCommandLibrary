#pragma once

#include <QColor>
#include <QFileSystemWatcher>
#include <QObject>
#include <QString>
#include <QTimer>

class AppConfig;
class TomlFile;

/**
 * Publishes the active Omarchy theme as QML properties: colours from colors.toml and
 * proportions from shell.toml, the same file Omarchy's own Quickshell reads into its
 * Color and Style singletons. Following shell.toml is what makes the app scale with
 * the desktop rather than merely share its palette.
 *
 * Omarchy 4 keeps the active theme at ~/.local/state/omarchy/current/theme; Omarchy 3
 * used ~/.config/omarchy/current/theme. Every key is optional: with no theme at all the
 * built-in dark defaults apply, so the app still runs off Omarchy.
 *
 * Values are resolved once per load and exposed as plain members. QML does not cache
 * property reads and these are read several times per list row.
 */
class OmarchyTheme : public QObject {
    Q_OBJECT

    // Palette
    Q_PROPERTY(QColor background MEMBER m_background NOTIFY changed)
    Q_PROPERTY(QColor darkBackground MEMBER m_darkBackground NOTIFY changed)
    Q_PROPERTY(QColor lighterBackground MEMBER m_lighterBackground NOTIFY changed)
    Q_PROPERTY(QColor foreground MEMBER m_foreground NOTIFY changed)
    Q_PROPERTY(QColor brightForeground MEMBER m_brightForeground NOTIFY changed)
    Q_PROPERTY(QColor accent MEMBER m_accent NOTIFY changed)
    Q_PROPERTY(QColor selection MEMBER m_selection NOTIFY changed)
    Q_PROPERTY(QColor muted MEMBER m_muted NOTIFY changed)

    // Surface roles taken from the shell's own menu/launcher surfaces, so a selected
    // row here reads the same as a selected row in the Omarchy launcher.
    Q_PROPERTY(QColor selectedBackground MEMBER m_selectedBackground NOTIFY changed)
    Q_PROPERTY(QColor selectedText MEMBER m_selectedText NOTIFY changed)
    Q_PROPERTY(QColor focusBorder MEMBER m_focusBorder NOTIFY changed)

    // Type scale derived from [font] base-size, then the user's font_scale.
    Q_PROPERTY(int fontCaption MEMBER m_fontCaption NOTIFY changed)
    Q_PROPERTY(int fontBody MEMBER m_fontBody NOTIFY changed)
    Q_PROPERTY(int fontSubtitle MEMBER m_fontSubtitle NOTIFY changed)
    Q_PROPERTY(int fontHeading MEMBER m_fontHeading NOTIFY changed)

    // Metrics, scaled by [spacing] scale. The base values are this app's own, so the
    // shell's scale adjusts them without imposing the shell's absolute paddings.
    Q_PROPERTY(int gap MEMBER m_gap NOTIFY changed)
    Q_PROPERTY(int pad MEMBER m_pad NOTIFY changed)
    Q_PROPERTY(int rowHeight MEMBER m_rowHeight NOTIFY changed)

public:
    explicit OmarchyTheme(const AppConfig* config, QObject* parent = nullptr);

    QColor accent() const { return m_accent; }

signals:
    void changed();

private:
    void reload();
    QColor colorOf(const TomlFile& colors, const char* key, const char* fallback) const;
    static QString themeDir();

    const AppConfig* m_config;

    QColor m_background;
    QColor m_darkBackground;
    QColor m_lighterBackground;
    QColor m_foreground;
    QColor m_brightForeground;
    QColor m_accent;
    QColor m_selection;
    QColor m_muted;
    QColor m_selectedBackground;
    QColor m_selectedText;
    QColor m_focusBorder;

    int m_fontCaption = 10;
    int m_fontBody = 12;
    int m_fontSubtitle = 13;
    int m_fontHeading = 16;
    int m_gap = 8;
    int m_pad = 10;
    int m_rowHeight = 28;

    QFileSystemWatcher m_watcher;
    // A theme switch is several filesystem operations (remove, move, write
    // theme.name), so reloading on the first event reads a half-applied theme.
    QTimer m_settle;
};
