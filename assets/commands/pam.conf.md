# TAGLINE

Legacy PAM configuration file format where all services are configured in a single file

# TLDR

**Basic authentication entry**

```login auth required pam_unix.so```

**Account management entry**

```login account required pam_unix.so```

**Session entry**

```login session required pam_limits.so```

**Password entry**

```login password required pam_unix.so```

**Default rule** for services without their own entry

```other auth required pam_deny.so```

# SYNOPSIS

**/etc/pam.conf**

# PARAMETERS

**service**
> Application name. The reserved name **other** provides default rules.

**type**
> auth, account, password, session. A leading **-** suppresses logging if the module cannot be loaded.

**control**
> required, requisite, sufficient, optional, include, substack, or a [value=action ...] list.

**module**
> PAM module path, absolute or relative to the default module directory.

**arguments**
> Module arguments.

# DESCRIPTION

**pam.conf** is the legacy PAM configuration file format where all services are configured in a single file. Modern systems typically use the /etc/pam.d/ directory with per-service files instead; if that directory exists, Linux-PAM ignores /etc/pam.conf.

Each line defines a rule with the format: service type control module-path [arguments]. The first three tokens are case-insensitive, comments start with **#**, and a rule can be continued on the next line with a backslash.

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
include    - Include all lines of the type from the given file
substack   - Like include, but done/die only end the substack
```

The bracketed form maps return codes to actions, for example **[success=1 default=ignore]**. Actions are ignore, bad, die, ok, done, reset, or a number of modules to jump over.

# CAVEATS

/etc/pam.d/ preferred on modern systems, and /etc/pam.conf has no effect while that directory exists. Syntax errors can lock you out. Test with another root session.

# SEE ALSO

[pam.d](/man/pam.d)(5), [pam](/man/pam)(8), [pam_unix](/man/pam_unix)(8), [passwd](/man/passwd)(1), [sudo](/man/sudo)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man5/pam.conf.5.html)```

<!-- verified: 2026-11-09 -->
