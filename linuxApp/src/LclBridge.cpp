#include "LclBridge.h"

#include "liblcl_api.h"

namespace {

liblcl_ExportedSymbols* lib()
{
    static liblcl_ExportedSymbols* symbols = liblcl_symbols();
    return symbols;
}

// Every const char* the Kotlin side returns is owned by us and must be disposed.
QString take(const char* value)
{
    if (!value)
        return QString();
    const QString result = QString::fromUtf8(value);
    lib()->DisposeString(value);
    return result;
}

auto& lclApi()
{
    return lib()->kotlin.root.com.linuxcommandlibrary.app.nativeapi.LclApi;
}

auto api()
{
    static auto instance = lclApi()._instance();
    return instance;
}

// Blocks are fetched the same way for sections, groups and tips; only the three
// accessors differ.
template <typename Kind, typename Text>
QVariantList collectBlocks(int count, Kind kind, Text text)
{
    QVariantList blocks;
    blocks.reserve(count);
    for (int i = 0; i < count; ++i) {
        blocks.append(QVariantMap {
            { QStringLiteral("kind"), take(kind(i)) },
            { QStringLiteral("text"), take(text(i)) },
        });
    }
    return blocks;
}

} // namespace

void lclStart()
{
    lclApi().start(api());
}

// --- Commands ---

int CommandsModel::countNow() const
{
    return lclApi().resultCount(api());
}

QVariant CommandsModel::data(const QModelIndex& index, int role) const
{
    if (!has(index) || role != NameRole)
        return {};
    return take(lclApi().resultName(api(), index.row()));
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
    lclApi().setQuery(api(), query.toUtf8().constData());
    resetTo(lclApi().resultCount(api()));
    emit queryChanged();
}

// --- Command sections ---

int SectionsModel::countNow() const
{
    return lclApi().sectionCount(api());
}

QVariant SectionsModel::data(const QModelIndex& index, int role) const
{
    if (!has(index) || role != TitleRole)
        return {};
    return take(lclApi().sectionTitle(api(), index.row()));
}

QVariantList SectionsModel::blocksAt(int index) const
{
    return collectBlocks(
        lclApi().sectionBlockCount(api(), index),
        [index](int block) { return lclApi().sectionBlockKind(api(), index, block); },
        [index](int block) { return lclApi().sectionBlockText(api(), index, block); });
}

void SectionsModel::setCommand(const QString& command)
{
    if (command == m_command)
        return;
    m_command = command;
    // The selection is pushed once here, so the row reads below are index-only.
    lclApi().selectCommand(api(), command.toUtf8().constData());
    resetTo(lclApi().sectionCount(api()));
    emit commandChanged();
}

// --- Basics categories ---

int CategoriesModel::countNow() const
{
    return lclApi().categoryCount(api());
}

QVariant CategoriesModel::data(const QModelIndex& index, int role) const
{
    if (!has(index))
        return {};
    if (role == IdRole)
        return take(lclApi().categoryId(api(), index.row()));
    if (role == TitleRole)
        return take(lclApi().categoryTitle(api(), index.row()));
    return {};
}

QHash<int, QByteArray> CategoriesModel::roleNames() const
{
    return { { IdRole, "categoryId" }, { TitleRole, "title" } };
}

// --- Groups of a category ---

int GroupsModel::countNow() const
{
    return lclApi().groupCount(api());
}

QVariant GroupsModel::data(const QModelIndex& index, int role) const
{
    if (!has(index) || role != TitleRole)
        return {};
    return take(lclApi().groupTitle(api(), index.row()));
}

QVariantList GroupsModel::blocksAt(int index) const
{
    return collectBlocks(
        lclApi().groupBlockCount(api(), index),
        [index](int block) { return lclApi().groupBlockKind(api(), index, block); },
        [index](int block) { return lclApi().groupBlockText(api(), index, block); });
}

void GroupsModel::setCategoryId(const QString& id)
{
    if (id == m_categoryId)
        return;
    m_categoryId = id;
    lclApi().selectCategory(api(), id.toUtf8().constData());
    resetTo(lclApi().groupCount(api()));
    emit categoryIdChanged();
}

// --- Tips ---

int Tips::count() const
{
    return lclApi().tipCount(api());
}

QString Tips::titleAt(int index) const
{
    return take(lclApi().tipTitle(api(), index));
}

int Tips::weightAt(int index) const
{
    return lclApi().tipWeight(api(), index);
}

QVariantList Tips::blocksAt(int index) const
{
    return collectBlocks(
        lclApi().tipBlockCount(api(), index),
        [index](int block) { return lclApi().tipBlockKind(api(), index, block); },
        [index](int block) { return lclApi().tipBlockText(api(), index, block); });
}
