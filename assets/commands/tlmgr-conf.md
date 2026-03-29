# TAGLINE

Display and modify TeX Live configuration

# TLDR

**Show general TeX Live configuration**

```tlmgr conf```

**Show all texmf.cnf settings**

```tlmgr conf texmf```

**Show the value of a single tlmgr setting**

```tlmgr conf tlmgr [setting]```

**Set a tlmgr configuration value**

```tlmgr conf tlmgr [setting] [value]```

**Delete a setting from the tlmgr config file**

```tlmgr conf tlmgr --delete [setting]```

**List auxiliary texmf trees**

```tlmgr conf auxtrees show```

**Add an auxiliary texmf tree**

```tlmgr conf auxtrees add [/path/to/tree]```

**Remove an auxiliary texmf tree**

```tlmgr conf auxtrees remove [/path/to/tree]```

# SYNOPSIS

**tlmgr conf** [texmf|tlmgr|updmap [**--conffile** _file_] [**--delete**] [_key_ [_value_]]]

**tlmgr conf** auxtrees [**--conffile** _file_] [show|add|remove] [_value_]

# PARAMETERS

**texmf**
> Show or set values in texmf.cnf.

**tlmgr**
> Show or set values in the tlmgr configuration file.

**updmap**
> Show or set values in the first found updmap.cfg.

**auxtrees**
> Manage additional (auxiliary) texmf trees. Subcommands: show, add, remove.

**--conffile** _file_
> Use the specified configuration file instead of the default.

**--delete**
> Remove the key entirely from the configuration file (rather than commenting it out).

_key_ _value_
> Set the configuration key to value in the chosen config file.

# DESCRIPTION

**tlmgr conf** displays and modifies TeX Live configuration settings. With no arguments it shows general configuration information (active files, paths, and settings). With a system argument (texmf, tlmgr, or updmap) it shows all key/value pairs saved in the corresponding config file. Supplying a key shows only that key's value; also supplying a value sets it. The **--delete** flag removes a key entirely rather than overriding it.

The **auxtrees** subcommand manages additional texmf trees that are searched alongside the standard TeX Live tree.

Part of the TeX Live Manager.

# SEE ALSO

[tlmgr-option](/man/tlmgr-option)(1), [tlmgr](/man/tlmgr)(1)

