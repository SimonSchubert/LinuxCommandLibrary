# TAGLINE

Build Python packages for Debian

# TLDR

**Build for all supported Python versions**

```pybuild --build```

**Install to directory**

```pybuild --install --dest-dir [dir]```

**Clean build**

```pybuild --clean```

**Build for specific Python versions**

```pybuild --build -p "[3.12 3.13]"```

**List available build systems**

```pybuild --list-systems```

# SYNOPSIS

**pybuild** [_action_] [_build-system-arguments_] [_directories_] [_options_]

# PARAMETERS

**--detect**
> Print the name of the detected build system.

**--configure**
> Run the configure step for all requested Python versions.

**--build**
> Run the build step for all requested Python versions.

**--test**
> Run the tests.

**--list-systems**
> List available build systems.

**--install**
> Install the package.

**--clean**
> Clean build files.

**--dest-dir** _DIR_
> Destination directory (default debian/tmp).

**-d**, **--dir** _DIR_
> Source directory.

**-i**, **--interpreter** _INTERPRETER_
> Interpreter template (default python{version}).

**-p**, **--pyver** _VERSIONS_
> Python versions to build for.

**-s**, **--system** _SYSTEM_
> Select a build system (default auto-detection).

**--test-pytest**, **--test-tox**, **--test-unittest**
> Choose the test runner.

# DESCRIPTION

**pybuild** is a Debian helper tool that builds and installs Python packages as part of the Debian packaging process. It has plugins for pyproject (PEP 517 backends), distutils/setuptools, meson, cmake, autopkgtest and custom commands, providing a unified interface for the **dh-python** debhelper sequence.

The tool automatically detects the appropriate build system from the source package and handles building for multiple Python versions when required. It is typically invoked indirectly through debhelper rules rather than used directly, but can be called manually for debugging packaging issues.

# CAVEATS

Debian packaging tool. Part of dh-python.

# HISTORY

pybuild is part of **dh-python** for Debian Python packaging.

# SEE ALSO

[dh](/man/dh)(1), [debhelper](/man/debhelper)(7), [python](/man/python)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/python-team/tools/dh-python)```

```[Documentation](https://manpages.debian.org/unstable/dh-python/pybuild.1.en.html)```

<!-- verified: 2026-11-08 -->
