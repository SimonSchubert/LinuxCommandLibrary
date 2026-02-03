# TLDR

**Show SSH config**

```vagrant ssh-config```

**Output for specific host**

```vagrant ssh-config --host [name]```

**Append to SSH config**

```vagrant ssh-config >> ~/.ssh/config```

# SYNOPSIS

**vagrant** **ssh-config** [_options_] [_name_]

# PARAMETERS

**--host** _name_
> Host name for config.

# DESCRIPTION

**vagrant ssh-config** outputs SSH configuration for connecting to the VM. Displays host, user, port, and identity file settings. Can be appended to ~/.ssh/config for direct ssh access.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh](/man/vagrant-ssh)(1), [ssh](/man/ssh)(1)

