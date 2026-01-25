# TLDR

**List all actions**

```pkaction```

**Show action details**

```pkaction --verbose --action-id [org.freedesktop.login1.reboot]```

**List actions matching pattern**

```pkaction | grep [pattern]```

**Show action in verbose mode**

```pkaction -v -a [action.id]```

# SYNOPSIS

**pkaction** [_options_]

# PARAMETERS

**--action-id**, **-a** _id_
> Show specific action.

**--verbose**, **-v**
> Verbose output.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**pkaction** lists and displays PolicyKit actions. PolicyKit controls fine-grained access to system operations, and pkaction shows what actions are available and their authentication requirements.

# EXAMPLES

```bash
# List all actions
pkaction

# Show reboot action details
pkaction -v -a org.freedesktop.login1.reboot

# Find package manager actions
pkaction | grep -i package

# Show details for all actions
pkaction --verbose
```

# OUTPUT

```
$ pkaction -v -a org.freedesktop.login1.reboot
org.freedesktop.login1.reboot:
  description:       Reboot the system
  message:           Authentication is required to reboot
  vendor:            The systemd Project
  implicit any:      auth_admin_keep
  implicit inactive: auth_admin_keep
  implicit active:   yes
```

# CAVEATS

Requires PolicyKit. Actions defined in /usr/share/polkit-1/actions/. Changing policies requires pkexec or root.

# HISTORY

pkaction is part of **PolicyKit** (polkit), the authorization framework developed by **Red Hat** for fine-grained access control.

# SEE ALSO

[pkexec](/man/pkexec)(1), [pkcheck](/man/pkcheck)(1), [polkit](/man/polkit)(8)
