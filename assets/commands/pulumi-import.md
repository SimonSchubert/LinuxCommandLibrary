# TAGLINE

Import existing cloud resources into Pulumi

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
> Import resources from a JSON file.

**-o**, **--out** _file_
> Output generated code to file.

**--protect**
> Protect imported resources (default: true).

**--generate-code**
> Generate code for imported resources (default: true).

**--parent** _urn_
> Parent resource URN.

**--provider** _urn_
> Provider resource URN.

**-s**, **--stack** _name_
> Target stack.

**-p**, **--parallel** _n_
> Allow P resource operations to run in parallel.

**-y**, **--yes**
> Skip confirmation prompts.

**-m**, **--message** _msg_
> Optional message for the update operation.

**--from** _converter_
> Invoke a converter to import resources.

**-d**, **--debug**
> Enable debug logging.

**-j**, **--json**
> Emit output as JSON.

# DESCRIPTION

**pulumi import** imports existing cloud resources into Pulumi state. Generates code to manage the resource. Useful for adopting existing infrastructure under Pulumi management.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-state](/man/pulumi-state)(1)

