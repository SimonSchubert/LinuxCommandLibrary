# TLDR

Check a **PKGBUILD** file for issues

```namcap [path/to/PKGBUILD]```

Check a **package file** for issues

```namcap [path/to/package.pkg.tar.zst]```

Check with **extra informational messages**

```namcap -i [path/to/file]```

Output in **machine-readable** format

```namcap -m [path/to/file]```

**List available rules**

```namcap --rules```

# SYNOPSIS

**namcap** [**-i**] [**-m**] [**--rules** _list_] _filename_

# PARAMETERS

**-i, --info**
> Display extra informational messages

**-m, --machine-readable**
> Output in program-parsable format

**--rules _list_**
> List available checking rules

**-h, --help**
> Display help information

# OUTPUT TYPES

**E: (Error)**
> Critical issues requiring fixes; security, licensing, or permissions problems

**W: (Warning)**
> Recommended changes; experienced packagers may override

**I: (Information)**
> Helpful notes; displayed only with --info flag

# DESCRIPTION

**namcap** checks binary packages and source PKGBUILDs for common packaging mistakes on Arch Linux. It validates required fields, file permissions, dependencies, licenses, and security concerns.

The tool helps package maintainers catch issues before submission to the AUR or official repositories. It runs multiple rule-based checks and reports findings categorized by severity.

# COMMON CHECKS

- Required PKGBUILD fields (pkgname, pkgver, url, etc.)
- Package file permissions and ownership
- License file inclusion
- Missing or extra dependencies
- Security concerns
- ELF file issues
- Empty directories

# CAVEATS

Not all warnings require action; some are informational for experienced packagers. The tool checks against Arch Linux packaging standards and may not apply to other distributions. Some checks require the package to be built before analysis.

# HISTORY

**namcap** was developed by the **Arch Linux** community as a quality assurance tool for package maintainers. It is maintained as part of the Arch Linux development tools and helps ensure consistent packaging standards.

# SEE ALSO

[makepkg](/man/makepkg)(8), [pacman](/man/pacman)(8), [PKGBUILD](/man/PKGBUILD)(5)
