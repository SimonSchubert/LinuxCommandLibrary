# TAGLINE

restricts su to wheel group

# TLDR

**Require wheel group for su**

```auth required pam_wheel.so```

**Require wheel for root**

```auth required pam_wheel.so root_only```

**Use specific group**

```auth required pam_wheel.so group=admin```

**Trust wheel members**

```auth sufficient pam_wheel.so trust```

# SYNOPSIS

**pam_wheel.so** [_options_]

# PARAMETERS

**root_only**
> Only apply for su to root.

**group=**_NAME_
> Use alternate group.

**trust**
> Trust group members (no password).

**deny**
> Deny access to group members.

# DESCRIPTION

**pam_wheel** restricts su to wheel group. Controls root access.

The module requires group membership. Traditional Unix security.

# CAVEATS

Auth module. Wheel group required. BSD-style security.

# HISTORY

pam_wheel provides **wheel group restriction** for su command access.

# SEE ALSO

[pam](/man/pam)(8), [su](/man/su)(1), [pam_rootok](/man/pam_rootok)(8)

