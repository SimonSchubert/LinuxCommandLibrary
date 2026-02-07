# TAGLINE

Python foreign function interface to C libraries

# TLDR

**Load a shared library**

```python -c "from ctypes import CDLL; lib = CDLL('[libname.so]')"```

**Call a C function**

```python -c "from ctypes import CDLL; lib = CDLL('libc.so.6'); print(lib.getpid())"```

**Pass string argument to C function**

```python -c "from ctypes import CDLL, c_char_p; lib = CDLL('libc.so.6'); lib.puts(c_char_p(b'Hello'))"```

**Define function argument and return types**

```python -c "from ctypes import CDLL, c_int; lib = CDLL('libm.so.6'); lib.abs.argtypes = [c_int]; lib.abs.restype = c_int; print(lib.abs(-42))"```

**Access Windows DLL**

```python -c "from ctypes import windll; windll.user32.MessageBoxW(0, 'Hello', 'Title', 0)"```

# SYNOPSIS

```python
from ctypes import CDLL, c_int, c_char_p, POINTER
```

# TYPES

**c_int**, **c_long**, **c_longlong**
> Integer types.

**c_uint**, **c_ulong**
> Unsigned integers.

**c_float**, **c_double**
> Floating point types.

**c_char**, **c_wchar**
> Character types.

**c_char_p**, **c_wchar_p**
> String pointers (char*, wchar_t*).

**c_void_p**
> Void pointer.

**POINTER(type)**
> Pointer to type.

**Structure**, **Union**
> Base classes for C structs/unions.

# DESCRIPTION

**ctypes** is a Python standard library module for calling functions in C shared libraries and DLLs. It provides C-compatible data types and allows calling functions with appropriate argument and return type specifications.

The module enables Python code to interface with native libraries without writing C extension modules. It handles type conversion between Python and C, pointer management, and structure/union definitions.

Common uses include accessing system libraries, using hardware interfaces, integrating legacy C code, and calling platform-specific APIs (Windows DLLs, macOS frameworks).

# CAVEATS

Incorrect type specifications can cause crashes or memory corruption. Pointers and memory management require careful handling. Library paths vary by OS; use **find_library** for portability. Performance overhead exists compared to C extensions. Not suitable for C++ libraries with name mangling.

# HISTORY

ctypes was created by **Thomas Heller** and merged into Python's standard library in version **2.5** (2006). It was based on the earlier ctypes project available on PyPI since **2003**. The module provided a crucial capability for Python to interface with native code without compilation, enabling pure-Python access to system libraries.

# SEE ALSO

[cffi](/man/cffi)(3py), [cython](/man/cython)(1), [pybind11](/man/pybind11)(3py)
