# TLDR

**Register Python modules** with pycentral

```dh_pycentral```

**Process with verbose** output

```dh_pycentral -v```

**Process specific package**

```dh_pycentral -p [package_name]```

# SYNOPSIS

**dh_pycentral** [_debhelper-options_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-p** _PACKAGE_, **--package** _PACKAGE_
> Process specified package only.

**-n**, **--no-scripts**
> Do not modify postinst/prerm scripts.

# DESCRIPTION

**dh_pycentral** was a debhelper command for registering Python modules with python-central, a system for managing Python modules that could be shared between multiple Python versions.

The tool handled byte-compilation and version-specific installation of Python modules, ensuring they worked correctly with all installed Python versions on the system.

This command is obsolete as python-central was removed from Debian in favor of dh_python2/dh_python3 which provide better integration with modern Python packaging standards.

# CAVEATS

Obsolete and deprecated. Modern packages should use dh_python3 instead. Only relevant for maintaining legacy packages or understanding historical Debian Python packaging.

# HISTORY

dh_pycentral was part of **python-central**, developed around **2006** for Debian's Python packaging. It was deprecated in favor of python-support and later dh_python2/dh_python3, being removed from Debian after the Python 2 deprecation.

# SEE ALSO

[dh_python3](/man/dh_python3)(1), [dh](/man/dh)(1), [python](/man/python)(1)
