# TAGLINE

Programmable configuration language from Apple

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

**pkl** is a programmable configuration language developed by Apple. It evaluates .pkl files and generates output in multiple formats including JSON, YAML, XML, and property lists, combining the readability of static configuration with the power of a programming language.

Pkl provides type safety, validation, and code reuse through classes and modules, catching configuration errors at evaluation time rather than at deployment. The REPL mode allows interactive exploration and testing of configuration expressions.

# CAVEATS

Apple-developed. Supports multiple output formats.

# HISTORY

Pkl was created by **Apple** as a **programmable configuration language**.

# SEE ALSO

[jsonnet](/man/jsonnet)(1), [dhall](/man/dhall)(1)

