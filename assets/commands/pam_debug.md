# TLDR

**Enable in PAM config**

```auth optional pam_debug.so```

**Enable with custom output**

```auth optional pam_debug.so auth=authinfo_unavail```

# SYNOPSIS

**pam_debug.so** [_options_]

# PARAMETERS

**auth=**_VALUE_
> Auth return value.

**cred=**_VALUE_
> Credential return value.

**acct=**_VALUE_
> Account return value.

**prechauthtok=**_VALUE_
> Pre-change authtoken value.

**chauthtok=**_VALUE_
> Change authtoken value.

**open_session=**_VALUE_
> Open session value.

**close_session=**_VALUE_
> Close session value.

# DESCRIPTION

**pam_debug** is a PAM debugging module. Forces specific return values.

The module aids PAM stack debugging. Not for production use.

pam_debug tests PAM configurations.

# CAVEATS

Development/testing only. Not for production. Can break authentication.

# HISTORY

pam_debug was created for **testing PAM configurations** during development.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5)

