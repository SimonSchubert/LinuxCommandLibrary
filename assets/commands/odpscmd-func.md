# TAGLINE

manages user-defined functions

# TLDR

**List functions**

```odpscmd func list```

**Create function**

```odpscmd func create [name] --class [classname] --resource [res]```

**Drop function**

```odpscmd func drop [name]```

**Describe function**

```odpscmd func desc [name]```

# SYNOPSIS

**odpscmd** **func** [_command_] [_options_]

# PARAMETERS

**list**
> List all functions.

**create** _NAME_
> Create function.

**drop** _NAME_
> Delete function.

**desc** _NAME_
> Show function details.

**--class** _NAME_
> Java class name.

**--resource** _RES_
> Resource dependency.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd func** manages user-defined functions. Creates and manages UDFs.

The tool handles MaxCompute functions. Part of odpscmd suite.

# CAVEATS

Legacy tool. Requires appropriate permissions.

# HISTORY

odpscmd func provides **UDF management** for MaxCompute Console.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odpscmd-resource](/man/odpscmd-resource)(1)

