# TAGLINE

Manage yum repository configuration

# TLDR

**View** the current configuration

```yum-config-manager```

**Add a repository** from a URL or file

```yum-config-manager --add-repo [url_or_path]```

**Enable** one or more repositories

```yum-config-manager --enable [repo_id]```

**Disable** one or more repositories

```yum-config-manager --disable [repo_id]```

**Set** a configuration option and save it

```yum-config-manager --setopt=[repo_id.option=value] --save```

# SYNOPSIS

**yum-config-manager** [_options_] [_section_...]

# PARAMETERS

**-h, --help**
> Display help information.

**--save**
> Save the current options (useful with **--setopt**).

**--enable**
> Enable the specified repositories (automatically saves).

**--disable**
> Disable the specified repositories (automatically saves).

**--add-repo=**_URL_|_FILE_
> Add (and enable) a repository from the given .repo file or URL.

**--setopt=**_option_=_value_
> Set any config option in yum config or repo files. Use _repoid.option=value_ for repo-specific options; _repoid_ may contain wildcards.

# DESCRIPTION

**yum-config-manager** is a utility for managing the main **yum** configuration and its repositories. It can display current settings, toggle which repositories are enabled, add new repositories from URLs or .repo files, and adjust individual options without manually editing `/etc/yum.conf` or files under `/etc/yum.repos.d/`.

On modern Red Hat-based distributions (RHEL 8+, Fedora, CentOS Stream), **yum** has been replaced by **dnf**, and this command is typically provided as an alias or wrapper for `dnf config-manager`.

# CAVEATS

Must be run as root to modify configuration. On DNF-based systems, **yum-config-manager** is an alias for **dnf config-manager** and requires the `dnf-plugins-core` package.

# HISTORY

**yum-config-manager** is part of the **yum-utils** package (later **dnf-utils**) from the RPM software management project. It was widely used on RHEL, CentOS, and Fedora to manage repositories before the transition to DNF.

# SEE ALSO

[dnf](/man/dnf)(8), [yum](/man/yum)(8), [rpm](/man/rpm)(8), [createrepo](/man/createrepo)(8)
