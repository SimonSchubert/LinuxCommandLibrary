# TAGLINE

npm registry manager

# TLDR

**List registries**

```nrm ls```

**Use registry**

```nrm use [taobao]```

**Add custom registry**

```nrm add [name] [url]```

**Delete registry**

```nrm del [name]```

**Test registry speed**

```nrm test```

**Show current registry**

```nrm current```

# SYNOPSIS

**nrm** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> nrm subcommand.

**ls**
> List registries.

**use** _NAME_
> Switch registry.

**add** _NAME_ _URL_
> Add registry.

**del** _NAME_
> Remove registry.

**test**
> Test speeds.

**--help**
> Display help information.

# DESCRIPTION

**nrm** is npm registry manager. Quickly switch between npm registries.

The tool manages registry URLs. Includes common registries preset.

# CAVEATS

Node.js tool. Install with npm install -g. Modifies .npmrc.

# HISTORY

nrm was created to **easily switch** between different npm registries.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1), [yarn](/man/yarn)(1)

