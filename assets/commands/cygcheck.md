# TAGLINE

Cygwin diagnostic and package query tool

# TLDR

**Generate full system** diagnostic report

```cygcheck -s```

**Check dependencies** of an executable

```cygcheck [program.exe]```

**Find which package** owns a file

```cygcheck -f [/usr/bin/bash.exe]```

**List files installed** by a package

```cygcheck -l [coreutils]```

**Check for package problems**

```cygcheck -c```

**Show Cygwin version** information

```cygcheck -V```

**Verbose dependency check**

```cygcheck -v [program.exe]```

# SYNOPSIS

**cygcheck** [_options_] [_program_|_package_]

# PARAMETERS

**-s**, **--sysinfo**
> Generate comprehensive system information report.

**-c** [_PACKAGE_], **--check-setup**
> Check installed packages for problems.

**-f** _FILE_, **--find-package**
> Find which package installed a file.

**-l** _PACKAGE_, **--list-package**
> List files installed by a package.

**-p** _PATTERN_, **--package-query**
> Search for packages by pattern.

**-v**, **--verbose**
> Verbose output (show full paths).

**-r**, **--registry**
> Include registry information in report.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**cygcheck** is a diagnostic utility for Cygwin, the Unix-like environment for Windows. It provides system information, checks executable dependencies, and manages package information.

The system report (**-s**) is invaluable for troubleshooting Cygwin issues, collecting details about installed packages, DLL versions, mount points, environment variables, and Windows system information. This report is often requested when seeking support.

Dependency checking helps identify missing DLLs that prevent programs from running. Package management queries help track file ownership and verify installation integrity.

# CAVEATS

Only works within Cygwin environment on Windows. System reports can be lengthy; redirect to file for bug reports. Package checking requires the setup database from Cygwin installation.

# HISTORY

cygcheck was developed as part of the **Cygwin** project, which was started by Cygnus Solutions in **1995** to provide Unix tools on Windows. The utility became essential for diagnosing common Cygwin configuration and dependency issues.

# SEE ALSO

[cygwin](/man/cygwin)(7), [ldd](/man/ldd)(1), [dpkg](/man/dpkg)(1)
