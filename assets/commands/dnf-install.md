# TLDR

**Install** packages by name

```sudo dnf install [package1] [package2]```

Install from **local file**

```sudo dnf install [path/to/file]```

Install from **URL**

```sudo dnf install [https://example.com/package.rpm]```

Add **EPEL** repositories

```sudo dnf install https://dl.fedoraproject.org/pub/epel/epel-release-latest-[10].noarch.rpm```

Add **Remi** repository

```sudo dnf install https://rpms.remirepo.net/enterprise/remi-release-[8].rpm```

# SYNOPSIS

**dnf install** [_options_] _package_...

# DESCRIPTION

**dnf install** installs packages on Red Hat-based distributions. It can install from repositories, local files, or URLs.

Automatically resolves and installs dependencies.

# PARAMETERS

_package_
> Package name, local file path, or URL

**-y, --assumeyes**
> Automatically answer yes to prompts

**--allowerasing**
> Allow erasing conflicting packages

**--downloadonly**
> Download only, don't install

# CAVEATS

Requires root privileges. Package names must match repository names exactly. Installing from URLs requires network access.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf-remove](/man/dnf-remove)(8), [rpm](/man/rpm)(8)
