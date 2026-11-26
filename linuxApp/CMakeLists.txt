cmake_minimum_required(VERSION 3.21)
project(lcl-gui LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_AUTOMOC ON)

find_package(Qt6 REQUIRED COMPONENTS Core Gui Qml Quick Svg)
qt_standard_project_setup()

qt_add_executable(lcl-gui
    src/main.cpp
    src/LclBridge.cpp
    src/LclCore.cpp
    src/OmarchyTheme.cpp
    src/IconProvider.cpp
    src/AppConfig.cpp
    src/TomlFile.cpp
    src/LclBridge.h
    src/LclCore.h
    src/OmarchyTheme.h
    src/IconProvider.h
    src/AppConfig.h
    src/TomlFile.h
)

qt_add_resources(lcl-gui "qml"
    PREFIX "/"
    FILES qml/Main.qml qml/NavRail.qml qml/DetailPane.qml qml/ContentCard.qml
          qml/SelectableRow.qml qml/TipsPage.qml
          icons/ic_arrow_back.svg
)

target_include_directories(lcl-gui PRIVATE src)
target_link_libraries(lcl-gui PRIVATE Qt6::Core Qt6::Gui Qt6::Qml Qt6::Quick Qt6::Svg)

# The content layer has no Qt in it, so its test is a plain executable: ctest runs it.
enable_testing()
add_executable(lcl-core-test tests/LclCoreTest.cpp src/LclCore.cpp)
target_include_directories(lcl-core-test PRIVATE src)
set_target_properties(lcl-core-test PROPERTIES AUTOMOC OFF)
add_test(NAME lcl-core COMMAND lcl-core-test "${CMAKE_CURRENT_SOURCE_DIR}/../assets")

# Assets and icons live outside this directory; both are overridable so a development
# run can point at the working tree.
set(LCL_ASSETS_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../assets" CACHE PATH "Markdown assets to install")
set(LCL_ICONS_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../icons" CACHE PATH "Shared SVG icons to install")

include(GNUInstallDirs)
install(TARGETS lcl-gui RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR})
install(DIRECTORY "${LCL_ASSETS_DIR}/" DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl/assets)
install(DIRECTORY "${LCL_ICONS_DIR}/" DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl/icons
        FILES_MATCHING PATTERN "*.svg")
install(FILES config.example.toml DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl)
install(FILES lcl-gui.desktop DESTINATION ${CMAKE_INSTALL_DATADIR}/applications)
