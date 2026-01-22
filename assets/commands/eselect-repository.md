# TLDR

**List** all ebuild repositories

```eselect repository list```

List **enabled** repositories

```eselect repository list -i```

**Enable** a repository

```eselect repository enable [name|index]```

**Add** an unregistered repository

```eselect repository add [name] [git|rsync|svn] [sync_uri]```

**Disable** repositories without removing contents

```eselect repository disable [repo1] [repo2]```

**Remove** repositories and their contents

```eselect repository remove [repo1] [repo2]```

**Create** a local repository

```eselect repository create [name] [path/to/repo]```

# SYNOPSIS

**eselect repository** _action_ [_options_]

# DESCRIPTION

**eselect repository** configures ebuild repositories for Portage on Gentoo systems. It can enable, disable, add, or remove repositories from the Gentoo repository list.

After enabling a repository, run `emerge --sync repo_name` to download ebuilds.

# PARAMETERS

**list**
> List all registered repositories

**-i**
> Show only installed/enabled

**enable** _repo_
> Enable a repository

**disable** _repo_
> Disable without removing

**remove** _repo_
> Disable and remove contents

**add** _name_ _type_ _uri_
> Add unregistered repository

**create** _name_ _path_
> Create local repository

# CAVEATS

Gentoo Linux specific. Repositories must be synced after enabling. Part of app-eselect/eselect-repository package.

# SEE ALSO

[eselect](/man/eselect)(1), [emerge](/man/emerge)(1), [emaint](/man/emaint)(1)
