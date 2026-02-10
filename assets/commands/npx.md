# TAGLINE

executes npm packages

# TLDR

**Run package command**

```npx [package-name]```

**Run specific version**

```npx [package]@[version]```

**Run without installing**

```npx --no-install [package]```

**Run with arguments**

```npx [create-react-app] [my-app]```

**Run from GitHub**

```npx github:[user]/[repo]```

**Run local binary**

```npx [./node_modules/.bin/command]```

**Execute package command**

```npx -p [package] -c "[command]"```

# SYNOPSIS

**npx** [_options_] _package_ [_args_]

# PARAMETERS

_PACKAGE_
> Package to execute.

_ARGS_
> Arguments to pass.

**--no-install**
> Don't install missing.

**-p** _PKG_
> Package to install.

**-c** _CMD_
> Command to run.

**--help**
> Display help information.

# DESCRIPTION

**npx** executes npm packages. Runs packages without global installation.

The tool fetches and runs commands. Ideal for one-off tool usage.

# CAVEATS

Downloads on first run. Caches packages. Part of npm 5.2+.

# HISTORY

npx was introduced with **npm 5.2** to simplify running npm packages without installation.

# SEE ALSO

[npm](/man/npm)(1), [npm-exec](/man/npm-exec)(1), [yarn](/man/yarn)(1)

