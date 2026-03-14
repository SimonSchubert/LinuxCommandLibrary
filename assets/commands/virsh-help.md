# TAGLINE

Display virsh command help

# TLDR

**List all available commands** grouped by category

```virsh help```

**Show detailed help for a specific command**

```virsh help [start]```

**List all domain management commands**

```virsh help domain```

**List all network commands**

```virsh help network```

**List all storage pool commands**

```virsh help pool```

# SYNOPSIS

**virsh** **help** [_command_|_group_]

# PARAMETERS

_command_
> Show detailed help for a specific virsh command.

**domain**
> Domain (virtual machine) management commands.

**interface**
> Host interface commands.

**network**
> Virtual network commands.

**nodedev**
> Host device commands.

**pool**
> Storage pool commands.

**volume**
> Storage volume commands.

**snapshot**
> Domain snapshot commands.

**monitor**
> Connection and event monitoring commands.

# DESCRIPTION

**virsh help** displays help for virsh commands and command groups. When called without arguments, it lists all commands grouped by category with a keyword for each group. When given a command name, it shows detailed usage, options, and description for that command. When given a group keyword, it lists only the commands in that group.

# SEE ALSO

[virsh](/man/virsh)(1)

