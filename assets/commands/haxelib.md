# TAGLINE

Package manager for the Haxe programming language

# TLDR

**Install a library**

```haxelib install [library]```

**Install a specific version**

```haxelib install [library] [version]```

**Install from a zip file**

```haxelib install [file.zip]```

**Update a single library**

```haxelib update [library]```

**Update all installed libraries**

```haxelib update```

**List installed libraries**

```haxelib list```

**Search for libraries**

```haxelib search [query]```

**Remove a library**

```haxelib remove [library]```

**Use a git repository as a library**

```haxelib git [library] [https://github.com/user/repo.git]```

**Point a library at a local development directory**

```haxelib dev [library] [path/to/source]```

# SYNOPSIS

**haxelib** _command_ [_arguments_]

# SUBCOMMANDS

**install** _name_ [_version_]
> Install a library from the haxelib repository or a local zip.

**update** [_name_]
> Update a single library, or all installed libraries when no name is given.

**upgrade**
> Update every installed library to the latest version.

**remove** _name_ [_version_]
> Remove an installed library.

**list**
> List installed libraries and their versions.

**search** _query_
> Search the haxelib repository for libraries matching _query_.

**info** _name_
> Show information about a library.

**run** _name_ [_args..._]
> Execute a library's run script.

**dev** _name_ _path_
> Point a library at a local development directory. Pass no path to clear.

**git** _name_ _url_ [_branch_]
> Use a git repository as the source for a library.

**hg** _name_ _url_ [_branch_]
> Use a mercurial repository as the source for a library.

**path** _name..._
> Print source paths, dependencies, and compiler defines for the given libraries.

**libpath** _name..._
> Print the root path of each library, one per line.

**version**
> Print the haxelib version.

**config**
> Print the haxelib repository path.

**setup** [_path_]
> Configure the haxelib repository path.

**newrepo**
> Create a local repository in the current directory.

**deleterepo**
> Remove the local repository in the current directory.

**selfupdate**
> Update haxelib itself.

# DESCRIPTION

**haxelib** is the package manager for the **Haxe** programming language. It installs, updates, and removes libraries from the central registry at `lib.haxe.org`, and also supports installing libraries from git or mercurial repositories or local zip archives.

The `dev` command points a library at a local working copy, which is the standard workflow for developing a library and testing it inside another project. The `newrepo` command creates a per-project library directory so each project can pin its own dependency versions.

# CAVEATS

The default repository is shared system-wide; use `haxelib newrepo` for project-local installs. Library names are case-sensitive on case-sensitive filesystems.

# INSTALL

```apt: sudo apt install haxe```

```dnf: sudo dnf install haxe```

```pacman: sudo pacman -S haxe```

```apk: sudo apk add haxe```

```zypper: sudo zypper install haxe```

```brew: brew install haxe```

```nix: nix profile install nixpkgs#haxe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1)
