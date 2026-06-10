# TAGLINE

Manage browser abstraction includes in AppArmor profiles

# TLDR

**List** available browser abstraction profiles

```sudo aa-update-browser -l```

Show what changes would be made **(dry-run)**

```sudo aa-update-browser -d [path/to/profile]```

**Update** a profile with specific abstractions

```sudo aa-update-browser -u [abstraction1,abstraction2] [path/to/profile]```

**Remove** all abstractions from a profile

```sudo aa-update-browser -u '' [path/to/profile]```

# SYNOPSIS

**aa-update-browser** [_option_] _profile_

# DESCRIPTION

**aa-update-browser** updates AppArmor browser profiles to use supported abstractions. This utility helps maintain browser profiles by allowing administrators to add, modify, or remove browser-specific abstraction includes.

Browser abstractions provide pre-defined access rules for common browser operations, simplifying profile management.

# PARAMETERS

**-l**
> Show the supported browser abstractions.

**-d**
> Dry-run. Only show what would be done to the given profile without applying changes.

**-u** _ABSTRACTIONS_
> Update the given profile with the comma-separated list of ABSTRACTIONS. Specifying '' removes all abstractions.

**-h**
> Display help information.

# CAVEATS

Modifying browser profiles may affect browser functionality. Test changes in complain mode before enforcing.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://gitlab.com/apparmor/apparmor)```

```[Homepage](https://apparmor.net/)```

```[Documentation](https://gitlab.com/apparmor/apparmor/-/wikis/home)```

<!-- verified: 2026-06-10 -->
