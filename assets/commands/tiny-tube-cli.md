# TAGLINE

Manage Tiny Tube users, roles, and API keys

# TLDR

**List** accounts in the server's store

```tiny-tube-cli users list```

**Promote** a user to administrator

```tiny-tube-cli users set-role --username [alice] --role [admin]```

Make someone an **editor** or a **viewer**

```tiny-tube-cli users set-role --username [alice] --role [editor]```

**Create** an API key (the secret is printed once)

```tiny-tube-cli users api-key --username [alice] --name [upload script]```

**List** key prefixes

```tiny-tube-cli users api-keys```

List keys for **one user**

```tiny-tube-cli users api-keys --username [alice]```

**Revoke** a key by its public prefix

```tiny-tube-cli users api-key-revoke --prefix [prefix]```

Use the **same files** as a server that does not run from this directory

```VIDEO_DIR=[/srv/videos] DB_PATH=[/srv/videos/tiny-tube.db] tiny-tube-cli users list```

# SYNOPSIS

**tiny-tube-cli** **users** **list**

**tiny-tube-cli** **users** **set-role** **--username** _name_ **--role** _role_

**tiny-tube-cli** **users** **api-key** **--username** _name_ [**--name** _label_]

**tiny-tube-cli** **users** **api-keys** [**--username** _name_]

**tiny-tube-cli** **users** **api-key-revoke** **--prefix** _prefix_

# PARAMETERS

**users list**
> Print username, role, active flag, auth source (`local` or LDAP), and display name. No arguments.

**users set-role** **--username** _name_ **--role** _role_
> Set the role to `admin`, `editor`, or `viewer`. The user must already exist. Demoting the last active administrator is refused.

**users api-key** **--username** _name_ [**--name** _label_]
> Create a long-lived API key for an existing user. Prints the secret once. `--name` is a label. When omitted, the label is the username.

**users api-keys** [**--username** _name_]
> Print each key's 12-character public prefix, username, label, and last-use time (`never` if unused). `--username` limits the list to one account.

**users api-key-revoke** **--prefix** _prefix_
> Delete the key with that public prefix. The prefix is the 12-character id from `users api-keys`, not the secret.

**--username** _name_
> Login name. Required for `set-role` and `api-key`. Optional filter for `api-keys`.

**--role** _role_
> `admin`, `editor`, or `viewer`. Required for `set-role`.

**--name** _label_
> Label stored next to a new key. Default is the username.

**--prefix** _prefix_
> Public key prefix. Required for `api-key-revoke`.

# DESCRIPTION

**tiny-tube-cli** is the operator tool shipped beside the **tiny-tube** server. It opens the same video directory and metadata store. It does not call the HTTP API and it does not listen on a port. Use it when `/admin` is unavailable and a role or an API key still has to change. Run it with the same working directory as the server, or with the same **VIDEO_DIR**, **STORE**, and **DB_PATH**, so it reads the `.env` and the database the server uses.

The grouped form is `users` plus a subcommand. The same actions exist as flat commands: `user-list`, `user-set-role`, `user-api-key`, `user-api-keys`, and `user-api-key-revoke`. A bare `user` is accepted as `users`. With no arguments, or with `users` and no subcommand, the tool prints usage and exits 2.

`users list` is read-only. `users set-role` writes the role on an existing row. It will not remove the last active administrator. The tool does not create, deactivate, or delete users. Those stay on the web admin page.

`users api-key` stores only a SHA-256 of the secret. The printed value starts with `tt-` and is shown once. Send it as `Authorization: Bearer` to **tiny-tube**. The key keeps the user's role, does not expire, and stops working if that user is deactivated or deleted. `users api-key-revoke` removes one key by the prefix `users api-keys` prints. Unknown commands and missing required flags exit with an error on stderr.

# CONFIGURATION

**VIDEO_DIR**
> Video storage directory. Default `videos`, resolved to an absolute path. Relative paths use the working directory.

**STORE**
> `sqlite` (default) or `fs`. Any other value is an error.

**DB_PATH**
> SQLite file when **STORE** is `sqlite`. Default is `tiny-tube.db` inside **VIDEO_DIR**.

A `.env` file in the working directory fills variables that are not already set. Values already in the environment are left as they are. The file may quote values. It does not expand variables.

# CAVEATS

**tiny-tube-cli** and **tiny-tube** must agree on the store. Pointing the CLI at an empty directory creates nothing useful and will not see the server's users. The CLI cannot mint the first administrator. That happens when **tiny-tube** starts against an empty user table with **ADMIN_PASS** set.

API key secrets cannot be printed again. Revoke the prefix and create another key. The revoke flag wants the 12-character prefix, not the full `tt-` secret. Role names outside `admin`, `editor`, and `viewer` are rejected. Usernames that the store rejects are rejected here too.

This binary is built from `./cmd/cli` and named `tiny-tube-cli` in release archives. `go run ./cmd/cli` is the same program from a source tree. The Windows `cli.bat` wrapper is not the Linux command.

# HISTORY

The administration CLI has been part of Tiny Tube release archives since **v1.0** (24 October 2026), next to the server binary. **v1.0.3** (27 October 2026) is the release this page describes. The project is MIT-licensed.

# SEE ALSO

[tiny-tube](/man/tiny-tube)(1), [sqlite3](/man/sqlite3)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/spapas/tiny-tube)```

```[Documentation](https://github.com/spapas/tiny-tube/blob/master/README.md)```

<!-- verified: 2026-10-28 -->
