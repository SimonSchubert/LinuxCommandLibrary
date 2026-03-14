# TAGLINE

Manage SELinux network interface types

# TLDR

**List** all interface type definitions

```sudo semanage interface -l```

**Add** a network interface type definition

```sudo semanage interface -a -t type_name interface_name```

**Delete** an interface type definition

```sudo semanage interface -d interface_name```

**Modify** an interface type definition

```sudo semanage interface -m -t type_name interface_name```

List only **customized** definitions

```sudo semanage interface -l -C```

# SYNOPSIS

**semanage interface** [_options_]

# PARAMETERS

**-l**, **--list**
> List interface type definitions

**-a**, **--add**
> Add new definition

**-d**, **--delete**
> Delete definition

**-m**, **--modify**
> Modify existing definition

**-t**, **--type** _type_
> SELinux type for interface

**-C**, **--locallist**
> Show only local customizations

**-D**, **--deleteall**
> Remove all local customizations

**-E**, **--extract**
> Extract customizable commands for use in a transaction

**-n**, **--noheading**
> Do not print heading when listing

**-N**, **--noreload**
> Do not reload policy after commit

**-r**, **--range** _RANGE_
> MLS/MCS security range (MLS/MCS systems only)

# DESCRIPTION

**semanage interface** manages SELinux network interface type definitions. It assigns SELinux types to network interfaces for network-based access control.

Interface labeling allows SELinux policies to control network traffic based on interface types.

# CAVEATS

Changes require policy reload to take effect. Incorrect interface typing may affect network connectivity.

# HISTORY

Part of **policycoreutils**, providing SELinux policy management tools.

# SEE ALSO

[semanage](/man/semanage)(8), [semanage-port](/man/semanage-port)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [semanage-boolean](/man/semanage-boolean)(8)
