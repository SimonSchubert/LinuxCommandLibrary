# TLDR

**Basic authentication entry**

```login auth required pam_unix.so```

**Account management entry**

```login account required pam_unix.so```

**Session entry**

```login session required pam_limits.so```

**Password entry**

```login password required pam_unix.so```

# SYNOPSIS

**/etc/pam.conf**

# PARAMETERS

**service**
> Application name.

**type**
> auth, account, password, session.

**control**
> required, requisite, sufficient, optional.

**module**
> PAM module path.

**arguments**
> Module arguments.

# DESCRIPTION

**pam.conf** is the legacy PAM configuration file format where all services are configured in a single file. Modern systems typically use /etc/pam.d/ directory with per-service files.

Each line defines a rule: service type control module arguments.

# EXAMPLE

```
# /etc/pam.conf
login   auth       required   pam_securetty.so
login   auth       required   pam_unix.so
login   account    required   pam_unix.so
login   session    required   pam_limits.so
login   password   required   pam_unix.so

other   auth       required   pam_deny.so
other   account    required   pam_deny.so
```

# CONTROL FLAGS

```
required   - Must succeed, continue checking
requisite  - Must succeed, fail immediately if not
sufficient - Success ends checking, failure continues
optional   - Result ignored unless only module
```

# CAVEATS

/etc/pam.d/ preferred on modern systems. Syntax errors can lock you out. Test with another root session.

# SEE ALSO

[pam.d](/man/pam.d)(5), [pam](/man/pam)(8), [pam_unix](/man/pam_unix)(8)
