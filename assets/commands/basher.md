# TAGLINE

Package manager for shell scripts

# TLDR

**Install a package** from GitHub

```basher install [username/repository]```

**List installed packages**

```basher list```

**Uninstall a package**

```basher uninstall [username/repository]```

**Update a package**

```basher upgrade [username/repository]```

**Update all packages**

```basher upgrade --all```

**Link a local package** for development

```basher link [path/to/directory] [package_name]```

**Initialize basher** in shell config

```basher init```

**Show package information**

```basher package-path [username/repository]```

# SYNOPSIS

**basher** _command_ [_arguments_]

# DESCRIPTION

**basher** is a package manager for shell scripts hosted on GitHub and other git repositories. It installs shell scripts and makes their commands available in your PATH without manual downloading or symlinking.

Packages are installed to ~/.basher/cellar and linked to ~/.basher/bin. The package format expects executables in bin/ or the root directory, with optional man pages and completions.

Basher supports packages from GitHub, GitLab, Bitbucket, or any git URL. It handles dependencies declared in package.json and can work with bash, zsh, and other shells.

# PARAMETERS

**install** _package_
> Install a package from repository.

**uninstall** _package_
> Remove an installed package.

**list**
> Show all installed packages.

**upgrade** _package_
> Update a specific package.

**upgrade --all**
> Update all installed packages.

**link** _directory_ _name_
> Link local directory as package.

**unlink** _name_
> Remove linked package.

**init**
> Output shell initialization code.

**commands** _package_
> List commands provided by a package.

**package-path** _package_
> Show installation path.

**outdated**
> List packages with available updates.

# CAVEATS

Requires git for package installation. Shell configuration must source basher init output. Packages without proper structure may not work correctly. No built-in security verification; review package code before installing from untrusted sources. Works best with packages specifically designed for basher.

# HISTORY

**Basher** was created by **Juan Ibiapina** in **2013** as a simple package manager for bash scripts, inspired by tools like Homebrew and rbenv. It aimed to solve the problem of sharing and distributing shell scripts without complex installation procedures. The project remains actively maintained as an open-source tool on GitHub.

# SEE ALSO

[bash](/man/bash)(1), [bpkg](/man/bpkg)(1), [git](/man/git)(1), [brew](/man/brew)(1)
