#pragma once

#include <QHash>
#include <QString>

/**
 * Minimal reader for the flat "key = value" TOML that Omarchy themes and this app's
 * own config use: section headers, string/number values, comments. Not a general TOML
 * implementation — it exists so colors.toml, shell.toml and config.toml share one
 * parser rather than three, and so the app needs no TOML dependency.
 *
 * Keys outside any section are stored under the empty section name.
 */
class TomlFile {
public:
    /** Returns an empty file if the path does not exist or cannot be read. */
    static TomlFile read(const QString& path);

    bool contains(const QString& section, const QString& key) const;
    QString value(const QString& section, const QString& key, const QString& fallback = {}) const;
    double number(const QString& section, const QString& key, double fallback) const;
    int integer(const QString& section, const QString& key, int fallback) const;
    bool boolean(const QString& section, const QString& key, bool fallback) const;

private:
    QHash<QString, QHash<QString, QString>> m_sections;
};
