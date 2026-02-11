# TAGLINE

Apply configuration from Puppet server

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

**puppet agent** is the client component of the Puppet configuration management system. It connects to a Puppet server, retrieves a compiled catalog of the desired system state, and applies the necessary changes to bring the local machine into compliance. The agent handles SSL certificate management, fact submission via Facter, and detailed reporting of applied changes.

In daemon mode, the agent runs as a background service and checks in with the server at a configurable interval, typically every 30 minutes. For manual operations, **--test** performs a single run with verbose output, while **--noop** previews what changes would be made without actually applying them. The agent can be temporarily disabled with a lock message to prevent runs during maintenance windows.

# CONFIGURATION

**/etc/puppetlabs/puppet/puppet.conf**
> Agent configuration including server hostname, run interval, environment, certificate name, and splay settings.

**/etc/puppetlabs/puppet/ssl/**
> SSL certificate directory containing the agent's private key, signed certificate, and CA certificate for server authentication.

**/opt/puppetlabs/puppet/cache/state/agent_disabled.lock**
> Lock file created when the agent is disabled, containing the disable message as JSON.

# CAVEATS

Requires Puppet installation. Needs server or local manifests. Root privileges required.

# HISTORY

**Puppet** was created by **Luke Kanies** in 2005. The agent component manages system configuration across infrastructure.

# SEE ALSO

[puppet](/man/puppet)(1), [facter](/man/facter)(1), [ansible](/man/ansible)(1)
