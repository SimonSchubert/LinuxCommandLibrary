# TAGLINE

Perform quality checks on Sailfish OS projects

# TLDR

**Run the default quality checks**

```sfdk check```

**List available test suites**

```sfdk check --list-suites```

**Also run unit tests**

```sfdk check --levels +unit```

**Run only static checks on packages**

```sfdk check --levels package```

**Check specific package files**

```sfdk check [path/to/package.rpm]```

# SYNOPSIS

**sfdk check** **--list-suites**

**sfdk check** [**-l**|**--levels** [**+**|**-**]_level_...] [**-s**|**--suites** [**+**|**-**]_suite_...] [**--**] [_artefact_]...

# PARAMETERS

**--list-suites**
> List available test suites and the levels they cover.

**-l**, **--levels** [**+**|**-**]_level_...
> Select testing levels: **source**, **package**, **static**, **unit**, **system**, or **dynamic**.

**-s**, **--suites** [**+**|**-**]_suite_...
> Select test suites. By default all and only the essential suites are used.

# DESCRIPTION

**sfdk check** performs quality checks on the artefacts of the build tree under the current directory, or on a source tree or package files given on the command line. The **source** and **package** levels run by default on the build host. The **unit** level runs on the build host and the **system** level runs on the target device, and neither is enabled by default. Part of the Sailfish SDK command-line tool.

Multiple values are separated with commas. A **+** or **-** prefix makes the selection cumulative. Defaults can be overridden with the **check.levels** and **check.suites** configuration options.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-package](/man/sfdk-package)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
