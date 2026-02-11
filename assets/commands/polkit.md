# TAGLINE

Authorization framework for system privileges

# TLDR

**Check action authorization**

```pkcheck --action-id [action] --process [pid]```

**List actions**

```pkaction```

**Execute command as another user**

```pkexec [command]```

# SYNOPSIS

**polkit** [_options_]

# PARAMETERS

**pkcheck**
> Check authorization.

**pkaction**
> List actions.

**pkexec**
> Execute privileged command.

# DESCRIPTION

**polkit** (PolicyKit) is an authorization framework that allows non-privileged processes to communicate with privileged ones. It provides fine-grained control over system-wide privileges, enabling desktop applications to perform administrative tasks with proper user authorization.

Unlike sudo which grants full root access, polkit defines specific actions (like mounting disks or changing network settings) and policies controlling who can perform them. The framework consists of **pkexec** (execute privileged commands), **pkaction** (list actions), and **pkcheck** (check authorization).

# CONFIGURATION

**/usr/share/polkit-1/actions/**
> System-wide policy action definition files in XML format.

**/etc/polkit-1/rules.d/**
> Local authorization rules in JavaScript format (polkit >= 0.106).

**/etc/polkit-1/localauthority/**
> Legacy .pkla authorization files for older polkit versions.

# CAVEATS

Desktop integration. Requires polkitd daemon. See individual commands.

# HISTORY

PolicyKit was created by **Red Hat** for fine-grained authorization control.

# SEE ALSO

[pkexec](/man/pkexec)(1), [pkaction](/man/pkaction)(1), [polkitd](/man/polkitd)(8)

