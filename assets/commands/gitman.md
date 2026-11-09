# TAGLINE

Language-agnostic dependency manager using Git

# TLDR

Create a **sample configuration** in the current directory

```gitman init```

**Install** the versions recorded in the configuration

```gitman install```

**Update** all dependencies to their latest versions and lock them

```gitman update```

Update **one dependency** or group

```gitman update [name]```

Update **nested dependencies** as well

```gitman update --all```

**List** the currently checked out versions

```gitman list```

**Pin** a dependency to a specific tag, branch or commit

```gitman lock [name]@[revision]```

Print the **path** to an installed dependency

```gitman show [name]```

Delete **all** installed dependencies

```gitman uninstall```

# SYNOPSIS

**gitman** _command_ [_options_] [_names_]

# COMMANDS

**init**
> Generate a sample configuration file for a new project.

**install** [_names_]
> Install dependencies, optionally limited to the named sources or groups.

**update** [_names_]
> Fetch the latest versions of dependencies and record the exact revisions.

**list**
> Display the checked out dependencies and record their versions in the log file.

**lock** [_names_]
> Record the exact version of each dependency. Accepts _name_**@**_revision_ to lock to a commit, or to the latest revision of a tag or branch.

**uninstall**
> Delete all dependencies.

**show** [_name_]
> Display the path to the dependency storage location, or to a specific dependency.

**edit**
> Open the existing configuration file.

# PARAMETERS

**--depth=**_count_
> Limit traversal of nested dependencies (**install**, **update**).

**--fetch**
> Always fetch from the repository instead of only when needed (**install**).

**--clean**
> Delete untracked files, which are otherwise left alone (**install**).

**--force**
> Overwrite all changes and ignore post-install script failures (**install**, **update**). With **uninstall**, delete dependencies that contain uncommitted changes.

**--force-interactive**
> Interactively overwrite changes (**install**, **update**).

**--skip-changes**
> Skip dependencies that have uncommitted changes (**install**, **update**).

**--skip-lock**
> Do not record the exact versions of previously locked dependencies (**update**).

**--all**
> Also get the latest versions of all nested dependencies (**update**).

**--fail-if-dirty**
> Exit with an error if there are uncommitted changes (**list**).

**--keep-location**
> Keep the top-level folder and anything other than the dependencies (**uninstall**).

**--config**
> Display the path to the configuration file (**show**).

**--log**
> Display the path to the log file (**show**).

# CONFIGURATION

**gitman.yml** or **.gitman.yml** in the root of the working tree holds the project's dependencies.

```
location: vendor/gitman
sources:
  - repo: https://github.com/user/library
    name: library
    rev: v1.2.0
    links:
      - target: lib/library
    scripts:
      - make
default_group: ''
groups: []
```

**location**
> Directory where dependencies are stored.

**sources**
> List of dependencies. Each has a **repo** URL, a local **name**, a **rev** (commit SHA, tag, branch or rev-parse date), and optional **links**, **scripts** and **sparse_paths**.

**groups**
> Named sets of sources, each with a **name** and **members**.

**default_group**
> The group used when none is specified.

# DESCRIPTION

**gitman** manages source dependencies as nested Git repositories, without tying a project to a language or package ecosystem. It is intended as a replacement for Git submodules, with added control over which version of each nested repository is used.

Running **gitman update** moves dependencies to the newest revision allowed by the configuration and records the resulting commit, while **gitman install** restores the versions already recorded. Together they work like the update and install steps of a lockfile-based package manager. Nested configuration files are processed as well, and post-install scripts run after checkout.

# CAVEATS

Requires Python 3.10 or newer and Git 2.8 or newer, with Git credentials stored for any private repositories. Dependencies are real Git working trees, so **--force** and **--clean** can discard local work inside them.

# SEE ALSO

[git](/man/git)(1), [git-submodule](/man/git-submodule)(1), [pipx](/man/pipx)(1)

# RESOURCES

```[Source code](https://github.com/jacebrowning/gitman)```

```[Documentation](https://gitman.readthedocs.io)```

<!-- verified: 2026-11-09 -->
