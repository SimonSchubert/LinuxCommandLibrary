# TAGLINE

displays or changes user password expiration policy on systems using libuser

# TLDR

Display **password policy**

```sudo lchage --list [username]```

**Disable** password expiration

```sudo lchage --date -1 [username]```

Set **maximum password age**

```sudo lchage --maxdays [days] [username]```

Set **warning days** before expiry

```sudo lchage --warndays [days] [username]```

# SYNOPSIS

**lchage** [_options_] _username_

# DESCRIPTION

**lchage** displays or changes user password expiration policy on systems using libuser. It provides similar functionality to chage but uses the libuser library for user database access.

# PARAMETERS

**-l, --list**
> Display password aging information for the user

**-d, --date DAYS**
> Set last password change date (-1 to disable expiration)

**-M, --maxdays DAYS**
> Maximum days before password change required

**-W, --warndays DAYS**
> Days to warn before password expires

**-I, --inactive DAYS**
> Days after expiry before account is disabled

**-E, --expiredate DATE**
> Set account expiration date

# CAVEATS

Requires root privileges. Some options may not be available on all systems depending on authentication configuration.

# SEE ALSO

[chage](/man/chage)(1), [passwd](/man/passwd)(1), [usermod](/man/usermod)(8)
