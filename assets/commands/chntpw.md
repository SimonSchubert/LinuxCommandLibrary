# TLDR

**List** all users in the SAM file

```chntpw -l [path/to/sam_file]```

**Edit** user interactively

```chntpw -u [username] [path/to/sam_file]```

Use chntpw **interactively**

```chntpw -i [path/to/sam_file]```

# SYNOPSIS

**chntpw** [_options_] _sam_file_ [_system_file_] [_security_file_]

# DESCRIPTION

**chntpw** is an offline Windows password and registry editor. It can reset local user passwords, promote users to administrator, unlock accounts, and edit the Windows registry directly.

The tool works by modifying the Windows SAM (Security Account Manager) database file while Windows is not running. This is typically done by booting from a Linux live CD.

# PARAMETERS

**-l**
> List users in the SAM file

**-u** _username_
> Select user to edit

**-i**
> Interactive mode with menu

**-e**
> Registry editor mode

**-L**
> Write names of changed files to /tmp/changed

# CAVEATS

Requires offline access to the Windows partition. Cannot reset Microsoft account passwords (cloud accounts). BitLocker-encrypted drives must be decrypted first. Always backup the SAM file before modifications.

# HISTORY

**chntpw** was created by Petter Nordahl-Hagen for recovering access to Windows systems. It has become a standard tool included in security-focused Linux distributions like Kali Linux.

# SEE ALSO

[reged](/man/reged)(1), [hivex](/man/hivex)(3)
