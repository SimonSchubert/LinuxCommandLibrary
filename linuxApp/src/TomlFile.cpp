#include "TomlFile.h"

#include <QFile>
#include <QTextStream>

TomlFile TomlFile::read(const QString& path)
{
    TomlFile toml;
    // An absent theme is normal, and QFile warns when opened with an empty name.
    if (path.isEmpty())
        return toml;

    QFile file(path);
    if (!file.open(QIODevice::ReadOnly | QIODevice::Text))
        return toml;

    QString section;
    QTextStream stream(&file);
    while (!stream.atEnd()) {
        const QString line = stream.readLine().trimmed();
        if (line.isEmpty() || line.startsWith('#'))
            continue;

        if (line.startsWith('[') && line.endsWith(']')) {
            section = line.mid(1, line.size() - 2).trimmed();
            continue;
        }

        const int eq = line.indexOf('=');
        if (eq <= 0)
            continue;

        QString value = line.mid(eq + 1).trimmed();
        // Strip a trailing inline comment before unquoting, but not inside a string.
        if (!value.startsWith('"')) {
            const int hash = value.indexOf('#');
            if (hash >= 0)
                value = value.left(hash).trimmed();
        } else if (value.count('"') >= 2) {
            value = value.mid(1, value.lastIndexOf('"') - 1);
        }
        toml.m_sections[section].insert(line.left(eq).trimmed(), value);
    }
    return toml;
}

bool TomlFile::contains(const QString& section, const QString& key) const
{
    return m_sections.value(section).contains(key);
}

QString TomlFile::value(const QString& section, const QString& key, const QString& fallback) const
{
    const QString found = m_sections.value(section).value(key);
    return found.isEmpty() ? fallback : found;
}

double TomlFile::number(const QString& section, const QString& key, double fallback) const
{
    bool ok = false;
    const double parsed = m_sections.value(section).value(key).toDouble(&ok);
    return ok ? parsed : fallback;
}

int TomlFile::integer(const QString& section, const QString& key, int fallback) const
{
    bool ok = false;
    const int parsed = m_sections.value(section).value(key).toInt(&ok);
    return ok ? parsed : fallback;
}

bool TomlFile::boolean(const QString& section, const QString& key, bool fallback) const
{
    const QString found = m_sections.value(section).value(key);
    if (found.isEmpty())
        return fallback;
    return found.compare(QLatin1String("true"), Qt::CaseInsensitive) == 0 || found == QLatin1String("1");
}
