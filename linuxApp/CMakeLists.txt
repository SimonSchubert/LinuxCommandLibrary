cmake_minimum_required(VERSION 3.21)
project(lcl-gui LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_AUTOMOC ON)

find_package(Qt6 REQUIRED COMPONENTS Core Gui Qml Quick Svg)
qt_standard_project_setup()

# Directory holding liblcl.so and liblcl_api.h, produced by
# ./gradlew :viewmodels:linkReleaseSharedLinux<Arch>
set(LCL_NATIVE_DIR "" CACHE PATH "Kotlin/Native shared library output directory")
if(NOT LCL_NATIVE_DIR)
    message(FATAL_ERROR "Set -DLCL_NATIVE_DIR to the directory containing liblcl.so")
endif()

qt_add_executable(lcl-gui
    src/main.cpp
    src/LclBridge.cpp
    src/OmarchyTheme.cpp
    src/IconProvider.cpp
    src/AppConfig.cpp
    src/TomlFile.cpp
    src/LclBridge.h
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

target_include_directories(lcl-gui PRIVATE ${LCL_NATIVE_DIR} src)
target_link_libraries(lcl-gui PRIVATE
    Qt6::Core Qt6::Gui Qt6::Qml Qt6::Quick Qt6::Svg
    ${LCL_NATIVE_DIR}/liblcl.so
)
# The Kotlin library sits next to the build output while developing, but is installed
# to a standard library directory, which is already on the loader's search path. Baking
# the build directory into the shipped binary would be wrong.
set_target_properties(lcl-gui PROPERTIES
    BUILD_RPATH "${LCL_NATIVE_DIR}"
    INSTALL_RPATH ""
)

# Assets and icons live outside this directory; both are overridable so a development
# run can point at the working tree.
set(LCL_ASSETS_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../assets" CACHE PATH "Markdown assets to install")
set(LCL_ICONS_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../icons" CACHE PATH "Shared SVG icons to install")

include(GNUInstallDirs)
install(TARGETS lcl-gui RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR})
install(FILES "${LCL_NATIVE_DIR}/liblcl.so" DESTINATION ${CMAKE_INSTALL_LIBDIR})
install(DIRECTORY "${LCL_ASSETS_DIR}/" DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl/assets)
install(DIRECTORY "${LCL_ICONS_DIR}/" DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl/icons
        FILES_MATCHING PATTERN "*.svg")
install(FILES config.example.toml DESTINATION ${CMAKE_INSTALL_DATADIR}/lcl)
install(FILES lcl-gui.desktop DESTINATION ${CMAKE_INSTALL_DATADIR}/applications)
