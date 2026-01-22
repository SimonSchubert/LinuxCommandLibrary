# TLDR

**Download** package to current directory

```dnf download [package]```

Download to **specific directory**

```dnf download [package] --destdir [path/to/directory]```

**Print URL** instead of downloading

```dnf download --url [package]```

# SYNOPSIS

**dnf download** [_options_] _package_

# DESCRIPTION

**dnf download** downloads RPM packages from DNF repositories without installing them. Part of dnf-plugins-core.

Useful for obtaining packages for offline installation or inspection.

# PARAMETERS

**--destdir** _dir_
> Download destination directory

**--url**
> Print URL instead of downloading

**--source**
> Download source RPM

**--resolve**
> Download dependencies too

# CAVEATS

Requires dnf-plugins-core. Destination directory must exist when using --destdir. Downloaded packages are not automatically installed.

# SEE ALSO

[dnf](/man/dnf)(8), [rpm](/man/rpm)(8), [yumdownloader](/man/yumdownloader)(1)
