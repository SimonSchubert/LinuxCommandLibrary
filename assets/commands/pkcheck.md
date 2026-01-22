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

**pkcheck** checks PolicyKit authorization. Verifies action permissions.

The tool queries polkit daemon. Used for privilege checks.

pkcheck verifies authorization.

# CAVEATS

Part of PolicyKit. Requires polkitd running.

# HISTORY

pkcheck is part of **PolicyKit** for checking authorization policies.

# SEE ALSO

[pkaction](/man/pkaction)(1), [pkexec](/man/pkexec)(1), [polkit](/man/polkit)(8)

