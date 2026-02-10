# TAGLINE

launches a console for the specified container

# TLDR

**Connect** to container console

```sudo lxc-console container_name```

Connect to **specific tty**

```sudo lxc-console -t 1 container_name```

**Exit** console

```Ctrl+a q```

Display **help**

```lxc-console --help```

# SYNOPSIS

**lxc-console** [_options_] **-n** _container_name_

# DESCRIPTION

**lxc-console** launches a console for the specified container. It connects to a tty device provided by the container's init system, allowing interactive access.

# PARAMETERS

**-n, --name NAME**
> Name of the container to connect to

**-t, --tty N**
> Connect to tty number N instead of an available one

**-e, --escape CHAR**
> Set escape character (default: 'a' for Ctrl+a)

**-P, --lxcpath PATH**
> Use alternate container path

**-?, --help**
> Display help information

# CAVEATS

The escape sequence to exit the console is Ctrl+a followed by q (unless changed with -e). The container must have an appropriate getty or login process running on its tty.

# HISTORY

**lxc-console** is part of **LXC** (Linux Containers), providing OS-level virtualization for running multiple isolated Linux systems on a single host.

# SEE ALSO

[lxc-start](/man/lxc-start)(1), [lxc-attach](/man/lxc-attach)(1), [lxc-stop](/man/lxc-stop)(1)
