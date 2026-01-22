# TLDR

**Evaluate Pkl file**

```pkl eval [config.pkl]```

**Output as JSON**

```pkl eval -f json [config.pkl]```

**Output as YAML**

```pkl eval -f yaml [config.pkl]```

**Check syntax**

```pkl check [config.pkl]```

**Start REPL**

```pkl repl```

# SYNOPSIS

**pkl** [_command_] [_options_] [_file_]

# PARAMETERS

**eval** _FILE_
> Evaluate configuration.

**check** _FILE_
> Validate syntax.

**repl**
> Start interactive mode.

**-f** _FORMAT_
> Output format.

**--help**
> Display help.

# DESCRIPTION

**pkl** is Apple's configuration language. Programmable configuration.

The tool generates JSON, YAML, and more. Type-safe configuration.

pkl evaluates config files.

# CAVEATS

Apple-developed. Supports multiple output formats.

# HISTORY

Pkl was created by **Apple** as a **programmable configuration language**.

# SEE ALSO

[jsonnet](/man/jsonnet)(1), [dhall](/man/dhall)(1)

