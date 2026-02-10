# TAGLINE

manipulates package

# TLDR

**Get package.json field**

```npm pkg get [name]```

**Set package.json field**

```npm pkg set [name]="[value]"```

**Delete field**

```npm pkg delete [field]```

**Get multiple fields**

```npm pkg get [name] [version]```

**Set nested field**

```npm pkg set [scripts.test]="[jest]"```

# SYNOPSIS

**npm** **pkg** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Pkg subcommand.

**get** _FIELD_
> Read field value.

**set** _FIELD=VALUE_
> Write field value.

**delete** _FIELD_
> Remove field.

**--help**
> Display help information.

# DESCRIPTION

**npm pkg** manipulates package.json fields. Read and write properties programmatically.

The command modifies package.json. Useful for scripts and automation.

# CAVEATS

Modifies package.json. Supports JSON paths. Use quotes for values.

# HISTORY

npm pkg provides **package.json manipulation** from the command line.

# SEE ALSO

[npm](/man/npm)(1), [npm-init](/man/npm-init)(1), [npm-version](/man/npm-version)(1)

