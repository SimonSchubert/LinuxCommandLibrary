# TAGLINE

Manage yum repository configuration

# TLDR

**View** the current configuration of [main] and all enabled repositories

```yum-config-manager```

**Show the configuration** of specific sections

```yum-config-manager main [repo_id]```

**Add a repository** from a URL or file

```sudo yum-config-manager --add-repo [url_or_path]```

**Enable** one or more repositories

```sudo yum-config-manager --enable [repo_id]```

**Disable** one or more repositories

```sudo yum-config-manager --disable [repo_id]```

**Disable all** repositories

```sudo yum-config-manager --disable \*```

**Set** a repository option and save it (works for disabled repos too)

```sudo yum-config-manager --setopt=[repo_id].[skip_if_unavailable]=[1] --save```

**Set** a global option in the [main] section

```sudo yum-config-manager --setopt=[installonly_limit]=[5] --save```

# SYNOPSIS

**yum-config-manager** [_options_] [_section_...]

# PARAMETERS

**-h, --help**
> Display help information.

**--save**
> Save the current options (useful with **--setopt**).

**--enable**
> Enable the specified repositories (automatically saves). Use `\*` to enable all.

**--disable**
> Disable the specified repositories (automatically saves). Use `\*` to disable all.

**--add-repo=**_URL_|_FILE_
> Add (and enable) a repository from the given .repo file or URL.

**--setopt=**_option_=_value_
> Set any config option in yum config or repo files. Use _repoid.option=value_ for repo-specific options; _repoid_ may contain wildcards.

Other options are inherited from **yum** (or **dnf**), e.g. **-c** _config_file_.

# DESCRIPTION

**yum-config-manager** is a utility for managing the main **yum** configuration and its repositories. It can display current settings, toggle which repositories are enabled, add new repositories from URLs or .repo files, and adjust individual options without manually editing `/etc/yum.conf` or files under `/etc/yum.repos.d/`.

Unless **--add-repo** is used, it prints the current configuration of the selected sections and can save it back. Without positional arguments it selects the [main] section and every enabled repository; a section is either `main` or a repo ID.

On RHEL 8/9 and CentOS Stream, **yum** has been replaced by **dnf**, and this command is a compatibility wrapper for `dnf config-manager`, shipped in the **yum-utils** / **dnf-utils** package from dnf-plugins-core.

# CAVEATS

Must be run as root to modify configuration. Remember to quote or escape `*` wildcards so the shell does not expand them.

On systems where **DNF5** is the default (Fedora 41+), the DNF4-based **yum-config-manager** is generally not available. Use the new **dnf config-manager** syntax instead, e.g. `dnf config-manager addrepo --from-repofile=URL` and `dnf config-manager setopt REPO.enabled=1`.

# HISTORY

**yum-config-manager** is part of the **yum-utils** package from the RPM software management project and was widely used on RHEL/CentOS 5 to 7 and older Fedora. With the move to DNF it was reimplemented on top of the **config-manager** plugin in **dnf-plugins-core**, keeping the same name for compatibility.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf-config-manager](/man/dnf-config-manager)(8), [yum](/man/yum)(8), [rpm](/man/rpm)(8), [createrepo](/man/createrepo)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/yum-utils)```

```[Documentation](https://dnf-plugins-core.readthedocs.io/en/latest/config_manager.html)```

<!-- verified: 2026-11-23 -->
