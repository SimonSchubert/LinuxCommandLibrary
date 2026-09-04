#pragma once

#include <QAbstractListModel>
#include <QObject>
#include <QString>
#include <QVariantList>

/**
 * Shared plumbing for the bridge models: a row count that is fetched on first use and
 * a reset helper. Counting lazily keeps asset parsing off the startup path for the
 * sections the user has not opened.
 */
class LclListModel : public QAbstractListModel {
    Q_OBJECT

public:
    using QAbstractListModel::QAbstractListModel;

    int rowCount(const QModelIndex& parent = QModelIndex()) const override
    {
        if (parent.isValid())
            return 0;
        if (m_count < 0)
            m_count = countNow();
        return m_count;
    }

protected:
    /** Current size according to the shared layer. Called once, then cached. */
    virtual int countNow() const { return 0; }

    bool has(const QModelIndex& index) const
    {
        return index.isValid() && index.row() >= 0 && index.row() < rowCount();
    }

    void resetTo(int count)
    {
        beginResetModel();
        m_count = count;
        endResetModel();
    }

private:
    mutable int m_count = -1;
};

/**
 * Base for the models whose rows are a title plus a list of content blocks. Every
 * content surface in the app has that shape, so they all render through one card.
 */
class TitledBlocksModel : public LclListModel {
    Q_OBJECT

public:
    enum Roles { TitleRole = Qt::UserRole + 1 };

    using LclListModel::LclListModel;

    QHash<int, QByteArray> roleNames() const override { return { { TitleRole, "title" } }; }

    /** Blocks of one row as [{kind, text}, ...], for a Repeater inside a card. */
    Q_INVOKABLE virtual QVariantList blocksAt(int index) const = 0;
};

/** Rows are the current (optionally filtered) command list. */
class CommandsModel : public LclListModel {
    Q_OBJECT
    Q_PROPERTY(QString query READ query WRITE setQuery NOTIFY queryChanged)

public:
    enum Roles { NameRole = Qt::UserRole + 1 };

    using LclListModel::LclListModel;

    QVariant data(const QModelIndex& index, int role) const override;
    QHash<int, QByteArray> roleNames() const override;

    QString query() const { return m_query; }
    void setQuery(const QString& query);

signals:
    void queryChanged();

protected:
    int countNow() const override;

private:
    QString m_query;
};

/** Sections of one command, parsed by the shared MarkdownParser. */
class SectionsModel : public TitledBlocksModel {
    Q_OBJECT
    Q_PROPERTY(QString command READ command WRITE setCommand NOTIFY commandChanged)

public:
    using TitledBlocksModel::TitledBlocksModel;

    QVariant data(const QModelIndex& index, int role) const override;
    QVariantList blocksAt(int index) const override;

    QString command() const { return m_command; }
    void setCommand(const QString& command);

signals:
    void commandChanged();

protected:
    int countNow() const override;

private:
    QString m_command;
};

/** The basics categories, in the shared layer's own display order. */
class CategoriesModel : public LclListModel {
    Q_OBJECT

public:
    enum Roles { IdRole = Qt::UserRole + 1, TitleRole };

    using LclListModel::LclListModel;

    QVariant data(const QModelIndex& index, int role) const override;
    QHash<int, QByteArray> roleNames() const override;

protected:
    int countNow() const override;
};

/** Groups of one basics category, rendered to Markdown by the shared layer. */
class GroupsModel : public TitledBlocksModel {
    Q_OBJECT
    Q_PROPERTY(QString categoryId READ categoryId WRITE setCategoryId NOTIFY categoryIdChanged)

public:
    using TitledBlocksModel::TitledBlocksModel;

    QVariant data(const QModelIndex& index, int role) const override;
    QVariantList blocksAt(int index) const override;

    QString categoryId() const { return m_categoryId; }
    void setCategoryId(const QString& id);

signals:
    void categoryIdChanged();

protected:
    int countNow() const override;

private:
    QString m_categoryId;
};

/**
 * Tips, read imperatively rather than through a delegate: the cards lay themselves out
 * across balanced columns, so QML addresses tips by index instead of binding a view.
 */
class Tips : public QObject {
    Q_OBJECT

public:
    using QObject::QObject;

    Q_INVOKABLE int count() const;
    Q_INVOKABLE QString titleAt(int index) const;
    /** Rough rendered size, for balancing the card columns without rendering anything. */
    Q_INVOKABLE int weightAt(int index) const;
    /** Blocks of one tip as [{kind, text}, ...], for a Repeater inside a card. */
    Q_INVOKABLE QVariantList blocksAt(int index) const;
};

/** Starts the Kotlin runtime and loads the command index. Call once, before the models. */
void lclStart();
