# TLDR

**Generate password hash**

```mkpasswd [password]```

**Generate with specific method**

```mkpasswd -m sha-512 [password]```

**Generate with salt**

```mkpasswd -S [salt] [password]```

**Generate random password**

```mkpasswd -l [16]```

**List available methods**

```mkpasswd -m help```

# SYNOPSIS

**mkpasswd** [_options_] [_password_]

# DESCRIPTION

**mkpasswd** generates password hashes suitable for /etc/shadow or similar uses. It can use various hashing algorithms and optionally generate random passwords.

The tool is useful for creating encrypted passwords for system configuration files and automated provisioning.

# PARAMETERS

**-m** _method_
> Hash method (sha-512, sha-256, md5, des).

**-S** _salt_
> Specify salt value.

**-R** _rounds_
> SHA rounds count.

**-l** _length_
> Generate random password of length.

**-s**, **--stdin**
> Read password from stdin.

**-5**
> Use MD5 (shortcut).

**-P** _fd_
> Read password from file descriptor.

# CAVEATS

Different versions have different options. whois package version differs from expect package. Strong methods recommended (sha-512). Avoid storing plaintext passwords.

# HISTORY

**mkpasswd** exists in multiple implementations. The whois package version is common on Debian/Ubuntu, while others may have the expect package version. Both provide password hashing but with different options.

# SEE ALSO

[passwd](/man/passwd)(1), [openssl](/man/openssl)(1), [crypt](/man/crypt)(3), [chpasswd](/man/chpasswd)(1)
