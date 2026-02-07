# TAGLINE

privileged command execution with Active Directory

# TLDR

**Run command** as root

```dzdo [command]```

**Run as specific** user

```dzdo -u [username] [command]```

**Run with login** shell

```dzdo -i```

**List user's permissions**

```dzdo -l```

# SYNOPSIS

**dzdo** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to execute with elevated privileges.

**-u** _USER_
> Run as specified user.

**-i**
> Run login shell.

**-l**
> List allowed commands.

**-n**
> Non-interactive (no password prompt).

**-v**
> Validate/extend credentials.

**--help**
> Display help information.

# DESCRIPTION

**dzdo** is Centrify's replacement for sudo, providing privileged command execution with Active Directory integration. It allows users to run commands as root or other users based on centralized policy.

dzdo integrates with Centrify's DirectControl for unified identity management across Unix/Linux and Windows systems. Policies are managed in Active Directory rather than local sudoers files.

The tool provides similar functionality to sudo but with enterprise authentication and authorization features.

# CONFIGURATION

**/etc/centrifydc/centrifydc.conf**
> Centrify DirectControl configuration controlling AD integration and authentication settings.

# CAVEATS

Requires Centrify DirectControl. Policies managed centrally in AD. May have different behavior than sudo in edge cases. Enterprise licensing required.

# HISTORY

dzdo is part of **Centrify DirectControl** (now **Delinea**), providing sudo-compatible privilege elevation with Active Directory integration for enterprise environments.

# SEE ALSO

[sudo](/man/sudo)(8), [su](/man/su)(1)
