# TAGLINE

Manage SELinux user definitions and roles

# TLDR

**List** all SELinux users

```sudo semanage user -l```

**Add** a new SELinux user

```sudo semanage user -a -R "staff_r sysadm_r" newuser_u```

**Delete** a SELinux user

```sudo semanage user -d myuser_u```

**Modify** SELinux user roles

```sudo semanage user -m -R "staff_r" myuser_u```

Add user with **default level**

```sudo semanage user -a -R "staff_r" -L s0 newuser_u```

Add user with **MLS range**

```sudo semanage user -a -R "staff_r" -r s0-s0:c0.c1023 newuser_u```

List only **customized** users

```sudo semanage user -l -C```

# SYNOPSIS

**semanage user** [_options_] [_selinux_user_]

# DESCRIPTION

**semanage user** controls the mapping between an SELinux user and its roles and MLS/MCS levels. SELinux users are mapped to Linux users through semanage login.

# PARAMETERS

**-l, --list**
> List all SELinux users

**-a, --add**
> Add a new SELinux user

**-d, --delete**
> Delete a SELinux user

**-m, --modify**
> Modify an existing SELinux user

**-R, --roles ROLES**
> SELinux roles; quote multiple roles separated by spaces, or repeat **-R**

**-L, --level LEVEL**
> Specify default MLS/MCS level (default s0)

**-r, --range RANGE**
> MLS/MCS security range for the user (default s0)

**-P, --prefix PREFIX**
> Labeling prefix used by genhomedircon for home directory contexts (default user)

**-D, --deleteall**
> Remove all local customizations

**-E, --extract**
> Extract customizable commands, for use within a transaction

**-N, --noreload**
> Do not reload the policy after commit

**-S, --store STORE**
> Select an alternate SELinux policy store

**-C, --locallist**
> List only local customizations

**-n, --noheading**
> Suppress column headings in output

# CAVEATS

Requires root privileges. Changes to SELinux user definitions affect what roles users can transition to. SELinux must be enabled for changes to take effect.

# HISTORY

**semanage user** is part of **policycoreutils**, providing SELinux policy management tools for managing user contexts and role assignments.

# SEE ALSO

[semanage](/man/semanage)(8), [semanage-login](/man/semanage-login)(8), [seinfo](/man/seinfo)(1)

# RESOURCES

```[Source code](https://github.com/SELinuxProject/selinux)```

<!-- verified: 2026-11-08 -->
