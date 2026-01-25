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
> Package to install.

**-c** _cmd_
> Shell command to run.

**-y**, **--yes**
> Skip confirmation prompts.

**--no**
> Skip if package needs download.

**--call** _cmd_
> Execute shell command.

# DESCRIPTION

**npm exec** runs a command from a local or remote npm package. It's similar to npx but integrated into npm. The command can run locally installed packages or temporarily download and execute packages.

Double dash (--) separates npm exec options from command arguments.

# EXAMPLES

```bash
# Run local eslint
npm exec eslint .

# Run with specific package
npm exec -p typescript -- tsc --version

# Run create-react-app
npm exec -- create-react-app my-app

# Multiple packages
npm exec -p cowsay -p lolcatjs -c "cowsay hi | lolcat"
```

# CAVEATS

Different from npx in some behaviors. Use -- to separate args. May prompt for remote packages.

# HISTORY

npm exec was added in npm 7 as a built-in alternative to npx, providing similar functionality with better npm integration.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [npm-run-script](/man/npm-run-script)(1)
