# TAGLINE

change file access permissions

# TLDR

**Make** file executable

```chmod +x [script.sh]```

**Set** specific permissions

```chmod 755 [file]```

**Remove** write permission

```chmod -w [file]```

**Recursive** change

```chmod -R 755 [directory/]```

**Set** permissions symbolically

```chmod u=rwx,g=rx,o=r [file]```

# SYNOPSIS

**chmod** [_options_] _mode_ _file_...

# DESCRIPTION

**chmod** (change mode) modifies file access permissions. It controls read, write, and execute permissions for three classes of users: the file owner (user), the file's group, and all other users.

Permissions can be specified in two ways: numeric (octal) mode using digits 0-7, or symbolic mode using letters (u/g/o/a, +/-/=, r/w/x). Numeric mode sets all permissions at once, while symbolic mode allows adding or removing individual permissions. The command is fundamental to Unix file security and access control.

# PARAMETERS

**-R**, **--recursive**
> Change files and directories recursively

**-v**, **--verbose**
> Verbose output

**-c**, **--changes**
> Report only changes

**--reference=**_file_
> Use permissions from reference file

# NUMERIC MODE

Octal digits (0-7):
- **4** - Read (r)
- **2** - Write (w)
- **1** - Execute (x)

**Common modes:**
- **755** - rwxr-xr-x (owner full, others read/execute)
- **644** - rw-r--r-- (owner read/write, others read)
- **600** - rw------- (owner only)
- **777** - rwxrwxrwx (all permissions, usually bad idea)

# SYMBOLIC MODE

Format: **[ugoa][+-=][rwxXst]**

**Who:**
- **u** - User (owner)
- **g** - Group
- **o** - Others
- **a** - All

**Operation:**
- **+** - Add permission
- **-** - Remove permission
- **=** - Set exact permission

**Permissions:**
- **r** - Read
- **w** - Write
- **x** - Execute
- **X** - Execute only if directory
- **s** - Setuid/setgid
- **t** - Sticky bit

# WORKFLOW

```bash
# Make script executable
chmod +x script.sh

# Set standard file permissions
chmod 644 file.txt

# Set directory permissions
chmod 755 directory/

# Recursive change
chmod -R 755 public_html/

# Remove write for group and others
chmod go-w file.txt

# Add execute for all
chmod a+x program

# Set exact permissions
chmod u=rwx,g=rx,o= private_script
```

# SPECIAL MODES

**Setuid (4000):**
> Run as file owner

**Setgid (2000):**
> Run as file group or inherit directory group

**Sticky (1000):**
> Only owner can delete (common for /tmp)

Example: `chmod 4755 program` (setuid + rwxr-xr-x)

# CAVEATS

Requires ownership or root privileges. 777 permissions are security risk. Recursive changes can break systems. Symbolic links not affected (use chmod -h on some systems). Execute on files vs directories different meaning.

# HISTORY

**chmod** has been part of Unix since the early **1970s**, implementing the Unix permission model designed by Dennis Ritchie and Ken Thompson.

# SEE ALSO

[chown](/man/chown)(1), [chgrp](/man/chgrp)(1), [umask](/man/umask)(1), [ls](/man/ls)(1)
