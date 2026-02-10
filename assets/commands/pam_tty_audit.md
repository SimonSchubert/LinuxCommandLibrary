# TAGLINE

logs TTY keystrokes

# TLDR

**Enable TTY auditing**

```session required pam_tty_audit.so enable=*```

**Audit specific users**

```session required pam_tty_audit.so enable=admin,root```

**Disable for users**

```session required pam_tty_audit.so disable=service_account```

# SYNOPSIS

**pam_tty_audit.so** [_options_]

# PARAMETERS

**enable=**_USERS_
> Enable auditing for users.

**disable=**_USERS_
> Disable auditing for users.

**open_only**
> Audit session open only.

**log_password**
> Include password typing.

# DESCRIPTION

**pam_tty_audit** logs TTY keystrokes. Enables session auditing.

The module records terminal input. Requires audit daemon.

# CAVEATS

Requires auditd. Privacy implications. May log sensitive data.

# HISTORY

pam_tty_audit provides **keystroke auditing** for compliance requirements.

# SEE ALSO

[pam](/man/pam)(8), [auditd](/man/auditd)(8), [aureport](/man/aureport)(8)

