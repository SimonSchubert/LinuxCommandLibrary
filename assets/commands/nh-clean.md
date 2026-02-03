# TLDR

**Clean user profile**

```nh clean user```

**Clean all profiles**

```nh clean all```

**Clean with age limit**

```nh clean all --keep [30d]```

**Dry run**

```nh clean all --dry```

# SYNOPSIS

**nh clean** _target_ [_options_]

# PARAMETERS

**user**
> Clean user profile.

**all**
> Clean all profiles.

**--keep** _period_
> Keep generations newer than period.

**--keep-since** _date_
> Keep generations since date.

**--dry**
> Dry run.

# DESCRIPTION

**nh clean** removes old Nix profile generations and runs garbage collection. Friendly wrapper around nix-collect-garbage. Part of nh (nix helper) toolkit.

# SEE ALSO

[nh](/man/nh)(1), [nix-collect-garbage](/man/nix-collect-garbage)(1)

