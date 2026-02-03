# TLDR

**Grant package access**

```pio access grant [maintainer] [user] [package]```

**Revoke access**

```pio access revoke [maintainer] [user] [package]```

**List access permissions**

```pio access list [package]```

# SYNOPSIS

**pio access** _command_ [_options_]

# PARAMETERS

**grant** _level_ _user_ _package_
> Grant access (guest, maintainer, admin).

**revoke** _level_ _user_ _package_
> Revoke access level.

**list** _package_
> List package permissions.

**private** _package_
> Make package private.

**public** _package_
> Make package public.

# DESCRIPTION

**pio access** manages access permissions for PlatformIO Registry packages. Controls who can view, download, and modify published packages. Requires PlatformIO account.

# SEE ALSO

[pio-account](/man/pio-account)(1), [pio-pkg](/man/pio-pkg)(1)

