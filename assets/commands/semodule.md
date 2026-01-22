# TLDR

**List** all installed policy modules

```sudo semodule -l```

**Install** a new policy module

```sudo semodule -i path/to/module.pp```

**Remove** a policy module

```sudo semodule -r module_name```

**Enable** a policy module

```sudo semodule -e module_name```

**Disable** a policy module

```sudo semodule -d module_name```

**Reload** all policy modules

```sudo semodule -R```

List with **verbose** version info

```sudo semodule -l -v```

# SYNOPSIS

**semodule** [_options_]

# PARAMETERS

**-l**, **--list**
> List installed modules

**-i**, **--install** _file_
> Install policy module (.pp file)

**-r**, **--remove** _name_
> Remove module

**-e**, **--enable** _name_
> Enable module

**-d**, **--disable** _name_
> Disable module

**-R**, **--reload**
> Reload all modules

**-v**, **--verbose**
> Show verbose information

# DESCRIPTION

**semodule** manages SELinux policy modules. It installs, removes, enables, and disables modular policy components that extend the base SELinux policy.

Policy modules allow customization of SELinux rules without modifying the base policy.

# CAVEATS

Module changes require policy reload. Installing incompatible modules may cause policy errors.

# HISTORY

Part of **policycoreutils**, providing modular SELinux policy management.

# SEE ALSO

[audit2allow](/man/audit2allow)(1), [semanage](/man/semanage)(8)
