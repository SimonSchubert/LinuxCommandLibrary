# TLDR

**List functions**

```odps func list```

**Create function**

```odps func create [name] -c [class] -r [resource]```

**Delete function**

```odps func drop [name]```

**Show function info**

```odps func desc [name]```

# SYNOPSIS

**odps** **func** [_command_] [_options_]

# PARAMETERS

**list**
> List user functions.

**create** _NAME_
> Create new function.

**drop** _NAME_
> Delete function.

**desc** _NAME_
> Describe function.

**-c** _CLASS_
> Function class name.

**-r** _RESOURCE_
> Resource reference.

**--help**
> Display help information.

# DESCRIPTION

**odps func** manages MaxCompute user-defined functions. Creates and lists UDFs.

The tool handles function lifecycle. Part of ODPS CLI.

odps func manages UDFs.

# CAVEATS

Requires project permissions. Part of Alibaba Cloud ODPS tools.

# HISTORY

odps func provides **UDF management** for Alibaba Cloud MaxCompute.

# SEE ALSO

[odps](/man/odps)(1), [odps-resource](/man/odps-resource)(1)

