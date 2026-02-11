# TAGLINE

Check PolicyKit authorization for actions

# TLDR

**Check authorization**

```pkcheck --action-id [org.freedesktop.action] --process [pid]```

**Check with user**

```pkcheck --action-id [action] --user [username]```

**Allow user interaction**

```pkcheck --action-id [action] --process [pid] --allow-user-interaction```

# SYNOPSIS

**pkcheck** [_options_]

# PARAMETERS

**--action-id** _ACTION_
> PolicyKit action ID.

**--process** _PID_
> Process ID to check.

**--user** _USER_
> User to check.

**--allow-user-interaction**
> Enable authentication dialog.

**--help**
> Display help.

# DESCRIPTION

**pkcheck** queries the PolicyKit (polkit) daemon to determine whether a specific process or user is authorized to perform a given action. It returns an exit code indicating whether the authorization is granted, denied, or requires authentication.

The tool is primarily used in scripts and system services to check permissions before performing privileged operations. With **--allow-user-interaction**, it can trigger an authentication dialog, prompting the user for credentials when the action requires it.

# CAVEATS

Part of PolicyKit. Requires polkitd running.

# HISTORY

pkcheck is part of **PolicyKit** for checking authorization policies.

# SEE ALSO

[pkaction](/man/pkaction)(1), [pkexec](/man/pkexec)(1), [polkit](/man/polkit)(8)

