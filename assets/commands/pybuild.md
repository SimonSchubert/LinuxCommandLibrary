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

**pybuild** builds Python packages for Debian. Packaging helper.

The tool wraps build systems. Part of dh-python.

pybuild builds Python packages.

# CAVEATS

Debian packaging tool. Part of dh-python.

# HISTORY

pybuild is part of **dh-python** for Debian Python packaging.

# SEE ALSO

[dh](/man/dh)(1), [debhelper](/man/debhelper)(7), [python](/man/python)(1)

