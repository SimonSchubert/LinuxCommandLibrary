# TAGLINE

Map Linux users to SELinux users

# TLDR

**List** all login mappings

```sudo semanage login -l```

**Add** a login mapping (Linux user to SELinux user)

```sudo semanage login -a -s [selinux_user] [linux_username]```

Map a whole **Linux group**

```sudo semanage login -a -s [staff_u] %[group_name]```

Set the **default** SELinux user for unmapped logins

```sudo semanage login -m -s [user_u] __default__```

**Delete** a login mapping

```sudo semanage login -d [linux_username]```

**Modify** an existing mapping

```sudo semanage login -m -s [selinux_user] [linux_username]```

Add with **MLS/MCS range**

```sudo semanage login -a -s [user_u] -r [s0-s0:c0.c1023] [linux_username]```

List only **customized** mappings

```sudo semanage login -l -C```

# SYNOPSIS

**semanage login** [_-h_] [_-n_] [_-N_] [_-S STORE_] [**-a** _-s SEUSER_ _-r RANGE_ _LOGIN_ | **-d** _LOGIN_ | **-D** | **-E** | **-l** [_-C_] | **-m** _-s SEUSER_ _-r RANGE_ _LOGIN_]

# PARAMETERS

**-l**, **--list**
> List login mappings.

**-a**, **--add**
> Add a new login mapping.

**-d**, **--delete**
> Delete a login mapping.

**-m**, **--modify**
> Modify an existing login mapping.

**-s**, **--seuser** _user_
> SELinux user to map to.

**-r**, **--range** _range_
> MLS/MCS security range (e.g., s0-s0:c0.c1023). Defaults to the range of the SELinux user record.

**-C**, **--locallist**
> Show only local customizations.

**-n**, **--noheading**
> Do not print heading when listing.

**-N**, **--noreload**
> Do not reload policy after commit.

**-S** _STORE_, **--store** _STORE_
> Select an alternate SELinux policy store to manage.

**-D**, **--deleteall**
> Remove all local customizations.

**-E**, **--extract**
> Extract customizable commands, for use within a transaction.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**semanage login** manages mappings between Linux users and SELinux users. When a Linux user logs in, this mapping determines their SELinux security context.

Different SELinux users have different roles and permissions, allowing fine-grained access control. Prefix the Linux user name with **%** to indicate a group mapping (e.g., **%wheel**). The special login **__default__** applies to users without a specific mapping.

# CAVEATS

Changes affect new login sessions. Existing sessions retain their original context. **-r** is only meaningful on MLS/MCS systems. The tool ships in a separate package from the base SELinux utilities on some distributions.

# SEE ALSO

[semanage](/man/semanage)(8), [semanage-user](/man/semanage-user)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [sestatus](/man/sestatus)(8)

# RESOURCES

```[Source code](https://github.com/SELinuxProject/selinux)```

<!-- verified: 2026-11-09 -->
