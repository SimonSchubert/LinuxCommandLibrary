# TAGLINE

Create Python bindings for C++ code

# TLDR

**Get include path**

```python -m pybind11 --includes```

**Get CMake directory**

```python -m pybind11 --cmakedir```

**Compile binding manually**

```c++ -O3 -shared $(python3 -m pybind11 --includes) [example.cpp] -o [example.so]```

# SYNOPSIS

**python -m pybind11** [_options_]

# PARAMETERS

**--includes**
> Include flags for compiler.

**--cmakedir**
> CMake module path.

# DESCRIPTION

**pybind11** is a header-only library for creating Python bindings of C++ code. It enables seamless interoperability between Python and C++ with minimal boilerplate.

# EXAMPLE BINDING

```cpp
#include <pybind11/pybind11.h>

int add(int a, int b) {
    return a + b;
}

PYBIND11_MODULE(example, m) {
    m.def("add", &add, "Add two numbers");
}
```

# CMAKE SETUP

```cmake
find_package(pybind11 REQUIRED)
pybind11_add_module(example example.cpp)
```

# COMPILE MANUALLY

```bash
# Get flags
CFLAGS=$(python3 -m pybind11 --includes)
SUFFIX=$(python3-config --extension-suffix)

# Compile
c++ -O3 -Wall -shared -std=c++11 -fPIC \
    $CFLAGS example.cpp -o example$SUFFIX
```

# CAVEATS

Header-only (no linking needed). Requires C++11+. Performance overhead minimal compared to pure C API.

# HISTORY

pybind11 was created by **Wenzel Jakob** as a lightweight alternative to Boost.Python, focusing on C++11 features.

# SEE ALSO

[cython](/man/cython)(1), [swig](/man/swig)(1), [python](/man/python)(1)
