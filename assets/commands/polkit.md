# TAGLINE

Authorization framework for system privileges

# TLDR

**List all registered polkit actions**

```pkaction```

**Show details for a specific action**

```pkaction --verbose --action-id [org.freedesktop.login1.reboot]```

**Check if a process is authorized for an action**

```pkcheck --action-id [org.freedesktop.login1.reboot] --process [pid]```

**Execute a command as another user** (default: root)

```pkexec [command]```

**Execute a command as a specific user**

```pkexec --user [username] [command]```

# SYNOPSIS

**polkit** [_options_]

# PARAMETERS

**pkexec**
> Execute a command as another user with polkit authorization. Defaults to root if no user specified.

**pkaction**
> List or inspect registered polkit actions and their default policies.

**pkcheck**
> Check whether a process or system bus name is authorized for a given action.

**polkitd**
> The polkit system daemon that manages authorization decisions. Runs as the polkitd system user.

# DESCRIPTION

**polkit** (PolicyKit) is an authorization framework that allows non-privileged processes to communicate with privileged ones. It provides fine-grained control over system-wide privileges, enabling desktop applications to perform administrative tasks with proper user authorization.

Unlike sudo which grants full root access, polkit defines specific actions (like mounting disks or changing network settings) and policies controlling who can perform them. The framework consists of **pkexec** (execute privileged commands), **pkaction** (list/inspect actions), and **pkcheck** (check authorization). The **polkitd** daemon runs with minimal privileges and communicates over the system message bus.

# CONFIGURATION

**/usr/share/polkit-1/actions/**
> System-wide policy action definition files in XML format.

**/etc/polkit-1/rules.d/**
> Local authorization rules in JavaScript format (polkit >= 0.106).

**/etc/polkit-1/localauthority/**
> Legacy .pkla authorization files for older polkit versions.

# CAVEATS

Requires the polkitd daemon to be running. Desktop environments typically provide an authentication agent for graphical prompts. See individual command man pages for detailed options.

# HISTORY

PolicyKit was created by **David Zeuthen** at **Red Hat** for fine-grained authorization control on Linux desktop systems.

# SEE ALSO

[pkexec](/man/pkexec)(1), [pkaction](/man/pkaction)(1), [polkitd](/man/polkitd)(8)

