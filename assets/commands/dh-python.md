# TAGLINE

debhelper extensions for Python packaging

# TLDR

**Build Python 3 package with debhelper**

```dh_python3```

**Specify supported Python versions**

```dh_python3 --shebang=/usr/bin/python3```

**Build with specific Python package directory**

```dh_python3 -p [package-name]```

**Generate dependencies from requires.txt**

```dh_python3 --depends```

# SYNOPSIS

**dh_python3** [_options_]

**dh_python2** [_options_] (deprecated)

# PARAMETERS

**-p**, **--package** _package_
> Act on specified package.

**-n**, **--no-package** _package_
> Exclude package.

**--shebang** _path_
> Use specific Python interpreter in shebangs.

**--depends** _section_
> Generate dependencies from specified section.

**--recommends** _section_
> Generate recommends from specified section.

**--suggests** _section_
> Generate suggests from specified section.

**-v**, **--verbose**
> Verbose output.

**-O**_opt_
> Pass option to debhelper.

# DESCRIPTION

**dh-python** provides debhelper extensions for packaging Python modules and applications in Debian. The main commands are **dh_python3** for Python 3 packages and the deprecated **dh_python2** for Python 2.

These tools handle Python-specific packaging tasks: byte-compiling modules, generating dependencies from Python metadata, fixing shebangs to use system Python, and creating proper package relationships.

In debian/rules, dh_python3 is typically invoked automatically through the dh sequencer with **--with python3**. It reads configuration from debian/control and Python metadata files.

# DEBIAN/RULES EXAMPLE

```makefile
#!/usr/bin/make -f
%:
	dh $@ --with python3 --buildsystem=pybuild
```

# CAVEATS

Python 2 support (dh_python2) is deprecated and removed from modern Debian. Multiple Python versions require careful handling. Virtual environments are not directly supported; packages install to system directories. Byte-compilation errors may indicate syntax issues.

# HISTORY

dh-python was developed for Debian to replace the older python-support and python-central systems. Created by **Piotr Ożarowski** around **2012**, it provided a cleaner approach to Python packaging as Python 3 became standard. The tool became the standard method for Debian Python packages and is used by Ubuntu and derivatives.

# SEE ALSO

[pybuild](/man/pybuild)(1), [dh](/man/dh)(1), [debhelper](/man/debhelper)(7), [py3compile](/man/py3compile)(1)
