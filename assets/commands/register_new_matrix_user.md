# TAGLINE

Create users on Matrix homeserver

# TLDR

Create a user **interactively**

```register_new_matrix_user --config path/to/homeserver.yaml```

Create an **admin user** interactively

```register_new_matrix_user --config path/to/homeserver.yaml --admin```

Create admin user **non-interactively**

```register_new_matrix_user --config path/to/homeserver.yaml --user username --password password --admin```

# SYNOPSIS

**register_new_matrix_user** [_options_]

# PARAMETERS

**--config** _file_
> Path to Synapse homeserver.yaml configuration

**--user** _name_
> Username for the new account

**--password** _password_
> Password for the new account

**--admin**
> Create an administrator account

# DESCRIPTION

**register_new_matrix_user** registers new users on a Matrix homeserver when open registration has been disabled. It reads the shared secret from the homeserver configuration to authorize user creation.

This is the official way to create users on a Synapse server with closed registration.

# CONFIGURATION

**homeserver.yaml**
> Synapse homeserver configuration file containing the **registration_shared_secret** used to authorize user creation. Path specified with **--config**.

# CAVEATS

Requires access to the homeserver.yaml configuration file. Non-interactive mode exposes passwords in shell history; use interactive mode for security.

# HISTORY

Part of **Synapse**, the reference Matrix homeserver implementation. Provides administrative user management.

# SEE ALSO

[synctl](/man/synctl)(1)
