# TAGLINE

nim package manager

# TLDR

**Install package**

```nimble install [package]```

**Build project**

```nimble build```

**Run project**

```nimble run```

**Initialize project**

```nimble init```

**Search packages**

```nimble search [query]```

**List installed packages**

```nimble list --installed```

**Update packages**

```nimble refresh```

**Run tests**

```nimble test```

# SYNOPSIS

**nimble** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Nimble command.

**install** _PKG_
> Install package.

**build**
> Build current project.

**run**
> Build and run.

**init**
> Initialize new project.

**search** _QUERY_
> Search packages.

**test**
> Run tests.

**--help**
> Display help information.

# DESCRIPTION

**nimble** is the Nim package manager. It installs dependencies and manages projects.

The tool handles package installation. Supports local and remote packages.

# CAVEATS

Requires Nim. Package registry based. nimble.directory for packages.

# HISTORY

Nimble was created as the **official package manager** for the Nim programming language.

# SEE ALSO

[nim](/man/nim)(1), [npm](/man/npm)(1), [cargo](/man/cargo)(1)

