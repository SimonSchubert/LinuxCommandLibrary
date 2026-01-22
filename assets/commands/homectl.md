# TLDR

**List** user accounts and home directories

```homectl list```

**Create** a user account and home directory

```sudo homectl create [username]```

**Remove** a user and associated home directory

```sudo homectl remove [username]```

Change **password** for a user

```sudo homectl passwd [username]```

Run a shell or command with access to a **specific home**

```sudo homectl with [username] -- [command]```

**Lock or unlock** a home directory

```sudo homectl lock [username]```

Change **disk space** assigned to a home directory

```sudo homectl resize [username] 100G```

Display **help**

```homectl -h```

# SYNOPSIS

**homectl** [_command_] [_options_] [_user_]

# PARAMETERS

**list**
> List managed home directories

**create** _USER_
> Create new user with home directory

**remove** _USER_
> Remove user and home directory

**passwd** _USER_
> Change user password

**with** _USER_ **--** _CMD_
> Run command with access to user's home

**lock** _USER_
> Lock home directory (deactivate)

**unlock** _USER_
> Unlock home directory (activate)

**resize** _USER_ _SIZE_
> Change home directory size

**inspect** _USER_
> Show user record details

**update** _USER_
> Update user properties

**--storage=**_TYPE_
> Storage type: luks, directory, subvolume, fscrypt, cifs

# DESCRIPTION

**homectl** manages user accounts and home directories via systemd-homed, a systemd service that provides portable, encrypted home directories.

systemd-homed stores user accounts as self-contained records with their home directories. Home directories can be encrypted (LUKS), enabling security features like automatic locking on suspend and portable home directories that can be moved between machines.

Features include:
- Encrypted home directories
- Automatic locking on suspend/idle
- Disk quota management
- Portable home directories

# CAVEATS

Requires systemd-homed service. Not compatible with traditional /etc/passwd management. Some services may not work correctly with homed users. LUKS homes require unlocking at login.

# HISTORY

homectl and systemd-homed were introduced in systemd 245 (**2020**) by Lennart Poettering. They represent a modern approach to Linux user management with built-in encryption and portability features.

# SEE ALSO

[useradd](/man/useradd)(8), [usermod](/man/usermod)(8), [loginctl](/man/loginctl)(1), [systemd-homed](/man/systemd-homed)(8)
