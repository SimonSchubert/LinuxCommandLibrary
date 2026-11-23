# TAGLINE

List available Python interpreter versions on Debian

# TLDR

**List installed Python versions**

```pyversions -i```

**List installed versions as bare numbers**

```pyversions -i -v```

**Show supported versions**

```pyversions -s```

**Show default version**

```pyversions -d```

**Show versions requested** by the package in the current directory

```pyversions -r```

**Resolve a version string**

```pyversions -r "[>= 2.6]"```

# SYNOPSIS

**pyversions** [**-h**] [**-v**] [_options_]

# PARAMETERS

**-i**, **--installed**
> List installed Python versions.

**-s**, **--supported**
> List Python versions currently supported by the running Debian release.

**-d**, **--default**
> Print the default Python version (target of **/usr/bin/python**).

**-r**, **--requested** [_version-string_|_control-file_]
> Read the **XS-Python-Version** field of a control file (falling back to **debian/pyversions**) and print the matching versions. The argument is treated as a version string if it is not a file name. Without an argument, checks **debian/control** and **debian/pyversions**, then falls back to the supported versions.

**-v**, **--version**
> Limit the output to version numbers (e.g. _2.7_ instead of _python2.7_).

**-h**, **--help**
> Print a help text.

# DESCRIPTION

**pyversions** is a Debian-specific helper that reports information about **Python 2** interpreter versions available on the system. It lists installed versions, the default version, the versions supported by the current Debian release, and the versions a source package requests via its **XS-Python-Version** field in **debian/control**. It is used by Debian's Python packaging infrastructure (debhelper, dh_python2) to drive build-time decisions.

The Python 3 counterpart is **py3versions**, which is the tool you should use today; **pyversions** itself was retired together with Python 2: the last releases shipping it are **Debian 11 (bullseye)** and **Ubuntu 22.04**.

# CAVEATS

Debian/Ubuntu specific and Python-2 only. Its last home was the **python2-minimal** package, which was removed in Debian 12+ and Ubuntu 24.04+. On modern systems, use **py3versions** instead.

# HISTORY

**pyversions** shipped as part of Debian's **python-minimal** / **python** package and was the canonical way to query Python 2 versions in Debian packaging. After Python 2 reached end-of-life on **2020-01-01**, the tool was deprecated alongside the language and removed from current Debian/Ubuntu releases.

# SEE ALSO

[python](/man/python)(1), [py3versions](/man/py3versions)(1), [update-alternatives](/man/update-alternatives)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/cpython-team/python-defaults)```

```[Documentation](https://manpages.debian.org/bullseye/python2-minimal/pyversions.1.en.html)```

<!-- verified: 2026-11-23 -->
