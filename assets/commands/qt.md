# TAGLINE

Cross-platform C++ application framework tools

# TLDR

**Create Qt project**

```qmake -project```

**Generate Makefile**

```qmake```

**Build with CMake**

```cmake -DCMAKE_PREFIX_PATH=[/path/to/Qt] ..```

**Run Qt Designer**

```designer```

**Run Qt Creator**

```qtcreator```

# SYNOPSIS

Qt framework tools and utilities

# TOOLS

**qmake**
> Build system generator.

**moc**
> Meta-Object Compiler.

**uic**
> UI compiler.

**rcc**
> Resource compiler.

**designer**
> Visual UI designer.

**qtcreator**
> IDE.

**qmlscene**
> QML viewer.

# DESCRIPTION

**Qt** is a cross-platform C++ framework for GUI applications. It provides widgets, graphics, networking, and more. This covers the main Qt development tools.

# EXAMPLES

```bash
# Create project file
qmake -project

# Generate Makefile
qmake myproject.pro

# Build
make

# Run UI designer
designer

# View QML file
qmlscene myapp.qml

# Get Qt version
qmake --version
```

# CMAKE INTEGRATION

```cmake
cmake_minimum_required(VERSION 3.16)
project(myapp)

find_package(Qt6 REQUIRED COMPONENTS Widgets)
qt_standard_project_setup()

qt_add_executable(myapp main.cpp)
target_link_libraries(myapp Qt6::Widgets)
```

# ENVIRONMENT

```bash
# Set Qt path
export PATH=/opt/Qt/6.x/gcc_64/bin:$PATH
export LD_LIBRARY_PATH=/opt/Qt/6.x/gcc_64/lib
```

# CAVEATS

Large framework. Licensing: GPL, LGPL, or commercial. Qt5 and Qt6 APIs differ.

# HISTORY

Qt was created by **Trolltech** in 1991, later acquired by **Nokia**, then **Digia**, now **The Qt Company**.

# SEE ALSO

[qmake](/man/qmake)(1), [cmake](/man/cmake)(1), [designer](/man/designer)(1)
