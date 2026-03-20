# TAGLINE

Map Linux users to SELinux users

# TLDR

**List** all login mappings

```sudo semanage login -l```

**Add** a login mapping (Linux user to SELinux user)

```sudo semanage login -a -s selinux_user linux_username```

**Delete** a login mapping

```sudo semanage login -d linux_username```

**Modify** an existing mapping

```sudo semanage login -m -s selinux_user linux_username```

Add with **MLS/MCS range**

```sudo semanage login -a -s user_u -r s0-s0:c0.c1023 linux_username```

List only **customized** mappings

```sudo semanage login -l -C```

# SYNOPSIS

**semanage login** [_options_]

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
> MLS/MCS security range (e.g., s0-s0:c0.c1023).

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
> Extract customizable commands.

# DESCRIPTION

**semanage login** manages mappings between Linux users and SELinux users. When a Linux user logs in, this mapping determines their SELinux security context.

Different SELinux users have different roles and permissions, allowing fine-grained access control. Prefix the Linux user name with **%** to indicate a group mapping (e.g., **%wheel**).

# CAVEATS

Changes affect new login sessions. Existing sessions retain their original context.

# HISTORY

Part of **policycoreutils**, providing SELinux policy management tools.

# SEE ALSO

[semanage](/man/semanage)(8), [semanage-user](/man/semanage-user)(8), [semanage-fcontext](/man/semanage-fcontext)(8), [sestatus](/man/sestatus)(8)
