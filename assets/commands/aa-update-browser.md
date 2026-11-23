# TAGLINE

Manage browser abstraction includes in AppArmor profiles

# TLDR

**List** available browser abstraction profiles

```sudo aa-update-browser -l```

Show what changes would be made **(dry-run)**

```sudo aa-update-browser -d -u [multimedia,productivity] [/etc/apparmor.d/usr.bin.firefox]```

**Update** a profile with specific abstractions

```sudo aa-update-browser -u [multimedia,productivity] [/etc/apparmor.d/usr.bin.firefox]```

**Reload** the profile afterwards to apply the change

```sudo apparmor_parser -r [/etc/apparmor.d/usr.bin.firefox]```

**Remove** all abstractions from a profile

```sudo aa-update-browser -u '' [path/to/profile]```

# SYNOPSIS

**aa-update-browser** [**-d**] [**-u** _abstractions_] _profile_ ...

**aa-update-browser** **-l**

# DESCRIPTION

**aa-update-browser** lists the browser abstractions in **/etc/apparmor.d/abstractions/ubuntu-browsers.d/** and updates browser profiles to use them. It looks for the profile's **#include <abstractions/ubuntu-browsers.d/...>** line and rewrites that included file with one include per requested abstraction (for example **java**, **kde**, **mailto**, **multimedia**, **productivity**, **text-editors**, **ubuntu-integration** or **user-files**). The profile file itself is not modified.

Browser abstractions provide pre-defined access rules for common browser operations, simplifying profile management.

# PARAMETERS

**-l**
> Show the supported browser abstractions.

**-d**
> Dry-run. Print the include file that would be written instead of writing it.

**-u** _ABSTRACTIONS_
> Update the given profile with the comma-separated list of ABSTRACTIONS. Specifying '' removes all abstractions.

**-h**
> Display help information.

# CAVEATS

The **plugins-common** abstraction is always added when the abstraction list is not empty. Running without **-u** (or with **-u ''**) empties the include file, removing all abstractions. The profile must already contain a **ubuntu-browsers.d** include line. Changes take effect only after the profile is reloaded. Modifying browser profiles may affect browser functionality; test in complain mode before enforcing.

# HISTORY

Written by Jamie Strandboge at **Canonical** in **2010**. It is a Debian/Ubuntu addition shipped in the **apparmor-utils** package, not part of the upstream AppArmor source tree.

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [apparmor_parser](/man/apparmor_parser)(8), [apparmor](/man/apparmor)(7)

# RESOURCES

```[Source code](https://salsa.debian.org/apparmor-team/apparmor)```

```[Homepage](https://apparmor.net/)```

<!-- verified: 2026-11-23 -->
