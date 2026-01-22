# TLDR

**Save** current configuration as a profile

```konsave -s [profile_name]```

**Apply** a profile

```konsave -a [profile_name]```

Save with **force** (overwrite existing)

```konsave -s [profile_name] -f```

**List** all profiles

```konsave -l```

**Remove** a profile

```konsave -r [profile_name]```

**Export** a profile to .knsv file

```konsave -e [profile_name]```

**Import** a .knsv profile

```konsave -i [path/to/profile.knsv]```

# SYNOPSIS

**konsave** [_options_] [_profile_name_]

# PARAMETERS

**-s**, **--save** _NAME_
> Save current configuration as named profile

**-a**, **--apply** _NAME_
> Apply a saved profile

**-l**, **--list**
> List all saved profiles

**-r**, **--remove** _NAME_
> Remove a profile

**-e**, **--export-profile** _NAME_
> Export profile to .knsv file

**-i**, **--import-profile** _FILE_
> Import profile from .knsv file

**-f**, **--force**
> Overwrite existing profile when saving

# DESCRIPTION

**konsave** saves and restores Linux desktop customizations, primarily for KDE Plasma but also supporting other configurations. It captures theme settings, icon packs, wallpapers, and other visual customizations.

Profiles can be exported and shared with others, making it easy to replicate desktop configurations across machines or share aesthetic setups with the community.

# CAVEATS

Designed primarily for KDE Plasma. Some configurations may not transfer perfectly between different system setups. Imported profiles may require additional packages for themes/icons.

# HISTORY

konsave was created to simplify the process of backing up, sharing, and switching between KDE Plasma desktop configurations, addressing a common need in the customization-focused Linux community.

# SEE ALSO

[plasma-apply-colorscheme](/man/plasma-apply-colorscheme)(1), [lookandfeeltool](/man/lookandfeeltool)(1)
