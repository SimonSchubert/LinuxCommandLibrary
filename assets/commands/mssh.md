# TAGLINE

GTK+ based SSH client for issuing commands to multiple servers

# TLDR

Connect to **multiple SSH servers**

```mssh [user@host1] [user@host2] [user@host3]```

Connect to a **predefined group** from ~/.mssh_clusters

```mssh -a [alias_name]```

Connect to hosts on **specific ports**

```mssh [user@host1:2222] [user@host2:22]```

# SYNOPSIS

**mssh** [_options_] (**-a** _alias_ | _hosts_[:_port_])

# PARAMETERS

**-a, --alias _alias_**
> Open hosts associated with named alias from configuration

**-h, --help**
> Display help and exit

**-V, --version**
> Output version information and exit

# KEYBOARD SHORTCUTS

**Modifier + Arrow keys**
> Navigate between terminal windows

**Ctrl + Shift + x**
> Toggle terminal maximization

**Ctrl + Shift + n**
> Open dialog to add new hosts

# CONFIGURATION

Configuration file: **~/.mssh_clusters**

Aliases map to space-separated host lists:
```
webservers = web1.example.com web2.example.com web3.example.com
dbservers = db1.example.com db2.example.com
```

Command aliases in curly braces map to text sent to terminals:
```
{uptime} = uptime
{df} = df -h
```

# DESCRIPTION

**mssh** (MultiSSH) is a GTK+ based SSH client for issuing commands to multiple servers simultaneously. It displays multiple terminal windows in a grid layout, allowing administrators to type commands once and have them executed across all connected hosts.

The interface supports navigation between terminals, individual or grouped input, and predefined server groups through the configuration file.

# CAVEATS

Requires a graphical display (X11 or Wayland with XWayland). Commands are sent to all terminals by default; use mouse click to select individual terminals. Host aliases must be defined in ~/.mssh_clusters before use.

# HISTORY

**mssh** was originally created by **Bradley Smith** in 2009 and is currently maintained by **Héctor García**. It provides a graphical alternative to text-based multi-SSH tools like cssh and pdsh.

# SEE ALSO

[ssh](/man/ssh)(1), [cssh](/man/cssh)(1), [tmux](/man/tmux)(1)
