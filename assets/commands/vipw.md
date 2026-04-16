# TAGLINE

Safely edit password files with locking

# TLDR

Edit **password** file (/etc/passwd)

```sudo vipw```

Edit **shadow** password file (/etc/shadow)

```sudo vipw -s```

Edit the **group** file (/etc/group)

```sudo vipw -g```

Display **version**

```vipw -V```

# SYNOPSIS

**vipw** [_OPTIONS_]

# PARAMETERS

**-g, --group**
> Edit the group file (/etc/group). Equivalent to invoking as `vigr`.

**-p, --passwd**
> Edit the passwd file (default).

**-s, --shadow**
> Edit the shadow password file (/etc/shadow) or shadow group file (/etc/gshadow) when combined with -g.

**-q, --quiet**
> Quiet mode.

**-h, --help**
> Display help and exit.

**-V, --version**
> Display version information.

# DESCRIPTION

**vipw** safely edits the password file (/etc/passwd). It locks the file to prevent simultaneous edits, runs an editor, and validates the file format before saving.

Using vipw instead of directly editing the password file prevents corruption from concurrent access and syntax errors.

# CAVEATS

Requires root privileges. Uses EDITOR or VISUAL environment variable for editor selection. File is locked during editing. Use vigr for group file editing.

# SEE ALSO

[vigr](/man/vigr)(8), [passwd](/man/passwd)(1), [useradd](/man/useradd)(8), [usermod](/man/usermod)(8)
