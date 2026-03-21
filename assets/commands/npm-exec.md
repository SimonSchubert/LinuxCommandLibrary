# TAGLINE

Run a command from a local or remote npm package

# TLDR

**Run a local package binary**

```npm exec [command]```

**Run a command with arguments**

```npm exec -- [command] [args]```

**Run a package from the registry**

```npm exec -p [package] -- [command]```

**Run a specific package version**

```npm exec -p [package]@[version] -- [command]```

**Run with multiple packages available**

```npm exec -p [pkg1] -p [pkg2] -- [command]```

**Run a shell command string in the package environment**

```npm exec -c '[shell_command]'```

**Auto-accept installation prompts for remote packages**

```npm exec -y -p [package] -- [command]```

# SYNOPSIS

**npm exec** [_options_] [-- _command_ [_args_...]]

# PARAMETERS

**-p**, **--package** _pkg_
> Package to install (can be specified multiple times).

**-c**, **--call** _cmd_
> Shell command string to run in the package environment.

**-y**, **--yes**
> Skip confirmation prompts when downloading remote packages.

**--no**
> Refuse to install packages not already available locally.

**-w**, **--workspace** _name_
> Run in the context of the specified workspace.

**--workspaces**
> Run in the context of all configured workspaces.

**--include-workspace-root**
> Include the workspace root when using --workspaces.

# DESCRIPTION

**npm exec** runs a command from a local or remote npm package. It is similar to **npx** but integrated directly into the npm CLI. The command can run locally installed packages or temporarily download and execute packages from the npm registry.

The double dash (**--**) separates npm exec options from the command and its arguments. Without **--**, npm may interpret arguments as its own options. When run without positional arguments or **--call**, it opens an interactive shell with the package environment configured in the PATH.

When **--package** is not specified, npm exec will try to determine the executable from the first positional argument, matching it against packages in the local project or the npm registry.

# CAVEATS

Unlike **npx**, npm exec requires **--** before the command when passing arguments. May prompt for confirmation when downloading remote packages unless **-y** or **--no** is specified. The **--call** option runs the command in a shell, so shell syntax like pipes and redirects is supported.

# HISTORY

npm exec was added in **npm 7** as a built-in alternative to npx, providing similar functionality with better npm integration and workspace support.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [npm-run-script](/man/npm-run-script)(1), [npm-init](/man/npm-init)(1), [npm-install](/man/npm-install)(1)
