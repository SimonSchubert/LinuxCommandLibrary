# TLDR

**Edit file as root**

```sudoedit [/etc/hosts]```

**Edit with specific editor**

```SUDO_EDITOR=[vim] sudoedit [/etc/fstab]```

**Edit multiple files**

```sudoedit [/etc/file1] [/etc/file2]```

**Edit as another user**

```sudoedit -u [username] [file]```

# SYNOPSIS

**sudoedit** [_-u user_] [_options_] _files_

# PARAMETERS

**-u**, **--user** _USER_
> Edit as user.

**-g**, **--group** _GROUP_
> Edit with group.

**-H**
> Set HOME.

**-n**, **--non-interactive**
> Non-interactive mode.

# ENVIRONMENT

**SUDO_EDITOR** - Preferred editor
**VISUAL** - Visual editor
**EDITOR** - Default editor

# DESCRIPTION

**sudoedit** safely edits files with elevated privileges. It's equivalent to sudo -e.

File is copied to temp location. User edits with their own editor.

After editing, changes copy back. Original file replaced atomically.

User's environment is preserved. Editor runs as the user, not root.

Safer than running editor as root. Limits privilege escalation risks.

# CAVEATS

Editor plugins run as user. Some editors may not work. Temp files briefly exist.

# HISTORY

**sudoedit** is part of **sudo**, providing secure file editing. It prevents running arbitrary code with root privileges through editor extensions.

# SEE ALSO

[sudo](/man/sudo)(8), [visudo](/man/visudo)(8), [vi](/man/vi)(1)
