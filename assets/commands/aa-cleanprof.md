# TLDR

**Clean** a profile to remove unused rules

```sudo aa-cleanprof [profile_name]```

Clean **multiple profiles** at once

```sudo aa-cleanprof [profile1] [profile2]```

Specify the **directory** containing profiles

```sudo aa-cleanprof -d /path/to/profiles [profile_name]```

Run **silently** without prompts

```sudo aa-cleanprof -s [profile_name]```

Prevent profile **reload** after cleaning

```sudo aa-cleanprof --no-reload [profile_name]```

# SYNOPSIS

**aa-cleanprof** _executable_ [_executable_ ...] [_-d /path/to/profiles_] [_--no-reload_] [_-s_]

# DESCRIPTION

**aa-cleanprof** removes superfluous rules from AppArmor security profiles, including rules that are already covered by an include directive or another rule. The utility also reorders rules to group similar ones together and removes all comments from the profile file.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the directory containing AppArmor profiles; defaults to /etc/apparmor.d

**--no-reload**
> Prevents the profile from being reloaded after modifications

**-s, --silent**
> Automatically overwrites the profile without prompting the user

**-h, --help**
> Display help information

# CAVEATS

This utility removes all comments from profile files, which may eliminate useful documentation or notes within the profiles.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [aa-genprof](/man/aa-genprof)(8), [apparmor](/man/apparmor)(7)
