# TAGLINE

manage DNF repositories and configuration

# TLDR

**Add** repository from URL

```dnf config-manager --add-repo=[repository_url]```

**Print** current configuration

```dnf config-manager --dump```

**Enable** a repository

```dnf config-manager --set-enabled [repository_id]```

**Disable** repositories

```dnf config-manager --set-disabled [repository_id1] [repository_id2]```

**Set** configuration option

```dnf config-manager --setopt=[option]=[value]```

# SYNOPSIS

**dnf config-manager** [_options_]

# DESCRIPTION

**dnf config-manager** provides command-line management of DNF repositories and configuration settings. It's part of dnf-plugins-core and offers an alternative to manually editing configuration files.

The tool can add repositories from URLs (creating .repo files automatically), enable or disable existing repositories, and modify DNF configuration options on the fly. Changes to repositories are persisted in /etc/yum.repos.d/ as .repo files. This is particularly useful for scripted repository management, adding third-party repositories, or temporarily adjusting configuration without editing files manually. The --dump option is helpful for troubleshooting by showing the complete effective configuration.

# PARAMETERS

**--add-repo** _url_
> Add repository from URL

**--dump**
> Print current configuration

**--set-enabled** _repo_
> Enable repository

**--set-disabled** _repo_
> Disable repository

**--setopt** _opt=val_
> Set configuration option

**--help-cmd**
> Display help

# CONFIGURATION

**/etc/yum.repos.d/*.repo**
> Repository configuration files. Changes made by dnf config-manager persist here.

**/etc/dnf/dnf.conf**
> Main DNF configuration file. Options can be modified using --setopt.

# CAVEATS

Requires dnf-plugins-core. Repository changes require root privileges. Changes persist in /etc/yum.repos.d/.

# SEE ALSO

[dnf](/man/dnf)(8), [yum-config-manager](/man/yum-config-manager)(1)
