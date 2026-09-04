#include "AppConfig.h"
#include "IconProvider.h"
#include "LclBridge.h"
#include "OmarchyTheme.h"

#include <QFont>
#include <QGuiApplication>
#include <QQmlApplicationEngine>
#include <QQmlContext>
#include <QElapsedTimer>
#include <QPalette>

int main(int argc, char* argv[])
{
    QGuiApplication app(argc, argv);
    app.setApplicationName(QStringLiteral("Linux Command Library"));
    app.setDesktopFileName(QStringLiteral("lcl-gui"));
    // Set once here rather than threaded through every QML item: Qt Quick inherits the
    // application font, so no element needs its own font.family.
    auto* config = new AppConfig(&app);
    app.setFont(QFont(config->fontFamily()));

    // Startup timing, printed when LCL_TIMING is set. Written straight to stderr
    // rather than through qDebug, whose categories can be filtered off by a
    // distribution's qtlogging.ini.
    QElapsedTimer clock;
    clock.start();
    const bool timing = !qEnvironmentVariableIsEmpty("LCL_TIMING");
    const auto mark = [&clock, timing](const char* phase) {
        if (!timing)
            return;
        fprintf(stderr, "lcl.startup %-24s %6lld ms\n", phase, clock.elapsed());
        fflush(stderr);
    };

    lclStart();
    mark("kotlin runtime + index");

    QQmlApplicationEngine engine;
    engine.addImageProvider(QStringLiteral("icons"), new IconProvider);
    auto* theme = new OmarchyTheme(config, &app);
    mark("theme");
    auto* commands = new CommandsModel(&app);
    mark("commands model");
    auto* sections = new SectionsModel(&app);
    auto* categories = new CategoriesModel(&app);
    mark("categories model");
    auto* groups = new GroupsModel(&app);
    auto* tips = new Tips(&app);
    mark("tips model");

    engine.rootContext()->setContextProperty(QStringLiteral("Omarchy"), theme);
    engine.rootContext()->setContextProperty(QStringLiteral("Config"), config);
    engine.rootContext()->setContextProperty(QStringLiteral("Commands"), commands);
    engine.rootContext()->setContextProperty(QStringLiteral("Sections"), sections);
    engine.rootContext()->setContextProperty(QStringLiteral("Categories"), categories);
    engine.rootContext()->setContextProperty(QStringLiteral("Groups"), groups);
    engine.rootContext()->setContextProperty(QStringLiteral("Tips"), tips);

    // `lcl-gui <command>`, `lcl-gui basic:<id>` and `lcl-gui tips` mirror the
    // linuxcommandlibrary://man/<cmd> and ://basic/<id> deep links the mobile apps
    // already handle, so the same routes work from a terminal or a .desktop entry.
    const QStringList args = app.arguments();
    engine.rootContext()->setContextProperty(QStringLiteral("InitialRoute"),
                                             args.size() > 1 ? args.at(1) : QString());

    // Text.linkColor has no effect on Text.MarkdownText: anchors are painted from
    // the palette's Link role, so the accent has to be pushed there instead.
    const auto applyLinkColor = [&app, theme] {
        QPalette palette = app.palette();
        palette.setColor(QPalette::Link, theme->accent());
        palette.setColor(QPalette::LinkVisited, theme->accent());
        app.setPalette(palette);
    };
    applyLinkColor();
    QObject::connect(theme, &OmarchyTheme::changed, &app, applyLinkColor);

    engine.load(QUrl(QStringLiteral("qrc:/qml/Main.qml")));
    mark("qml load");
    if (engine.rootObjects().isEmpty())
        return 1;

    return app.exec();
}
