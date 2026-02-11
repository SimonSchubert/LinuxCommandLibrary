# TAGLINE

Portable shell environment over SSH

# TLDR

**Connect to a host** with your portable shell

```xxh [hostname]```

**Connect using a specific shell**

```xxh [hostname] +s [zsh]```

**Connect with SSH arguments**

```xxh -i [~/.ssh/id_rsa] -p [2222] [hostname]```

**Install shell on first connect** without prompts

```xxh [hostname] +s [fish] +i```

**Install a plugin** before connecting

```xxh [hostname] +I [xxh-plugin-zsh-ohmyzsh]```

**Connect in hermetic mode** (isolated home)

```xxh [hostname] +hh```

**List available shells**

```xxh +LS```

**Remove xxh from remote host**

```xxh [hostname] +hc```

# SYNOPSIS

**xxh** [_ssh_options_] _host_ [**+s** _shell_] [**+i**] [**+I** _plugin_] [**+hh**]

# PARAMETERS

**+s**, **+shell** _shell_
> Specify shell to use (zsh, bash, fish, xonsh, osquery)

**+i**, **+install**
> Install shell without confirmation prompts

**+I**, **+install-plugin** _plugin_
> Install a plugin before connecting

**+hh**, **+hermetic-home**
> Use hermetic home directory (~/.xxh isolated)

**+hc**, **+host-clean**
> Remove xxh directory from remote host

**+LS**, **+list-shells**
> List available portable shells

**+LP**, **+list-plugins**
> List available plugins

**-i** _keyfile_
> SSH identity file (passed to ssh)

**-p** _port_
> SSH port (passed to ssh)

# DESCRIPTION

**xxh** brings your favorite shell and configurations to any remote host via SSH without requiring root access or system installations. It uploads portable versions of shells (zsh, fish, bash, xonsh) along with your plugins and configurations.

When you run **xxh host**, it downloads a portable shell locally (cached for reuse), uploads it to the remote host's **~/.xxh** directory, then connects via SSH and runs that shell. Your aliases, themes, and plugins work immediately.

The tool is **hermetic**: removing the **~/.xxh** directory from the remote host completely restores the original environment. Different hermetic levels control how isolated the xxh environment is from the system.

Plugins extend functionality, adding tools like oh-my-zsh, powerlevel10k, or command-line utilities. Plugins are installed with **+I plugin-name**.

# CAVEATS

xxh requires Python 3.6+ on the local machine. The first connection to a new host may be slower while uploading the portable shell. Some plugins may have additional dependencies. The remote host needs basic tools like tar and gzip.

# HISTORY

**xxh** was created to solve the problem of losing custom shell environments when connecting to remote servers. Written in Python, it provides a way to maintain consistent command-line experience across multiple machines. The project supports multiple shells through community-contributed portable shell packages.

# SEE ALSO

[ssh](/man/ssh)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [bash](/man/bash)(1)
