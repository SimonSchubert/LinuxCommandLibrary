# TAGLINE

Create or change VNC password files

# TLDR

**Set VNC password for current user (interactive prompt)**

```vncpasswd```

**Set password to a specific file**

```vncpasswd [~/.vnc/passwd]```

**Create password from stdin using filter mode**

```echo "[password]" | vncpasswd -f > [~/.vnc/passwd]```

**Set both full-control and view-only passwords from stdin**

```printf "[password]\n[viewpassword]\n" | vncpasswd -f > [~/.vnc/passwd]```

# SYNOPSIS

**vncpasswd** [_options_] [_passwd-file_]

# PARAMETERS

**-f**
> Filter mode: read plain-text password from stdin, write encrypted version to stdout. Short or empty passwords are silently accepted in this mode.

_passwd-file_
> Path to the password file. Defaults to $XDG_CONFIG_HOME/tigervnc/passwd or ~/.vnc/passwd depending on VNC implementation.

# DESCRIPTION

**vncpasswd** creates or changes VNC password files used by VNC servers for authentication. When run without arguments, it prompts for a password and stores it in ~/.vnc/passwd.

Passwords must be at least 6 characters in interactive mode (the -f filter mode accepts any length). Only the first 8 characters are significant due to the DES-based encoding used. The stored password is obfuscated but not securely encrypted.

The filter mode (-f) reads plain-text passwords from stdin and outputs encrypted versions to stdout, useful for scripted password file creation. Up to two passwords can be provided separated by newlines: the first for full-control and the second for view-only access.

# SECURITY

Password files are set to owner read/write only (600). The obfuscation is weak; anyone with file access can recover the password. Network authentication uses challenge-response, protecting against network sniffing.

# CAVEATS

Only first 8 characters matter. Password obfuscation is not secure encryption. File permissions are critical for security. Different VNC implementations may have slightly different vncpasswd tools.

# HISTORY

**vncpasswd** originated with the original AT&T VNC (Virtual Network Computing) implementation. Various VNC implementations (TightVNC, TigerVNC, RealVNC) include their own versions with minor variations but compatible password file formats.

# SEE ALSO

[vncserver](/man/vncserver)(1), [vncviewer](/man/vncviewer)(1), [x11vnc](/man/x11vnc)(1), [Xvnc](/man/Xvnc)(1)
