# TLDR

**Create a new password file** with a user

```htpasswd -c [path/to/.htpasswd] [username]```

**Add or update a user** in existing file

```htpasswd [path/to/.htpasswd] [username]```

**Add user with password** on command line (insecure)

```htpasswd -b [path/to/.htpasswd] [username] [password]```

**Delete a user** from the file

```htpasswd -D [path/to/.htpasswd] [username]```

**Verify a user's password**

```htpasswd -v [path/to/.htpasswd] [username]```

**Use bcrypt** encryption (more secure)

```htpasswd -B [path/to/.htpasswd] [username]```

**Display password hash** without updating file

```htpasswd -n [username]```

**Create file using SHA** encryption

```htpasswd -c -s [path/to/.htpasswd] [username]```

# SYNOPSIS

**htpasswd** [_-cimBdpsDv_] [_-C cost_] _passwordfile_ _username_ [_password_]

# PARAMETERS

**-c**
> Create a new file (overwrites existing).

**-n**
> Display results on stdout, don't update file.

**-b**
> Use password from command line (batch mode, insecure).

**-i**
> Read password from stdin without verification.

**-m**
> Use MD5 encryption (default on most systems).

**-B**
> Use bcrypt encryption (most secure).

**-C** _cost_
> Set bcrypt cost (4-17, default 5, higher = slower).

**-d**
> Use crypt() encryption (insecure, limited to 8 chars).

**-s**
> Use SHA encryption (insecure).

**-p**
> Use plaintext (insecure, for testing only).

**-D**
> Delete the specified user.

**-v**
> Verify password for user.

# DESCRIPTION

**htpasswd** manages user authentication files for Apache HTTP Server's basic authentication. It creates and updates flat-file databases containing usernames and encrypted passwords used with **.htaccess** or Apache configuration directives.

The password file format is simple: one line per user with **username:encrypted_password**. Apache's mod_auth_basic reads this file to authenticate requests. The file should be stored outside the web root and have restrictive permissions.

Password encryption defaults to MD5-based algorithm (prefixed with $apr1$). The **-B** flag enables bcrypt, which is more resistant to brute-force attacks and recommended for new installations. The cost factor (-C) controls bcrypt's computational intensity.

For non-interactive use in scripts, **-b** allows specifying the password on the command line, though this exposes the password in process lists. The **-i** flag reads from stdin, which is safer for scripting.

The tool is often used with Nginx as well, since Nginx can read Apache-format password files for basic authentication.

# CAVEATS

The -b flag exposes passwords in process listings. Basic authentication sends credentials in base64 (not encrypted) - always use with HTTPS. Old algorithms (crypt, SHA, plaintext) are insecure. File permissions must be restrictive. Not for high-security applications.

# HISTORY

**htpasswd** has been part of the Apache HTTP Server project since its early days in the mid-1990s. It evolved from NCSA HTTPd's password management tools. The bcrypt option was added later as password security requirements increased. The tool remains the standard for managing Apache basic auth despite the availability of more sophisticated authentication methods.

# SEE ALSO

[apache2](/man/apache2)(8), [nginx](/man/nginx)(8), [openssl](/man/openssl)(1), [htdigest](/man/htdigest)(1)
