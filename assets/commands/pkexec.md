# TAGLINE

Execute programs with PolicyKit privilege escalation

# TLDR

Run command as **root**

```pkexec [command]```

Switch to **root** shell

```pkexec```

Run as **specific user**

```pkexec --user [username] [command]```

# SYNOPSIS

**pkexec** [**--user** _username_] [**--disable-internal-agent**] [_command_] [_arguments_...]

# PARAMETERS

**--user _username_**
> Run as specified user instead of root

**--disable-internal-agent**
> Don't use built-in authentication agent

**--keep-cwd**
> Keep current working directory

# DESCRIPTION

**pkexec** executes programs as another user with privilege escalation via PolicyKit. Unlike sudo, it integrates with the desktop environment and can show graphical authentication dialogs when available.

Authorization decisions are based on PolicyKit policies, allowing fine-grained control over which users can run which programs with elevated privileges. Actions can be configured to require authentication or be allowed without it.

# CONFIGURATION

**/usr/share/polkit-1/actions/**
> PolicyKit action definition files controlling authorization rules.

**/etc/polkit-1/rules.d/**
> Local authorization rules that override default policies.

# CAVEATS

Requires polkitd daemon running. Graphical prompt needs authentication agent (often desktop-environment specific). Environment is sanitized by default. Not a drop-in sudo replacement.

# HISTORY

**pkexec** is part of **PolicyKit** (polkit), developed by **David Zeuthen** at Red Hat. It provides a modern privilege escalation mechanism that integrates with desktop environments and supports fine-grained authorization policies.

# SEE ALSO

[sudo](/man/sudo)(8), [doas](/man/doas)(1), [run0](/man/run0)(1), [polkit](/man/polkit)(8)
