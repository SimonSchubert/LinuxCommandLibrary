# TLDR

**Run agent once**

```puppet agent --test```

**Run in foreground**

```puppet agent --no-daemonize --verbose```

**Dry run (noop)**

```puppet agent --test --noop```

**Run with specific server**

```puppet agent --test --server [puppet.example.com]```

**Enable agent**

```puppet agent --enable```

**Disable agent**

```puppet agent --disable "[reason]"```

# SYNOPSIS

**puppet agent** [_--test_] [_--noop_] [_--server host_] [_options_]

# PARAMETERS

**--test**
> Single run with output.

**--noop**
> Dry run mode.

**--server** _HOST_
> Puppet server.

**--no-daemonize**
> Run in foreground.

**--enable**
> Enable agent runs.

**--disable** _MSG_
> Disable with message.

**--verbose**
> Verbose output.

**--debug**
> Debug output.

# DESCRIPTION

**puppet agent** runs Puppet configuration. It enforces desired state.

Connects to Puppet server. Downloads and applies catalog.

Test mode for manual runs. Single execution with output.

Noop mode previews changes. No actual modifications.

Daemon mode for continuous. Runs periodically.

# CAVEATS

Requires Puppet installation. Needs server or local manifests. Root privileges required.

# HISTORY

**Puppet** was created by **Luke Kanies** in 2005. The agent component manages system configuration across infrastructure.

# SEE ALSO

[puppet](/man/puppet)(1), [facter](/man/facter)(1), [ansible](/man/ansible)(1)
