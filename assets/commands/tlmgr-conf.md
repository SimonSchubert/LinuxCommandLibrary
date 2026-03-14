# TAGLINE

Display and modify TeX Live configuration

# TLDR

**Show configuration**

```tlmgr conf```

**Show texmf.cnf**

```tlmgr conf texmf```

**Show tlmgr settings**

```tlmgr conf tlmgr```

**Set configuration value**

```tlmgr conf tlmgr [option] [value]```

# SYNOPSIS

**tlmgr conf** [_system_] [_option_ [_value_]]

# PARAMETERS

**texmf**
> Show texmf.cnf configuration.

**tlmgr**
> Show/set tlmgr configuration.

**updmap**
> Show updmap configuration.

**auxtrees**
> Manage auxiliary trees.

_option_ _value_
> Set configuration option.

# DESCRIPTION

**tlmgr conf** displays and modifies TeX Live configuration settings. It can show paths, directories, and option values for the various TeX Live subsystems (texmf, tlmgr, updmap). When given an option and value, it modifies the configuration. Part of the TeX Live Manager.

# SEE ALSO

[tlmgr-option](/man/tlmgr-option)(1), [tlmgr](/man/tlmgr)(1)

