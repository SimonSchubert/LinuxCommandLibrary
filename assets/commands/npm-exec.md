# TAGLINE

runs a command from a local or remote npm package

# TLDR

**Run local package binary**

```npm exec [command]```

**Run with arguments**

```npm exec -- [command] [args]```

**Run package from registry**

```npm exec -p [package] -- [command]```

**Run specific package version**

```npm exec -p [package]@[version] -- [command]```

**Run with multiple packages**

```npm exec -p [pkg1] -p [pkg2] -- [command]```

# SYNOPSIS

**npm exec** [_options_] [-- _command_]

# PARAMETERS

**-p**, **--package** _pkg_
> Package to install (can be specified multiple times).

**-c**, **--call** _cmd_
> Shell command to run in the package environment.

**-y**, **--yes**
> Skip confirmation prompts for remote packages.

**--no**
> Refuse to install packages not already available locally.

**-w**, **--workspace** _name_
> Run in the context of the specified workspace.

**--workspaces**
> Run in the context of all configured workspaces.

# DESCRIPTION

**npm exec** runs a command from a local or remote npm package. It's similar to npx but integrated into npm. The command can run locally installed packages or temporarily download and execute packages from the registry.

Double dash (--) separates npm exec options from the command and its arguments. Without --, npm may interpret arguments as its own options. When run without positional arguments or --call, it opens an interactive shell with the package environment configured.

# CAVEATS

Unlike npx, npm exec requires -- before the command when passing arguments. May prompt for confirmation when downloading remote packages unless -y or --no is specified.

# HISTORY

npm exec was added in npm 7 as a built-in alternative to npx, providing similar functionality with better npm integration.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [npm-run-script](/man/npm-run-script)(1)
