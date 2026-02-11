# TAGLINE

Build Python packages for Debian

# TLDR

**Build Python package**

```pybuild --build```

**Install to directory**

```pybuild --install --dest-dir [dir]```

**Clean build**

```pybuild --clean```

**Build with specific Python**

```pybuild --interpreter python3```

# SYNOPSIS

**pybuild** [_options_]

# PARAMETERS

**--build**
> Build the package.

**--install**
> Install the package.

**--clean**
> Clean build files.

**--dest-dir** _DIR_
> Installation directory.

**--interpreter** _PYTHON_
> Python interpreter.

**-s** _SYSTEM_
> Build system.

# DESCRIPTION

**pybuild** is a Debian helper tool that builds and installs Python packages as part of the Debian packaging process. It wraps various Python build systems including setuptools, flit, poetry, and meson-python, providing a unified interface for the **dh-python** debhelper sequence.

The tool automatically detects the appropriate build system from the source package and handles building for multiple Python versions when required. It is typically invoked indirectly through debhelper rules rather than used directly, but can be called manually for debugging packaging issues.

# CAVEATS

Debian packaging tool. Part of dh-python.

# HISTORY

pybuild is part of **dh-python** for Debian Python packaging.

# SEE ALSO

[dh](/man/dh)(1), [debhelper](/man/debhelper)(7), [python](/man/python)(1)

