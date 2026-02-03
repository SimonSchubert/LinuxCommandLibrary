# TLDR

**Import existing resource**

```pulumi import [type] [name] [id]```

**Import from file**

```pulumi import -f [resources.json]```

**Import and generate code**

```pulumi import [type] [name] [id] -o [code.ts]```

**Import without protecting**

```pulumi import --protect=false [type] [name] [id]```

# SYNOPSIS

**pulumi** **import** [_options_] _type_ _name_ _id_

# PARAMETERS

**-f**, **--file** _file_
> Import from JSON file.

**-o**, **--out** _file_
> Output generated code.

**--protect**
> Protect imported resources.

**--parent** _urn_
> Parent resource URN.

**-s**, **--stack** _name_
> Target stack.

**-y**, **--yes**
> Skip confirmation.

# DESCRIPTION

**pulumi import** imports existing cloud resources into Pulumi state. Generates code to manage the resource. Useful for adopting existing infrastructure under Pulumi management.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-state](/man/pulumi-state)(1)

