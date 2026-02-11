# TAGLINE

List and inspect PolicyKit authorization actions

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

**pkaction** lists and displays PolicyKit (polkit) authorization actions registered on the system. Each action represents a privileged operation such as rebooting, mounting disks, or installing packages, along with the authentication requirements for different session types.

In verbose mode, it shows the description, vendor, and implicit authorization levels for each action. These levels determine whether an operation is allowed, denied, or requires authentication for active, inactive, and any-user sessions.

This tool is useful for system administrators to understand what privileged operations are available and how they are configured, or to verify that custom polkit rules are correctly installed.

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
