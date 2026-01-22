# TLDR

**Standard Unix authentication**

```auth required pam_unix.so```

**Password management**

```password required pam_unix.so sha512 shadow```

**Session management**

```session required pam_unix.so```

**Null password check**

```auth required pam_unix.so nullok```

# SYNOPSIS

**pam_unix.so** [_options_]

# PARAMETERS

**nullok**
> Allow empty passwords.

**sha512**
> Use SHA-512 hashing.

**shadow**
> Use shadow passwords.

**remember=**_N_
> Remember N passwords.

**try_first_pass**
> Use previous password.

# DESCRIPTION

**pam_unix** provides standard Unix authentication. Uses /etc/passwd and shadow.

The module handles basic auth. Core PAM component.

pam_unix is standard Unix auth.

# CAVEATS

Core PAM module. Configuration critical. Hash algorithm choice.

# HISTORY

pam_unix provides **traditional Unix authentication** via passwd/shadow.

# SEE ALSO

[pam](/man/pam)(8), [passwd](/man/passwd)(5), [shadow](/man/shadow)(5)

