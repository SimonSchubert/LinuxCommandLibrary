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

**dnf config-manager** manages DNF configuration options and repositories. Part of dnf-plugins-core.

Can add, enable, disable repositories and modify DNF configuration values.

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

# CAVEATS

Requires dnf-plugins-core. Repository changes require root privileges. Changes persist in /etc/yum.repos.d/.

# SEE ALSO

[dnf](/man/dnf)(8), [yum-config-manager](/man/yum-config-manager)(1)
