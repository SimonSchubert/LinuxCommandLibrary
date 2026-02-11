# TAGLINE

Safely edit sudoers configuration

# TLDR

**Edit sudoers file**

```sudo visudo```

**Edit specific file**

```sudo visudo -f [/etc/sudoers.d/custom]```

**Check syntax only**

```sudo visudo -c```

**Check specific file**

```sudo visudo -c -f [/etc/sudoers.d/custom]```

**Strict mode**

```sudo visudo -s```

# SYNOPSIS

**visudo** [_-c_] [_-f file_] [_-s_] [_options_]

# PARAMETERS

**-c**, **--check**
> Check syntax only.

**-f** _FILE_
> Edit specific file.

**-s**, **--strict**
> Strict syntax checking.

**-q**, **--quiet**
> Less verbose output.

**-h**, **--help**
> Show help.

**-V**, **--version**
> Show version.

# DESCRIPTION

**visudo** safely edits the sudoers file. It locks the file, validates syntax, and prevents saving invalid configurations.

Syntax validation is critical. A syntax error in sudoers can lock out all sudo access. visudo catches errors before saving.

The editor is determined by SUDO_EDITOR, VISUAL, or EDITOR environment variables. It defaults to vi.

The tool handles file locking. Multiple simultaneous edits are prevented, avoiding corruption from concurrent changes.

Drop-in files in /etc/sudoers.d/ can be edited with -f. These are included by the main sudoers file.

Check mode validates existing files without editing. It's useful for verifying configuration before deployment.

# CAVEATS

Requires root privileges. Editor must be trusted. Syntax errors are caught but logic errors aren't. Keep a root shell open when editing.

# HISTORY

**visudo** has been part of **sudo** since its early development by **Todd Miller**. It provides essential safety for editing the security-critical sudoers file.

# SEE ALSO

[sudo](/man/sudo)(8), [sudoers](/man/sudoers)(5), [su](/man/su)(1)
