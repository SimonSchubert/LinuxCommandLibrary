# TLDR

**List running domains**

```virsh list```

**List all domains**

```virsh list --all```

**List with details**

```virsh list --all --title```

**List specific state**

```virsh list --state-shutoff```

# SYNOPSIS

**virsh** **list** [_options_]

# PARAMETERS

**--all**
> Include inactive domains.

**--state-running**
> Only running.

**--state-paused**
> Only paused.

**--state-shutoff**
> Only shut off.

**--title**
> Show titles.

**--autostart**
> Show autostart status.

# DESCRIPTION

**virsh list** displays virtual machines. Shows domain ID, name, and state. By default only shows running VMs; use --all for complete list.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-start](/man/virsh-start)(1)

