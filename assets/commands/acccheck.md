# TAGLINE

Windows SMB password dictionary attack tool

# TLDR

**Check** for blank passwords on a target

```acccheck -t [192.168.1.1]```

Use a **password list** against a single user

```acccheck -t [192.168.1.1] -u [administrator] -P [passwords.txt]```

Use **username and password lists**

```acccheck -t [192.168.1.1] -U [users.txt] -P [passwords.txt]```

Attack **multiple targets** from a file

```acccheck -T [targets.txt] -U [users.txt] -P [passwords.txt]```

Check with **verbose** output

```acccheck -t [192.168.1.1] -U [users.txt] -P [passwords.txt] -v```

# SYNOPSIS

**acccheck** [_-t target_ | _-T targetfile_] [_-u user_ | _-U userfile_] [_-p pass_ | _-P passfile_] [_-v_]

# DESCRIPTION

**acccheck** is a password dictionary attack tool designed specifically for Windows SMB authentication. It attempts to connect to the Windows IPC$ and ADMIN$ shares using provided credentials to identify valid username/password combinations.

The tool is useful during penetration testing to identify weak or default passwords on Windows systems. It can test single credentials or iterate through wordlists for both usernames and passwords.

# PARAMETERS

**-t** _target_
> Single target IP address.

**-T** _file_
> File containing list of target IPs.

**-u** _username_
> Single username to test.

**-U** _file_
> File containing list of usernames.

**-p** _password_
> Single password to test.

**-P** _file_
> File containing list of passwords.

**-v**
> Verbose mode (show all attempts).

# CAVEATS

Intended for authorized security testing only. Unauthorized access attempts are illegal. **acccheck** is a Perl wrapper around **smbclient**, so it depends on a working Samba client installation. Successful login pairs are appended to a file named **cracked** in the current working directory. Account lockout policies may trigger after multiple failed attempts, and the tool relies on SMB connectivity (ports 139/445).

# HISTORY

**acccheck** was written by Faisal Dean (Faiz) and released as part of various penetration testing tool collections. It became part of Kali Linux and other security-focused distributions for Windows network security assessments.

# SEE ALSO

[smbclient](/man/smbclient)(1), [hydra](/man/hydra)(1), [medusa](/man/medusa)(1), [nmap](/man/nmap)(1), [enum4linux](/man/enum4linux)(1), [crackmapexec](/man/crackmapexec)(1)
