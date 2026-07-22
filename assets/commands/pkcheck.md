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

**-a**, **--action-id** _ACTION_
> The polkit action identifier to authorize against (e.g., _org.freedesktop.systemd1.manage-units_).

**-p**, **--process** _PID_[,_START-TIME_,_UID_]
> Authorize the named process. Supplying _start-time_ and _uid_ closes a TOCTOU window where a PID can be reused.

**-u**, **--user** _USER_
> Authorize as a specific user (only callable by **root**).

**-s**, **--system-bus-name** _NAME_
> Authorize the D-Bus connection identified by _NAME_.

**--allow-user-interaction**
> Permit polkit to prompt the user via the registered authentication agent.

**--enable-internal-agent**
> Use a built-in text-mode agent when no graphical agent is registered (useful in TTY scripts).

**--detail** _KEY_ _VALUE_
> Pass extra detail key/value pairs to the polkit policy (used by some action rules).

**--help**
> Display help.

# DESCRIPTION

**pkcheck** queries the polkit daemon to determine whether a specific process, user, or D-Bus connection is authorized to perform a given action. It is the standard programmatic entry point for non-graphical authorization checks.

# EXIT STATUS

| Code | Meaning |
| --- | --- |
| **0** | Authorization granted. |
| **1** | Not authorized. |
| **2** | Help shown / invocation error. |
| **3** | Authentication is required but **--allow-user-interaction** was not given. |

Scripts can branch on these codes to decide whether to escalate via **pkexec** or skip the operation.

# CAVEATS

Part of PolicyKit. Requires polkitd running.

# HISTORY

pkcheck is part of **PolicyKit** for checking authorization policies.

# INSTALL

```apt: sudo apt install polkitd```

```apk: sudo apk add polkit-common```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pkaction](/man/pkaction)(1), [pkexec](/man/pkexec)(1), [polkit](/man/polkit)(8)

