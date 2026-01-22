# TLDR

Edit **password** file

```vipw```

Display **version**

```vipw -V```

# SYNOPSIS

**vipw** [_OPTIONS_]

# PARAMETERS

**-V, --version**
> Display version information

**-s, --shadow**
> Edit the shadow password file

# DESCRIPTION

**vipw** safely edits the password file (/etc/passwd). It locks the file to prevent simultaneous edits, runs an editor, and validates the file format before saving.

Using vipw instead of directly editing the password file prevents corruption from concurrent access and syntax errors.

# CAVEATS

Requires root privileges. Uses EDITOR or VISUAL environment variable for editor selection. File is locked during editing. Use vigr for group file editing.

# SEE ALSO

[vigr](/man/vigr)(8), [passwd](/man/passwd)(5), [shadow](/man/shadow)(5)
