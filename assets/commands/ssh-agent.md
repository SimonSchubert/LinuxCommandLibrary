# TLDR

**Start ssh-agent** and set environment variables

```eval $(ssh-agent)```

**Start agent in background** for current shell

```ssh-agent -s```

**Start with C-shell** compatible output

```ssh-agent -c```

**Kill the running agent**

```ssh-agent -k```

**Run a command** with agent environment

```ssh-agent [command]```

**Set key lifetime** (default is forever)

```ssh-agent -t [1h]```

# SYNOPSIS

**ssh-agent** [**-c** | **-s**] [**-Dd**] [**-a** _SOCKET_] [**-t** _LIFE_] [_COMMAND_ [_ARGS_...]]

# PARAMETERS

**-s**
> Generate Bourne shell commands on stdout.

**-c**
> Generate C-shell commands on stdout.

**-k**
> Kill the current agent (using SSH_AGENT_PID).

**-d**
> Debug mode (don't fork).

**-D**
> Foreground mode without debug output.

**-a** _SOCKET_
> Bind to specified Unix socket instead of random.

**-t** _LIFE_
> Default maximum lifetime for added keys (e.g., 1h, 30m).

# DESCRIPTION

**ssh-agent** is a program that holds private keys used for SSH public key authentication. The agent runs in the background and provides keys to SSH clients without requiring passphrase re-entry.

Keys are added to the agent using **ssh-add**. Once added, the agent responds to authentication requests from SSH connections, including forwarded agent connections from remote hosts.

The agent outputs shell commands to set environment variables (SSH_AUTH_SOCK and SSH_AGENT_PID). These must be evaluated in the shell using **eval $(ssh-agent)** to enable communication between SSH clients and the agent.

# CAVEATS

The agent keeps decrypted private keys in memory. If compromised, all loaded keys are exposed. Use **-t** to limit key lifetime. Agent forwarding (-A in ssh) should be used carefully as remote hosts can use your agent. Kill the agent when done with sensitive sessions.

# HISTORY

ssh-agent was developed as part of OpenSSH, originally created by Tatu Ylönen and later maintained by the OpenBSD project. The agent model allows secure key storage while enabling passwordless SSH connections, and has become the standard approach for managing SSH keys across all major platforms.

# SEE ALSO

[ssh-add](/man/ssh-add)(1), [ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1)
