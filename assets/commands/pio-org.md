# TAGLINE

manages PlatformIO organizations for team collaboration

# TLDR

**Create organization**

```pio org create [orgname]```

**List organizations**

```pio org list```

**Add owner**

```pio org add [orgname] [username]```

**Remove owner**

```pio org remove [orgname] [username]```

# SYNOPSIS

**pio org** _command_ [_options_]

# PARAMETERS

**create** _name_
> Create organization.

**destroy** _name_
> Delete organization.

**list**
> List organizations.

**add** _org_ _user_
> Add a user as an owner.

**remove** _org_ _user_
> Remove an owner.

**--email** _address_
> Organization e-mail, used with **create**.

**--displayname** _name_
> Organization display name, used with **create**.

**update** _org_
> Update organization.

# DESCRIPTION

**pio org** manages PlatformIO organizations for team collaboration. Organizations share packages, libraries, and access permissions. Requires PlatformIO account.

# SEE ALSO

[pio-account](/man/pio-account)(1), [pio-team](/man/pio-team)(1)

# RESOURCES

```[Source code](https://github.com/platformio/platformio-core)```

```[Documentation](https://docs.platformio.org/en/latest/core/userguide/org/index.html)```

<!-- verified: 2026-11-08 -->
