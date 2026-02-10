# TAGLINE

executes scripts defined in package

# TLDR

**Run script from package.json**

```npm run [script-name]```

**List available scripts**

```npm run```

**Run with arguments**

```npm run [script] -- [--flag]```

**Run silently**

```npm run [script] --silent```

**Run if exists**

```npm run [script] --if-present```

# SYNOPSIS

**npm** **run** [_script_] [-- _args_]

# PARAMETERS

_SCRIPT_
> Script name from package.json.

_ARGS_
> Arguments to pass to script.

**--silent**
> Suppress output.

**--if-present**
> Don't fail if missing.

**--help**
> Display help information.

# DESCRIPTION

**npm run** executes scripts defined in package.json. Core workflow command.

The command runs scripts section. Passes additional arguments after --.

# CAVEATS

Scripts in package.json. Use -- for script args. Alias: npm run-script.

# HISTORY

npm run is the **primary mechanism** for executing project-defined scripts.

# SEE ALSO

[npm](/man/npm)(1), [npm-start](/man/npm-start)(1), [npm-test](/man/npm-test)(1)

