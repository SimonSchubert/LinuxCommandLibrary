# TAGLINE

runs the stop script defined in package

# TLDR

**Stop application**

```npm stop```

**Do not fail if no stop script exists**

```npm stop --if-present```

**Pass arguments to the stop script**

```npm stop -- [--flag] [value]```

# SYNOPSIS

**npm** **stop** [_args_...]

# DESCRIPTION

**npm stop** runs the stop script defined in package.json. Executes prestop and poststop lifecycle scripts. Used to stop running server processes.

# PARAMETERS

**--if-present**
> Do not error if no stop script is defined.

**--silent**, **--quiet**
> Suppress output from the spawned script.

**--ignore-scripts**
> Skip pre/post lifecycle scripts.

# SEE ALSO

[npm](/man/npm)(1), [npm-start](/man/npm-start)(1), [npm-restart](/man/npm-restart)(1)

