# TAGLINE

checks pathnames for validity and portability

# TLDR

**Check path for POSIX portability**

```pathchk [/path/to/file]```

**Check for portability to older systems**

```pathchk -p [/path/to/file]```

**Check for empty paths**

```pathchk -P [path]```

**Check multiple paths**

```pathchk [path1] [path2] [path3]```

# SYNOPSIS

**pathchk** [_-p_] [_-P_] _pathname_...

# PARAMETERS

**-p**, **--portability**
> Check for POSIX portability.

**-P**
> Check for empty names and leading dashes.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**pathchk** checks pathnames for validity and portability. It identifies names that may cause problems on other systems.

Default checking verifies the path is valid on the current system: proper length, valid characters, and accessible parent directories.

POSIX portability mode (-p) enforces stricter limits. It checks for characters valid on all POSIX systems and limits component lengths to 14 characters (the historical minimum).

The -P option adds checks for empty path components and names starting with hyphens, which can cause problems with command arguments.

Exit code 0 means all paths passed checks. Non-zero indicates problems were found, with error messages describing issues.

The tool helps ensure scripts and archives work across different Unix systems without pathname-related failures.

# CAVEATS

Portability mode is conservative. Modern systems accept longer names. Some checks may be overly strict for single-system use.

# HISTORY

**pathchk** is part of **GNU coreutils** and specified by **POSIX**. It provides a standard way to validate pathnames for cross-platform scripts and utilities.

# SEE ALSO

[basename](/man/basename)(1), [dirname](/man/dirname)(1), [realpath](/man/realpath)(1)
