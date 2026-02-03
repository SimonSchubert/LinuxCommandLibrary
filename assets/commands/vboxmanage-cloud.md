# TLDR

**List cloud instances**

```vboxmanage cloud --provider=[provider] --profile=[profile] instance list```

**Create cloud instance**

```vboxmanage cloud --provider=[provider] --profile=[profile] instance create```

**Terminate cloud instance**

```vboxmanage cloud --provider=[provider] --profile=[profile] instance terminate --id=[id]```

# SYNOPSIS

**vboxmanage** **cloud** **--provider**=_provider_ **--profile**=_profile_ _command_

# PARAMETERS

**--provider** _name_
> Cloud provider (e.g., OCI).

**--profile** _name_
> Cloud profile name.

**instance** _cmd_
> Instance operations.

**image** _cmd_
> Image operations.

**network** _cmd_
> Network operations.

# DESCRIPTION

**vboxmanage cloud** manages cloud instances from VirtualBox. Integrates with Oracle Cloud Infrastructure (OCI) for managing cloud VMs alongside local VMs.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1)

