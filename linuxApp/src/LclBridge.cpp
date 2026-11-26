#include "LclBridge.h"

namespace {

// Packages install the assets under /usr/share/lcl/assets; LCL_ASSETS_DIR overrides
// that for development.
lcl::Library& library()
{
    const QString dir = qEnvironmentVariable("LCL_ASSETS_DIR");
    static lcl::Library instance(dir.isEmpty() ? "/usr/share/lcl/assets" : dir.toStdString());
    return instance;
}

QVariantList blocksOf(const std::vector<lcl::Titled>& items, int index)
{
    QVariantList blocks;
    if (index < 0 || index >= int(items.size()))
        return blocks;
    for (const lcl::Block& block : items[index].blocks) {
        blocks.append(QVariantMap {
            { QStringLiteral("kind"), QString::fromLatin1(block.kind) },
            { QStringLiteral("text"), QString::fromStdString(block.text) },
        });
    }
    return blocks;
}

} // namespace

void lclStart()
{
    library().commands();
}

// --- Titled rows: command sections and basics groups ---

QVariant TitledBlocksModel::data(const QModelIndex& index, int role) const
{
    if (!has(index) || role != TitleRole)
        return {};
    return QString::fromStdString(m_items[index.row()].title);
}

QVariantList TitledBlocksModel::blocksAt(int index) const
{
    return blocksOf(m_items, index);
}

// --- Commands ---

CommandsModel::CommandsModel(QObject* parent)
    : LclListModel(parent)
    , m_results(library().commands())
{
}

QVariant CommandsModel::data(const QModelIndex& index, int role) const
{
    if (!has(index) || role != NameRole)
        return {};
    return QString::fromStdString(m_results[index.row()]);
}

QHash<int, QByteArray> CommandsModel::roleNames() const
{
    return { { NameRole, "name" } };
}

void CommandsModel::setQuery(const QString& query)
{
    if (query == m_query)
        return;
    m_query = query;
    beginResetModel();
    m_results = library().search(query.toStdString());
    endResetModel();
    emit queryChanged();
}

// --- Command sections ---

void SectionsModel::setCommand(const QString& command)
{
    if (command == m_command)
        return;
    m_command = command;
    beginResetModel();
    m_items = library().sections(command.toStdString());
    endResetModel();
    emit commandChanged();
}

// --- Basics categories ---

int CategoriesModel::count() const
{
    return int(library().categories().size());
}

QVariant CategoriesModel::data(const QModelIndex& index, int role) const
{
    if (!has(index))
        return {};
    const lcl::Category& category = library().categories()[index.row()];
    if (role == IdRole)
        return QString::fromStdString(category.id);
    if (role == TitleRole)
        return QString::fromStdString(category.title);
    return {};
}

QHash<int, QByteArray> CategoriesModel::roleNames() const
{
    return { { IdRole, "categoryId" }, { TitleRole, "title" } };
}

// --- Groups of a category ---

void GroupsModel::setCategoryId(const QString& id)
{
    if (id == m_categoryId)
        return;
    m_categoryId = id;
    beginResetModel();
    m_items = library().groups(id.toStdString());
    endResetModel();
    emit categoryIdChanged();
}

// --- Tips ---

int Tips::count() const
{
    return int(library().tips().size());
}

QString Tips::titleAt(int index) const
{
    const auto& tips = library().tips();
    return index >= 0 && index < int(tips.size()) ? QString::fromStdString(tips[index].title) : QString();
}

int Tips::weightAt(int index) const
{
    const auto& tips = library().tips();
    return index >= 0 && index < int(tips.size()) ? lcl::weight(tips[index]) : 0;
}

QVariantList Tips::blocksAt(int index) const
{
    return blocksOf(library().tips(), index);
}
