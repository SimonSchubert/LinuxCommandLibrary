# TAGLINE

Command-line editor for the system hosts file

# TLDR

**List** all hosts entries

```hosts```

**Search** entries matching a string or regex

```hosts [localhost]```

**Add** an entry

```hosts add [127.0.0.1] [example.com]```

**Remove** an entry

```hosts remove [example.com]```

**Block** a domain (IPv4 and IPv6)

```hosts block [example.com]```

**Unblock** a domain

```hosts unblock [example.com]```

**Disable** (comment out) an entry

```hosts disable [example.com]```

**Enable** a disabled entry

```hosts enable [example.com]```

**Create a backup**

```hosts backups create```

# SYNOPSIS

**hosts** [*command*] [*args*]

# DESCRIPTION

**hosts** is a portable shell script for managing **/etc/hosts** (or the system hosts file): list and search entries, add/remove mappings, block/unblock domains, enable/disable lines by commenting, and maintain backups. It works with existing hosts files rather than replacing them.

Install via Homebrew (**xwmx/taps**), npm (**hosts.sh**), bpkg, **make install**, AUR, or by placing the script on **PATH**. Many operations need root privileges to write the system hosts file.

# PARAMETERS

*(no args)* / **list**

> List hosts file entries.

*pattern*

> Search entries matching a string or regular expression.

**add** *ip* *hostname*...

> Add a mapping.

**remove** *ip|host|regex*

> Remove matching entries (prompts for confirmation).

**block** / **unblock** *domain*

> Add or remove blocking entries for a domain.

**disable** / **enable** *entry*

> Comment or uncomment entries.

**backups** create|show|compare|...

> Backup management for the hosts file.

**completions install**

> Install shell completions (often needs sudo).

# CAVEATS

Editing the system hosts file usually requires **sudo**. Bad entries can break name resolution; keep backups. On some systems the hosts path differs; the script targets the platform default. Completions are optional when installing the script alone.

# INSTALL

```aur: yay -S hosts```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hostess](/man/hostess)(1), [getent](/man/getent)(1), [dig](/man/dig)(1)

# RESOURCES

```[Source code](https://github.com/xwmx/hosts)```

<!-- verified: 2026-07-19 -->
