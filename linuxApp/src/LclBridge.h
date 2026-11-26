#pragma once

#include <QAbstractListModel>
#include <QObject>
#include <QString>
#include <QVariantList>

#include "LclCore.h"

/**
 * Qt models over the content layer in LclCore. This base only holds the plumbing they
 * share.
 */
class LclListModel : public QAbstractListModel {
    Q_OBJECT

public:
    using QAbstractListModel::QAbstractListModel;

    int rowCount(const QModelIndex& parent = QModelIndex()) const override
    {
        return parent.isValid() ? 0 : count();
    }

protected:
    virtual int count() const = 0;

    bool has(const QModelIndex& index) const
    {
        return index.isValid() && index.row() >= 0 && index.row() < rowCount();
    }
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

    QVariant data(const QModelIndex& index, int role) const override;
    QHash<int, QByteArray> roleNames() const override { return { { TitleRole, "title" } }; }

    /** Blocks of one row as [{kind, text}, ...], for a Repeater inside a card. */
    Q_INVOKABLE QVariantList blocksAt(int index) const;

protected:
    int count() const override { return int(m_items.size()); }

    std::vector<lcl::Titled> m_items;
};

/** Rows are the current (optionally filtered) command list. */
class CommandsModel : public LclListModel {
    Q_OBJECT
    Q_PROPERTY(QString query READ query WRITE setQuery NOTIFY queryChanged)

public:
    enum Roles { NameRole = Qt::UserRole + 1 };

    explicit CommandsModel(QObject* parent = nullptr);

    QVariant data(const QModelIndex& index, int role) const override;
    QHash<int, QByteArray> roleNames() const override;

    QString query() const { return m_query; }
    void setQuery(const QString& query);

signals:
    void queryChanged();

protected:
    int count() const override { return int(m_results.size()); }

private:
    QString m_query;
    std::vector<std::string> m_results;
};

/** Sections of one command. */
class SectionsModel : public TitledBlocksModel {
    Q_OBJECT
    Q_PROPERTY(QString command READ command WRITE setCommand NOTIFY commandChanged)

public:
    using TitledBlocksModel::TitledBlocksModel;

    QString command() const { return m_command; }
    void setCommand(const QString& command);

signals:
    void commandChanged();

private:
    QString m_command;
};

/** The basics categories, in display order. */
class CategoriesModel : public LclListModel {
    Q_OBJECT

public:
    enum Roles { IdRole = Qt::UserRole + 1, TitleRole };

    using LclListModel::LclListModel;

    QVariant data(const QModelIndex& index, int role) const override;
    QHash<int, QByteArray> roleNames() const override;

protected:
    int count() const override;
};

/** Groups of one basics category. */
class GroupsModel : public TitledBlocksModel {
    Q_OBJECT
    Q_PROPERTY(QString categoryId READ categoryId WRITE setCategoryId NOTIFY categoryIdChanged)

public:
    using TitledBlocksModel::TitledBlocksModel;

    QString categoryId() const { return m_categoryId; }
    void setCategoryId(const QString& id);

signals:
    void categoryIdChanged();

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

/** Loads the command index. Call once, before the models. */
void lclStart();
