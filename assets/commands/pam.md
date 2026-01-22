# TLDR

**Check PAM configuration**

```pam-auth-update```

**Test PAM authentication**

```pamtester [service] [user] authenticate```

**View PAM config**

```cat /etc/pam.d/[service]```

**Debug PAM**

```pam-auth-update --package```

# SYNOPSIS

**pam** modules configured in /etc/pam.d/

# PARAMETERS

Configuration files in /etc/pam.d/:

**auth**
> Authentication token verification.

**account**
> Account validation.

**password**
> Password update.

**session**
> Session setup/teardown.

# DESCRIPTION

**PAM** is Pluggable Authentication Modules. Framework for system authentication.

The system provides flexible authentication. Configured per-service.

PAM handles authentication.

# CAVEATS

Critical system component. Misconfiguration can lock out users. Test carefully.

# HISTORY

PAM was developed by **Sun Microsystems** as a pluggable authentication framework.

# SEE ALSO

[pam.conf](/man/pam.conf)(5), [pam.d](/man/pam.d)(5), [login](/man/login)(1)

