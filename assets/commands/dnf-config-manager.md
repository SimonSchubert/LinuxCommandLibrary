# TAGLINE

manage DNF repositories and configuration

# TLDR

**Add** a repository from a .repo file URL (DNF 5, Fedora 41+)

```sudo dnf config-manager addrepo --from-repofile=[https://example.com/repo.repo]```

**Enable** or **disable** repositories (DNF 5)

```sudo dnf config-manager [enable|disable] [repository_id]```

**Set** a main or per-repository option persistently (DNF 5)

```sudo dnf config-manager setopt [repository_id].[option]=[value]```

**Add** a repository from URL (DNF 4)

```sudo dnf config-manager --add-repo [repository_url]```

**Enable** a repository (DNF 4)

```sudo dnf config-manager --set-enabled [repository_id]```

**Disable** repositories (DNF 4)

```sudo dnf config-manager --set-disabled [repository_id1] [repository_id2]```

**Save** a configuration option (DNF 4)

```sudo dnf config-manager --save --setopt=[option]=[value]```

**Print** current configuration (DNF 4)

```dnf config-manager --dump```

# SYNOPSIS

**dnf config-manager** [_options_] [_section_...] (DNF 4)

**dnf config-manager** _subcommand_ [_options_] [_arguments_] (DNF 5)

# DESCRIPTION

**dnf config-manager** provides command-line management of DNF repositories and configuration settings. On DNF 4 it is part of dnf-plugins-core; on DNF 5 it ships as a plugin in **dnf5-plugins** with a different, subcommand-based syntax and offers an alternative to manually editing configuration files.

The tool can add repositories from URLs (creating .repo files automatically), enable or disable existing repositories, and modify DNF configuration options on the fly. DNF 4 writes changes directly into the .repo files in /etc/yum.repos.d/, while DNF 5 leaves original repo files untouched and stores overrides in **/etc/dnf/repos.override.d/99-config_manager.repo**. This is particularly useful for scripted repository management, adding third-party repositories, or temporarily adjusting configuration without editing files manually. The --dump option is helpful for troubleshooting by showing the complete effective configuration.

# PARAMETERS (DNF 4)

**--add-repo** _url_
> Add (and enable) a repository from a .repo file URL or a baseurl.

**--dump**
> Print the current main configuration, or of the repositories given as arguments.

**--dump-variables**
> Print the effective values of the DNF variables (`$releasever`, `$basearch`, ...).

**--set-enabled** _repo_...
> Enable the specified repositories (changes are saved automatically).

**--set-disabled** _repo_...
> Disable the specified repositories (changes are saved automatically).

**--setopt** _option=value_
> Set a configuration option; use _repoid.option=value_ for a repository option.

**--save**
> Persist **--setopt** changes to the configuration files (without it, changes are only displayed).

**--help-cmd**
> Display help for the command.

# SUBCOMMANDS (DNF 5)

**addrepo** **--from-repofile**=_URL_
> Download a .repo file from a URL or local path into the repository directory.

**addrepo** **--set**=_option=value_... [**--id**=_REPO_ID_]
> Create a new repository from options; at least one of baseurl, mirrorlist or metalink is required.

**setopt** _[repoid.]option=value_...
> Set main options or repository overrides persistently. Globs are allowed in _repoid_.

**unsetopt** _[repoid.]option_...
> Remove main options or repository overrides.

**setvar** _name=value_...
> Set a DNF variable in **/etc/dnf/vars**.

**unsetvar** _name_...
> Remove a DNF variable.

**enable** _repoid_...
> Enable repositories via the override file.

**disable** _repoid_...
> Disable repositories via the override file.

**--overwrite**, **--add-or-replace**, **--save-filename**=_NAME_, **--create-missing-dir**
> Common options controlling how repository and override files are written.

# CONFIGURATION

**/etc/yum.repos.d/*.repo**
> Repository configuration files. Changes made by dnf config-manager persist here.

**/etc/dnf/dnf.conf**
> Main DNF configuration file. Options can be modified using --setopt (DNF 4) or setopt (DNF 5).

**/etc/dnf/repos.override.d/99-config_manager.repo**
> Repository overrides written by DNF 5 setopt, enable and disable.

# CAVEATS

On Fedora 41 and later, **dnf** is DNF 5, and the DNF 4 flags (**--add-repo**, **--set-enabled**, **--set-disabled**, **--save**, **--dump**) are no longer accepted; scripts and third-party install instructions written for DNF 4 must be updated. On DNF 4, the command requires **dnf-plugins-core**; on DNF 5 it requires **dnf5-plugins**. Changes require root.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf5](/man/dnf5)(8), [yum-config-manager](/man/yum-config-manager)(1), [yum](/man/yum)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf5)```

```[Documentation](https://dnf5.readthedocs.io/en/latest/dnf5_plugins/config-manager.8.html)```

<!-- verified: 2026-11-23 -->
