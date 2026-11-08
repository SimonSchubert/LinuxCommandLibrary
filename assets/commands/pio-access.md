# TAGLINE

manages access permissions for PlatformIO Registry packages

# TLDR

**Grant package access**

```pio access grant [maintainer] [username|orgname:teamname] [urn]```

**Revoke access**

```pio access revoke [username|orgname:teamname] [urn]```

**List access permissions**

```pio access list```

# SYNOPSIS

**pio access** _command_ [_options_]

# PARAMETERS

**grant** _level_ _user|org:team_ _urn_
> Grant access (guest, maintainer, admin) to a user or team.

**revoke** _user|org:team_ _urn_
> Remove access from a user or team.

**list** [_owner_]
> List resources and their permissions.

**private** _urn_
> Make a resource private.

**public** _urn_
> Make a resource public.

**--urn-type** _type_
> Resource type in URN form (default prn:reg:pkg).

# DESCRIPTION

**pio access** manages access permissions for PlatformIO Registry packages. Controls who can view, download, and modify published packages. Requires PlatformIO account.

# SEE ALSO

[pio-account](/man/pio-account)(1), [pio-pkg](/man/pio-pkg)(1)

# RESOURCES

```[Source code](https://github.com/platformio/platformio-core)```

```[Documentation](https://docs.platformio.org/en/latest/core/userguide/access/index.html)```

<!-- verified: 2026-11-08 -->
