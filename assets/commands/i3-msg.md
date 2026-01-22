# TLDR

**Switch workspace**

```i3-msg workspace [3]```

**Move window**

```i3-msg move left```

**Execute command**

```i3-msg exec [firefox]```

**Reload config**

```i3-msg reload```

**Get workspaces**

```i3-msg -t get_workspaces```

**Change layout**

```i3-msg layout [tabbed]```

# SYNOPSIS

**i3-msg** [_options_] _command_

# PARAMETERS

_COMMAND_
> i3 command to execute.

**-t** _TYPE_
> Message type (command, get_workspaces).

**-s** _SOCKET_
> Socket path.

**-q**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**i3-msg** sends commands to a running i3 window manager. It provides scriptable control over windows, workspaces, and layouts.

The tool can execute any i3 command and query state information. It's essential for scripting and automation.

i3-msg communicates with i3 WM.

# CAVEATS

Requires running i3. Socket must be accessible. Commands must be valid i3 syntax.

# HISTORY

i3-msg is part of the **i3** window manager project for IPC communication.

# SEE ALSO

[i3](/man/i3)(1), [swaymsg](/man/swaymsg)(1), [i3lock](/man/i3lock)(1)
