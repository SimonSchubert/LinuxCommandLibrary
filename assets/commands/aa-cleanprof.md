# TAGLINE

Clean AppArmor profiles by removing redundant rules

# TLDR

Strip **redundant rules** from a profile

```sudo aa-cleanprof [profile_name]```

Clean **several profiles** in one run

```sudo aa-cleanprof [profile1] [profile2]```

Work on profiles kept **outside the system directory**

```sudo aa-cleanprof --dir [path/to/profiles] [profile_name]```

Skip the **confirmation prompts**

```sudo aa-cleanprof --silent [profile_name]```

Leave the **running policy untouched**, so the change applies on the next reload

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

# INSTALL

```apk: sudo apk add apparmor-utils```

```zypper: sudo zypper install apparmor-utils```

```nix: nix profile install nixpkgs#apparmor-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-genprof](/man/aa-genprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://gitlab.com/apparmor/apparmor)```

```[Homepage](https://apparmor.net/)```

```[Documentation](https://gitlab.com/apparmor/apparmor/-/wikis/home)```

<!-- verified: 2026-06-10 -->
