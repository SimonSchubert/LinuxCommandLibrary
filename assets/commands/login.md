# TLDR

**Log in** as user

```login [user]```

Log in **without authentication**

```login -f [user]```

Log in **preserving environment**

```login -p [user]```

Log in from **remote host**

```login -h [host] [user]```

# SYNOPSIS

**login** [_options_] [_username_]

# DESCRIPTION

**login** initiates a user session on the system. It authenticates users, sets up the environment, and starts a shell. This command is typically invoked by init or a terminal program.

# PARAMETERS

**-f**
> Skip authentication (for preauthenticated users)

**-p**
> Preserve environment variables

**-h HOST**
> Specify remote hostname (for remote logins)

# CAVEATS

Direct invocation is restricted to root or when called from specific programs. The -f option is only available to root. PAM modules control authentication behavior.

# HISTORY

The login command dates back to the original Unix systems at Bell Labs in the **1970s**, providing the fundamental user authentication mechanism.

# SEE ALSO

[su](/man/su)(1), [sudo](/man/sudo)(8), [passwd](/man/passwd)(1), [getty](/man/getty)(8)
